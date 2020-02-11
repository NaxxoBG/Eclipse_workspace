// *****************************************************************************
// File name  : QueueAsCircularArray.java.
// Start date :
// Programmer : Hans So.
// Java       :
// Description:
// *****************************************************************************
package Queue;
/**
 * This <CODE>class QueueAsCircularArray</CODE> implements
 * <CODE>interface IQueue</CODE> as a circular array.
 *
 * @version 1.0; - 7th March 2004
 * @author Hans Sondergaard
 **/
public class QueueAsCircularArray implements IQueue
{
   private Object[] queue;
   @SuppressWarnings("unused")
   private int count, size;
   private int front, rear;
   /**
    * Creates an empty queue with places for <CODE>size</CODE> elements
    * @param size is the number of places in this queue
    * @precondition size > 0
    * @postcondition queue is empty
    */
   public QueueAsCircularArray(int size)
   {
      queue = new Object[size];
      this.size = size;
      count = 0;
      rear = 0;
      front = 0;
   }
   /**
    * @param x is not null
    * @precondition queue is not full
    * @postcondition queue is not empty
    */
   public void put(Object x)
   {
      queue[rear] = x;
      rear = (rear + 1) % queue.length; // if rear = 0, then (0 + 1) % 10(if length is 10) = 1 % 10 = 1
      count++;
   }
   /**
    * @precondition queue is not empty
    * @postcondition queue is not full
    */
   public Object take()
   {
      Object obj = queue[front];
      queue[front] = null;
      front = (front + 1) % queue.length;
      count--;
      return obj;
   }

   public boolean isEmpty() {
      return count == 0;
   }

   public boolean isFull() {
      return count == queue.length;
   }

   public int count() {
      return count;
   }
}