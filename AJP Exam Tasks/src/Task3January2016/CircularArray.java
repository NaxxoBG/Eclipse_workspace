package Task3January2016;

@SuppressWarnings("unused")
class CircularArray
{
   private Customer[] queue;
   private int count, size;
   private int front, rear;

   // Creates an empty queue with places for ‘size’ elements
   public CircularArray(int size) {
      queue = new Customer[size];
      this.size = size;
      count = 0;
      rear = 0;
      front = 0;
   }

   // precondition: queue is not full
   public void put(Customer x) {
      queue[rear] = x;
      rear = (rear + 1) % queue.length;
      count++;
   }

   // precondition: queue is not empty
   public Customer take() {
      Customer obj = queue[front];
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
}