package Task3;

@SuppressWarnings("unused")
class CircularArray
{
   private Message[] queue;
   private int count, size;
   private int front, rear;

   public CircularArray(int size) {
      queue = new Message[size];
      this.size = size;
      count = 0;
      rear = 0;
      front = 0;
   }

   public void put(String x) {
      Message message = new Message(x);
      queue[rear] = message;
      rear = (rear + 1) % queue.length;
      count++;
   }

   public Message take() {
      Message obj = queue[front];
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