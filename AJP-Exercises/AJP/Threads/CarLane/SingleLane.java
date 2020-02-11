package Threads.CarLane;

public class SingleLane implements ILane
{
   int leftCarsOnLane;
   int rightCarsOnLane;
   int leftCarsWaiting;
   int rightCarsWaiting;
   boolean leftTurn;

   public SingleLane() {}

   public synchronized void enterFromTheLeft() {
      leftCarsWaiting++;
      while (rightCarsOnLane > 0 || (rightCarsWaiting > 0 && !leftTurn)) {
         try {
            wait();
         } catch (Exception e) {}
      }
      leftCarsOnLane++;
      leftCarsWaiting--;
   }

   public synchronized void exitToTheRight() {
      leftCarsOnLane--;
      leftTurn = false;
      if (leftCarsOnLane == 0) {
         notifyAll();
      }
   }

   public synchronized void enterFromTheRight() {
      rightCarsWaiting++;
      while (leftCarsOnLane > 0 || (leftCarsWaiting > 0 && leftTurn)) {
         try {
            wait();
         }
         catch (Exception e) {}
      }
      rightCarsOnLane++;
      rightCarsWaiting--;
   }

   public synchronized void exitToTheLeft() {
      rightCarsOnLane--;
      leftTurn = true;
      if (rightCarsOnLane == 0) {
         notifyAll();
      }
   }
}