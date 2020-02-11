package Task3;

import java.util.concurrent.ThreadLocalRandom;

public class Customer implements Runnable 
{
   private int consumedBeers;
   private BarDesk desk;
   private int no;

   public Customer(int no, BarDesk desk) {
      this.consumedBeers = 0;
      this.desk = desk;
      this.no = no;
   }

   public void run() {
      while (true && consumedBeers <= 9) {
         desk.takeFullGlass();
         this.increaseConsumedBeers();
         desk.placeEmptyGlass();
      }
   }

   private void increaseConsumedBeers() {
      this.consumedBeers++;
      System.out.println("Customer " + no + " is drinking a beer\nThis is his/her beer no. " + this.consumedBeers);
      try {
         Thread.sleep(ThreadLocalRandom.current().nextInt(3000, 5001));
      } catch (InterruptedException e) {}
   }
}