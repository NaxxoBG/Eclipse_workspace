package Task3;

public class BarDesk implements IBarDesk
{
   private int filledGlasses;
   private int emptyGlasses;

   public BarDesk() {
      this.filledGlasses = 50;
      this.emptyGlasses = 0;
   }

   public synchronized void takeFullGlass() {
      while (filledGlasses == 0) {
         try {
            wait();
         } catch (InterruptedException e) {}
      }
      filledGlasses--;
      notifyAll();
   }


   public synchronized void placeEmptyGlass() {
      emptyGlasses++;
      notifyAll();
   }


   public synchronized void takeEmptyGlass() {
      while (emptyGlasses == 0) {
         try {
            wait();
         } catch (InterruptedException e) {}
      }
      emptyGlasses--;
      notifyAll();
   }

   public synchronized void placeFullGlass() {
      filledGlasses++;
      notifyAll();
   }
}