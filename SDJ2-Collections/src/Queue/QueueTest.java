package Queue;
import java.util.Iterator;

public class QueueTest
{
   public static void main(String[] args) {
      Queue<Integer> queue = new Queue<Integer>();
      
      queue.enqueue(1); //testing true
      queue.enqueue(2);
      queue.enqueue(3);
      queue.enqueue(4);
      queue.enqueue(5);
      
      System.out.println();
      queue.peek();
      queue.size();
      
      queue.getLast();
      queue.enqueue(6);
      queue.getLast();
      queue.dequeue();
      queue.enqueue(7);
      
      
      System.out.println();
      Iterator<Integer> iter = queue.iterator();
      while(iter.hasNext()) {
         int element = iter.next();
         System.out.print(element + "|");
      }
   }

}
