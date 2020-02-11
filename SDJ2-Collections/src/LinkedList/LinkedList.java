package LinkedList;
import java.util.Iterator;

class LinkedList<T> implements LinkedListInterface<T>, Iterable<T> {

   Node<T> head;
   Node<T> tail;
   int size = 0;

   public LinkedList(Node<T> node) {
      this.head = node;
      this.tail = node;
      size = 1;
   }

   public LinkedList() {
      head = null;
      tail = null;
      size = 0;
   }

   public void add(T data) {
      Node<T> node = new Node<T>(data);
      System.out.println("ADD| Adding node with data " + data);
      if (size == 0) {
         head = node;
         tail = node;
         size++;
      } else {
         tail.next = node;
         tail = tail.next;
         size++;
      }
   }

   public void add(Node<T> node) {
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
   
   public void insertAtPos(T data, int position) {
      Node<T> help = new Node<T>(null);
      help.next = head;

      Node<T> runner = help;
      for (int i = 0; i < position; ++i) {
          runner = runner.next;
      }

      Node<T> node = new Node<T>(data);
      node.next = runner.next;
      runner.next = node;
  }

   public T get(int pos) {
      Node<T> current = head;
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
      int count = 0;
      Node<T> newNode = head;
      if (pos == 1) {
         head = head.next;
         size--;
         System.out.println("REMOVE| Element at position " + pos + " is removed");
      }
      else if (pos == size) {
         System.out.println("REMOVE| ELement removed");
         for (int i = 0; i < size; i++){
            if (count == size - 2){
               tail = newNode;
               tail.next = null;
               break;
            }
            newNode = newNode.next;
            count++;
         }
         size--;
      } else {
         System.out.println("REMOVE| ELement removed");
         for (int i = 0; i < size; i++){
            if (count == pos - 2){
               newNode.next = newNode.next.next;
               break;
            }
            newNode = newNode.next;
            count++;
         }
         size--;
      }  
   }

   public boolean isEmpty() {
      System.out.println("EMPTY| Is the list empty -> " + (size == 0));
      return size == 0;
   }

   public int search(T data) {
      Node<T> current = head;
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
   }

   public int size() {
      System.out.println("SIZE| The size is " + size);
      return size;
   }

   public Object[] toArray() {
      Object[] array = new Object[size];
      Node<T> node = head;
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

   public Iterator<T> iterator() {

      Iterator<T> iter = new Iterator<T>() {
         Node<T> node = new Node<T>(null, head);

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