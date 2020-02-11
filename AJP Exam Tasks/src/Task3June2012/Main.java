package Task3June2012;

public class Main
{
   public static void main(String[] args) {
      MonitorQueue monitor = new MonitorQueue(10, "Monitor");

      Thread app1 = new Thread(new Application("App", monitor));
      Thread app2 = new Thread(new Application("App 2", monitor));
      Thread serial1 = new Thread(new Serial("Serial 1", monitor));
      Thread serial2 = new Thread(new Serial("Serial 2", monitor));
      Thread serial3 = new Thread(new Serial("Serial 3", monitor));
      Thread serial4 = new Thread(new Serial("Serial 4", monitor));

      app1.start();
      app2.start();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {}
      serial1.start();
      serial2.start();
      serial3.start();
      serial4.start();
   }
}