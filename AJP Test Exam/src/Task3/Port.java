package Task3;

public class Port implements IPort
{
   int id;
   CircularArray queue;

   public Port(int id, CircularArray queue) {
      this.id = id;
      this.queue = new CircularArray(10);
   }

   public synchronized boolean send(String message) {
      boolean result;
      if (queue.isFull()) {
         result = false;
      } else {
         queue.put(message);
         result = true;
      }
      notifyAll();
      return result;
   }

   public synchronized String receive() {
      while (queue.isEmpty()) {
         try {
            wait();
         } catch (InterruptedException e) {}
      }
      Message message = queue.take();
      notifyAll();
      return message.toString();
   }
}