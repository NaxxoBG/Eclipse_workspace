import java.util.concurrent.ThreadLocalRandom;

public class BakeryClerk extends Thread
{
   NumberDispenser monitor;
   private int id;

   public BakeryClerk(ItakeANumber monitor, int id) {
      this.monitor = (NumberDispenser) monitor;
      this.id = id;
   }

   @Override
   public void run() {
      while (true) {
         servingClient(monitor.nextCustomer());
      }
   }

   private void servingClient(int clientNo) {
      System.out.println(String.format("Clerk %d is serving client No. %d", id, clientNo));
      try {
         Thread.sleep(ThreadLocalRandom.current().nextInt(2000, 5001));
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }
}