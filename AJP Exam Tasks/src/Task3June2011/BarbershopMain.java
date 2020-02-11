package Task3June2011;

import java.util.concurrent.ThreadLocalRandom;

public class BarbershopMain
{

   public static void main(String[] args) {
      CircularArray arr = new CircularArray(5);

      BarberShop shop = new BarberShop(arr);

      Barber barber = new Barber(1, shop);

      barber.start();

      for (int i = 1; i < 16; i++) {
         Thread customer = new Thread(new CustomerRunnable(shop, i));
         customer.start();
         try {
            Thread.sleep(ThreadLocalRandom.current().nextLong(1000, 3001));
         } catch (InterruptedException e) {}
      }
   }
}