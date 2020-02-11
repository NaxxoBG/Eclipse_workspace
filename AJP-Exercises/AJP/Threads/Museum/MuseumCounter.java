package Threads.Museum;

public class MuseumCounter
{  
   private int numOfVisitors;
   private final long MAX = 30;
   private boolean changed;

   public MuseumCounter() {
      this.numOfVisitors = 0;
      this.changed = true;
   }

   public synchronized void enter(int numberInGroup) {
      while (isThereEnoughPlace(numberInGroup)) {
         try {
            wait();
         } catch (InterruptedException e) {}
      }
      numOfVisitors += numberInGroup;
      changed = true;
      notifyAll();
   }

   private boolean isThereEnoughPlace(int numberInGroup) {
      return numOfVisitors + numberInGroup > MAX;
   }

   public synchronized void leave(int numberInGroup) {
      numOfVisitors -= numberInGroup;
      changed = true;
      notifyAll();
   }

   public synchronized int getNumber() {
      while (!changed) {
         try {
            wait();
         } catch (InterruptedException e) {}
      }
      changed = false;
      return numOfVisitors;
   }
}