package Task3June2011;

import java.util.concurrent.ThreadLocalRandom;

public class Barber extends Thread
{
   int id;
   BarberShop shop;

   public Barber(int id, BarberShop shop) {
      this.id = id;
      this.shop = shop;
   }

   public void run() {
      while (true) {
         Customer customer = shop.cuttingTheNext();
         this.cutting(customer);
      }
   }

   private void cutting(Customer c) {
      System.out.println("The barber is cutting customer " + c.getNumber());
      try {
         Thread.sleep(ThreadLocalRandom.current().nextLong(3000, 5001));
      } catch (InterruptedException e) {}
      System.out.println("The barber has finished cutting customer " + c.getNumber());
   }
}