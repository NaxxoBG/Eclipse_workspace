package Task3;

import java.lang.reflect.Array;

@SuppressWarnings({"unused", "unchecked"})
class CircularArray<T>
{
   private T[] queue;
   private int count, size;
   private int front, rear;

   // Creates an empty queue with places for ‘size’ elements
   public CircularArray(int size) {
      queue = (T[]) Array.newInstance(Comparable.class, size);
      this.size = size;
      count = 0;
      rear = 0;
      front = 0;
   }

   // precondition: queue is not full
   public void put(T x) {
      queue[rear] = x;
      rear = (rear + 1) % queue.length;
      count++;
   }

   // precondition: queue is not empty
   public T take() {
      T obj = queue[front];
      queue[front] = null;
      front = (front + 1) % queue.length; //queue.length is the number of indices
      count--;
      return obj;
   }

   public boolean isEmpty() {
      return count == 0;
   }

   public boolean isFull() {
      return count == queue.length;
   }
}