package DoublyLinkedList;
import java.util.Iterator;

class DoublyLinkedList<T> implements LinkedListInterface<T>, Iterable<T> {

   DoublyNode<T> head;
   DoublyNode<T> tail;
   int size = 0;

   public DoublyLinkedList(DoublyNode<T> node) {
      this.head = node;
      this.tail = node;
      size = 1;
   }

   public DoublyLinkedList() {
      head = null;
      tail = null;
      size = 0;
   }

   public void add(T data) {
      DoublyNode<T> node = new DoublyNode<T>(data, null, null);
      System.out.println("ADD| Adding node with data " + data + " to the head");
      if (size == 0) {
         head = node;
         tail = node;
         size++;
      } else {
         head.prev = node;
         node.next = head;
         head = node;
         size++;
      }
   }

   public void add(DoublyNode<T> node) {
      System.out.println("ADD| Adding a node to the list");
      if (size == 0) {
         head = node;
         tail = node;
         size++;
      } else {
         node.next = head;
         head = node;
         size++;
      }
   }

   public T get(int pos) {
      DoublyNode<T> current = head;
      int counter = 1;
      while (current != null) {
         if (counter == pos) {
            System.out.println("GET| The data of the node at position " + pos + " is " + current.getData());
            return current.getData();
         }
         current = current.next;
         counter++;
      }
      System.out.println("GET| Index out of bounds");
      return null;
   }

   public void remove(int pos) {
      if (pos == 1) {
         head = head.next;
         head.prev = null;
         size--;
         System.out.println("REMOVE| ELement removed");
      } else if (pos == size) {
         tail = tail.prev;
         tail.next = null;
         size--;
         System.out.println("REMOVE| ELement removed");
      } else {
         int counter = 1;
         DoublyNode<T> node = head;
         DoublyNode<T> prevNode;
         while (counter + 1 < pos) {
            node = node.next;
            counter++;
         }
         node.next = node.next.next;
         prevNode = node;
         node = node.next;
         node.prev = prevNode;
         size--;
         System.out.println("REMOVE| Element at position " + pos + " is removed");
      }
   }

   public void remove(T data) {
      if (size != 0) {
         DoublyNode<T> node = head;
         DoublyNode<T> prevNode;
         if (node.data == data) {
            head = head.next;
            head.prev = null;
            size--;
            return;
         }
         while (node.next.data!=data) {
            node = node.next;
            if (node.next.next == null && node.next.data == data) {
               tail = tail.prev;
               tail.next = null;
               size--;
               return;
            }
         }
         node.next = node.next.next;
         prevNode = node;
         node = node.next;
         node.prev = prevNode;
      }
   }

   public boolean isEmpty() {
      System.out.println("EMPTY| Is the list empty -> " + (size == 0));
      return size == 0;
   }


   public int search(T data) {
      DoublyNode<T> current = head;
      int counter = 1;
      if (head == null) {
         System.out.println("SEARCH| There is no such element");
         return -1;
      } else {
         while (current != null) {
            if (current.getData().equals(data)) {
               System.out.println("SEARCH| The element is at position " + counter);
               return counter;
            }
            current = current.next;
            counter++;
         }
      }
      System.out.println("SEARCH| There is no such element");
      return -1;

      /**
       * public void search(T data) {
       * DoublyNode<T> node = head;
       * for (int i = 1; i <=size; i++) {
       *    if (node.data == data) {
       *    return i;
       *    } else {
       *    node = node.next;
       *    }
       * }
       * return -1;
       * }
       * 
       */
   }


   public int size() {
      System.out.println("SIZE| The size is " + size);
      return size;
   }

   @Override
   public Object[] toArray() {
      Object[] array = new Object[size];
      DoublyNode<T> node = head;
      for (int i = 0; i < size; i++) {
         array[i] = node;
         node = node.next;
      }
      return array;
   }


   public void clear() {
      System.out.println("CLEAR| The list has been cleared");
      head = null;
      tail = null;
   }

   @Override
   public Iterator<T> iterator() {

      Iterator<T> iter = new Iterator<T>() {
         DoublyNode<T> node = new DoublyNode<T>(null, head, null);

         public boolean hasNext() {
            return node.next != null;
         }

         public T next() {
            node = node.next;
            return node.getData();
         }
      };
      return iter;
   }

}