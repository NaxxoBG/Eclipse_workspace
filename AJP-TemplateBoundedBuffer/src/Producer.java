public class Producer extends Thread
{
   private IBoundedBuffer bbuffer;

   public Producer(IBoundedBuffer bbuffer) {
      this.bbuffer = bbuffer;
   }

   public void run() {
      while (true) {
         Object element = produce();
         bbuffer.put(element);
      }
   }

   private Object produce() {
      Object element = "hte";
      System.out.println("Produced " + element);
      try {
         sleep(2000);
      }
      catch (InterruptedException e) {
      }
      return "ok";
   }
}