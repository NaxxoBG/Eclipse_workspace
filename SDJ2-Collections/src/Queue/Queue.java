package Queue;
import java.util.Iterator;

public class Queue<T> implements QueueInterface<T> , Iterable<T>
{
   Qnode<T> head;
   Qnode<T> tail;
   int size;

   public Queue(Qnode<T> next) {
      this.head = next;
      this.tail = next;
      size = 1;
   }

   public Queue() {
      head = null;
      tail = null;
      size = 0;
   }

   public void enqueue(T data) {
      Qnode<T> node = new Qnode<T>(data);
      if (head == null && tail == null) {
         head = tail = node;
         size++;
         System.out.println("ENQUEUE| Element added -> " + data);
        
      } else {
         tail.next = node;
         tail = node;
         size++;
         System.out.println("ENQUEUE| Element added -> " + data);
      }
   }

   public T peek() {
      if (head != null) {
         System.out.println("PEEK| Head of the queue is " + head.data);
         return head.data;
      } else {
         System.out.println("PEEK| " + null);
         return null;
      }
   }

   public T dequeue() {
      Qnode<T> node = head;
      if (head == null) {
         System.out.println("DEQUEUE| " + null);
         return null;
      } else if (head == tail) {
         head = tail = null;
         size--;
         System.out.println("DEQUEUE| Head is removed " + node.data);
         return node.data;
      } else {
         head = head.next;
         size--;
         System.out.println("DEQUEUE| Head is removed " + node.data);
         return node.data;
      }
   }

   public void addBetween(T t, int afterThisPos) {
      Qnode<T> node = head;
      Qnode<T> newNode = new Qnode<T>(t);
      int counter = 0;
      while (counter < afterThisPos) {
         node = node.next;
         counter++;
      }
      newNode.next = node.next;
      node = newNode;
      size++;
   }

   public T getLast() {
      if (tail != null && head != null) {
         System.out.println("GETLAST| Tail is " + tail.data);
         return tail.data;
      }
      System.out.println("GETLAST| " + null);
      return null;
   }

   public Iterator<T> iterator() {
      Iterator<T> iter = new Iterator<T>() {
         Qnode<T> node = new Qnode<T>(null, head);

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

   public int size() {
      System.out.println("SIZE| The size is " + size);
      return size;
   }
}