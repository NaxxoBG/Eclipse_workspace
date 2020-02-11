package Threads.CarLane;

public class RedCar extends Thread
{
   public SingleLane lane;
   int counter;

   public RedCar(SingleLane lane, int counter) {
      this.lane = lane;
      this.counter = counter;
   }

   public void run() {
      this.redCarEnter();
      lane.enterFromTheLeft();
      this.redCarDriving();
      this.redCarExit();
      lane.exitToTheRight();
   }

   private void redCarEnter() {
      try {
         Thread.sleep(RandomGenerator.randomGenerator(5));
      }
      catch (InterruptedException e1) {}
      System.out.println("Red car " + counter + " is coming from the left\n");
   }

   private void redCarDriving() {
      System.out.println("Red car " + counter + " is driving on the lane\n");
      try {
         Thread.sleep(5000);
      }
      catch (InterruptedException e) {}
   }

   private void redCarExit() {
      System.out.println("Red car " + counter + " is exiting to the right\n");
   }
}