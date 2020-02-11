package Threads.Museum;

public class DisplayThread extends Thread
{
   MuseumCounter mc;

   public DisplayThread(MuseumCounter museum) {
      this.mc = museum;
   }

   public void run() {
      while (true) {
         int value = mc.getNumber();
         updateDisplay(value);
      }
   }

   private void updateDisplay(int number) {
      System.out.println("Number of visitors: " + number);
   }
}