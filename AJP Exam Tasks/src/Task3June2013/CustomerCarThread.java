package Task3June2013;

import java.util.concurrent.ThreadLocalRandom;

public class CustomerCarThread implements Runnable
{
   private int id;
   private WashingHall hall;

   public CustomerCarThread(int id, WashingHall hall) {
      this.id = id;
      this.hall = hall;
   }    

   public void run() {
      this.carEntered();
      hall.enterForWashing();
      this.washing();
      hall.leaveWashing();
      this.carLeft();
   }

   private void carEntered() {
      System.out.println("Car " + this.id + " has entered the hall");
   }

   private void carLeft() {
      System.out.println("Car " + this.id + " has left the hall");
   }

   private void washing() {
      System.out.println("Car " + this.id + " is being washed");
      try {
         Thread.sleep(ThreadLocalRandom.current().nextInt(3000, 5001));
      } catch (InterruptedException e) {}
   }
}