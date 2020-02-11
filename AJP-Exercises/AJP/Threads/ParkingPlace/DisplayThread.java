package Threads.ParkingPlace;

public class DisplayThread extends Thread
{
   IParkingPlace parkingPlace;

   public DisplayThread(IParkingPlace parking) {
      this.parkingPlace = parking;
   }

   public void run() {
      while (true) {
         int value = parkingPlace.freePlaces();
         updateDisplay(value);
      }
   }

   private void updateDisplay(int number) {
      System.out.println("Free places " + number);
   }
}
