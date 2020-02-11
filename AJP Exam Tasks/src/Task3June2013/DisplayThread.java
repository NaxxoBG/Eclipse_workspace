package Task3June2013;

public class DisplayThread implements Runnable
{
   private WashingHall hall;

   public DisplayThread(WashingHall hall) {
      this.hall = hall;
   }

   public void run() {
      while (true) {
         int value = hall.getFreePlaces();
         this.updateDisplay(value);
      }
   }

   private void updateDisplay(int number) {
      System.out.println("Number of free places: " + number);
   }
}