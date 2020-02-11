package Set;

import java.util.Iterator;

public class Set<T> implements SetInterface<T>, Iterable<T>
{
   SetNode<T> head;
   SetNode<T> tail;
   int size = 0;

   public Set(SetNode<T> node) {
      head = node;
      tail = node;
      size = 1;
   }

   public Set() {
      head = tail = null;
      size = 0;
   }

   public void add(T data) {
      SetNode<T> node = new SetNode<T>(data);
      if (size == 0) {
         head = tail = node;
         size++;
         System.out.println("ADD| Adding element with " + data);
      } else {
         if (search(data) == -1) {
            tail.next = node;
            tail = tail.next;
            size++;
            System.out.println("ADD| Adding element with data " + data);
         } else {
            System.out.println("ADD| Nothing was added as the element is in the set");
         }
      }
   }

   public void remove(int pos) {
      SetNode<T> node = head;
      int counter = 0;
      if (pos == 1) {
         head = head.next;
         size--;
         System.out.println("REMOVE| Element at position " + pos + " was removed");
      } else if (pos == size) {
         for (int i = 0; i < size; i++) {
            if (counter == size - 2) {
               tail = node;
               tail.next = null;
               break;
            }
            node = node.next;
            counter++;
         }
         size--;
      } else {
         System.out.println("REMOVE| Element at position " + pos + " was removed");
         for (int i = 0; i < size; i++){
            if (counter == pos - 2) {
               node.next=node.next.next;
               break;
            }
            node = node.next;
            counter++;
         }
         size--;
      }
   }

   public void clean() {
      head = tail = null;
      System.out.println("CLEAN| Set cleared");
   }

   public boolean isEmpty() {
      System.out.println("EMPTY| Is the list empty");
      return size == 0;
   }

   public int search(T data) {
      SetNode<T> current = head;
      int counter = 1;
      if (head == null) {
         return -1;
      } else {
         while (current != null) {
            if(current.getData().equals(data)) {
               return counter;
            }
            current = current.next;
            counter++;
         }
         //System.out.println("SEARCH| Element " + data + " is at position " + counter);
      }
      return -1;
   }

   public void getHeadData() {
      System.out.println("The head data is " + head.data);; //head.next is null
   }

   public void getTailData() {
      System.out.println("The tail data is " + tail.data);
   }

   public int size() {
      System.out.println("SIZE| The size is " + size);
      return size;
   }

   public Iterator<T> iterator() {

      Iterator<T> iter = new Iterator<T>() {
         SetNode<T> node = new SetNode<T>(null, head);

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