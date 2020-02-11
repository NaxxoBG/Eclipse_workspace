public class NumberDispenser implements ItakeANumber
{
   private int nextNumberToTake = 0;
   private int nextNumberToServe = 1;

   @Override
   public synchronized void takeNextNumber() {
      nextNumberToTake++;
      notifyAll();
   }

   @Override
   public synchronized int nextCustomer() {
      while (nextNumberToServe == nextNumberToTake + 1) {
         try {
            wait();
         }
         catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
      notifyAll();
      return nextNumberToServe++;
   }

   public int getTakenNumber() {
      return this.nextNumberToTake;
   }
}