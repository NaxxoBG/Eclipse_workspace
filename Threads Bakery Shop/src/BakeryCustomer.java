import java.util.concurrent.ThreadLocalRandom;

public class BakeryCustomer extends Thread
{
   NumberDispenser monitor;

   public BakeryCustomer(ItakeANumber monitor) {
      this.monitor = (NumberDispenser) monitor;
   }

   @Override
   public void run() {
      monitor.takeNextNumber();
      this.takingNum(monitor.getTakenNumber());
      this.randomCustomerTime();
   }

   private void takingNum(int number) {
      System.out.println(String.format("Customer takes number %d", number));
   }

   private void randomCustomerTime() {
      try {
         Thread.sleep(ThreadLocalRandom.current().nextInt(3000, 5001));
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }
}