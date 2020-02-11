public class BoundedBuffer implements IBoundedBuffer
{
   QueueAsCircularArray queue;
   private boolean changed;

   public BoundedBuffer(int size) {
      queue = new QueueAsCircularArray(size);
      changed = true;
   }

   public synchronized void put(Object element) {
      while (!queue.isFull()) {
         try {
            wait();
         }
         catch (Exception e) {
         }
      }

      queue.put(element);
      changed = true;
      notifyAll();

   }

   public synchronized Object take() {
      while (!queue.isEmpty()) {
         try {
            wait();
         }
         catch (Exception e) {
         }
      }
      Object obj = queue.take();
      changed = true;
      notifyAll();
      return obj;
   }

   public synchronized void monitor() {
      while (!changed) {
         try {
            wait();
         }
         catch (Exception e) {
         }
      }
      System.out.println("Number of products : " + queue.count());
   }
}