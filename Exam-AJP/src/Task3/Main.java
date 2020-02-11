package Task3;

import java.util.concurrent.ThreadLocalRandom;

public class Main
{
   public static void main(String[] args) throws InterruptedException {
      BarDesk bar = new BarDesk();

      Thread bartender1 = new Thread(new Bartender("John", bar));
      Thread bartender2 = new Thread(new Bartender("Mike", bar));
      Thread bartender3 = new Thread(new Bartender("Lucy", bar));

      bartender1.start();
      bartender2.start();
      bartender3.start();

      for (int i = 1; i < 100; i++) {
         Thread customer = new Thread(new Customer(i, bar));
         Thread.sleep(ThreadLocalRandom.current().nextLong(3000, 6001));
         customer.start();
      }
   }
}