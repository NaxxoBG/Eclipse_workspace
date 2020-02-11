package Task3January2010;

import java.util.concurrent.ThreadLocalRandom;

public class StoreTest
{
   public static void main(String[] args) {
      TakeANumber monitor = new TakeANumber();

      Clerk clerk1 = new Clerk(monitor, 1);
      Clerk clerk2 = new Clerk(monitor, 2);
      clerk1.start();
      try {
         Thread.sleep(3000);
      }
      catch (InterruptedException e1) {}
      clerk2.start();

      for (int i = 1; i < 11; i++) {
         Customer customer = new Customer(monitor, i);
         customer.start();
         try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 2001));
         } catch (InterruptedException e) {}
      }
   }
}