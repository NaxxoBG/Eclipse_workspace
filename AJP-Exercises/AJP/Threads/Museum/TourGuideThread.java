package Threads.Museum;

import java.util.Random;

public class TourGuideThread extends Thread
{
   MuseumCounter mc;
   Random random = new Random();
   private int visitors;
   int groupCounter;

   public TourGuideThread(MuseumCounter mc, int visitors, int counter) {
      this.mc = mc;
      this.visitors = visitors;
      this.groupCounter = counter;
   }

   public void run() {
      System.out.println("\nGroup " + groupCounter  + " arrives and waits for the tour to start. Visitors: " + visitors);
      mc.enter(visitors);
      System.out.println("Group " + groupCounter + ", tour has begun");
      try {
         Thread.sleep((random.nextInt(6) + 5) * 1000);
      } catch (InterruptedException e) {}
      mc.leave(visitors);
      System.out.println("\nGroup " + groupCounter  + " has left. Number of visitors leaving: " + visitors);
   }
}