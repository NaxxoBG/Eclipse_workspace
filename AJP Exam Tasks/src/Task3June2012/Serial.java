package Task3June2012;

public class Serial implements Runnable
{
   private String name;
   private MonitorQueue monitor;

   public Serial(String name, MonitorQueue monitor) {
      this.name = name;
      this.monitor = monitor;
   }

   public void run() {
      while (true) {
         char charBeingRead = monitor.take();
         reading(charBeingRead);
      }
   }

   private void reading(char c) {
      System.out.println("Serial " + name + " is reading " + c);
      try {
         Thread.sleep(1000);
      }
      catch (InterruptedException e) {}
   }
}