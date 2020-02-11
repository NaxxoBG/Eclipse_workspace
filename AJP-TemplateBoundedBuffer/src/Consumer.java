public class Consumer extends Thread
{
   private IBoundedBuffer bbuffer;

   public Consumer(IBoundedBuffer bbuffer) {
      this.bbuffer = bbuffer;
   }

   public void run() {
      while (true) {
         Object element = bbuffer.take();
         consume(element);
      }
   }

   private void consume(Object element) {
      try {
         sleep(1000);
      }
      catch (InterruptedException e) {
      }
      System.out.println("Consumed " + element);
   }

}