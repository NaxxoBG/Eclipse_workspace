package Threads.Museum;

public class MainMuseum
{
   public static void main(String[] args) throws InterruptedException {
      MuseumCounter museum = new MuseumCounter();
      DisplayThread display = new DisplayThread(museum);

      display.start();

      for (int i = 1; i < 100; i++) {
         TourGuideThread guide = new TourGuideThread(museum, (int) ((Math.random() * 15) + 1), i);
         Thread.sleep(2000);
         guide.start();
      }
   }
}