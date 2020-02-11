package Task3June2013;

public class WashingHall
{
   private int numOfCars;
   private final int maxCars = 5;
   private boolean changed;

   public WashingHall() {
      this.numOfCars = 0;
      this.changed = true;
   }

   public synchronized void enterForWashing() {
      while (numOfCars + 1 > maxCars) {
         try {
            wait();
         } catch (InterruptedException e) {}
      }
      numOfCars+=1;
      changed = true;
      notifyAll();
   }

   public synchronized void leaveWashing() {
      numOfCars--;
      changed = true;
      notifyAll();
   }

   public int getFreePlaces() {
      while (!changed) {
         try {
            wait();
         } catch (Exception e) {}
      }
      changed = false;
      return maxCars - numOfCars;
   }
}
