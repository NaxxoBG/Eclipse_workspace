package Threads.ParkingPlace;

public class CarImplTest
{

   public static void main(String[] args) throws InterruptedException {
      IParkingPlace parking = new ParkingPlaceImpl(4);
      DisplayThread displayThread = new DisplayThread(parking);
      displayThread.start();
      for (int i = 0; i < 100; i++) {
         CarThread car = new CarThread(parking, i);
         car.start();
         Thread.sleep(2000);
      }
   }

}
