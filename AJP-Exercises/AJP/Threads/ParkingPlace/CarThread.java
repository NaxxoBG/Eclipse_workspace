package Threads.ParkingPlace;

import java.util.Random;

public class CarThread extends Thread
{
   private IParkingPlace parkingPlace;
   private int carNo;
   Random rand = new Random();

   public CarThread(IParkingPlace parking, int carNo) {
      this.carNo = carNo;
      this.parkingPlace = parking;
   }

   public void run() {
      drive1();
      parkingPlace.arrive();
      try {
         Thread.sleep(rand.nextInt(8) * 1000);
      } catch (InterruptedException e) {}
      park();
      parkingPlace.leave();
      drive2();
   }

   public void drive1() {
      System.out.println("Car " + carNo + " arrived");
   }

   public void drive2() {
      System.out.println(getName() + " drives away");
   }

   public void park() {
      System.out.println(getName() + " has parked");
   }
}