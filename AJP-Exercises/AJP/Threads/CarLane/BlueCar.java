package Threads.CarLane;

public class BlueCar extends Thread
{
   SingleLane lane;
   int counter;

   public BlueCar(SingleLane lane, int counter) {
      this.lane = lane;
      this.counter = counter;
   }

   public void run() {
      this.blueCarEnter();
      lane.enterFromTheRight();
      this.blueCarDriving();
      this.blueCarExit();
      lane.exitToTheLeft();
   }

   private void blueCarEnter() {
      try {
         Thread.sleep(RandomGenerator.randomGenerator(5));
      } catch (InterruptedException e1) {}
      System.out.println("Blue car " + counter + " is coming from the right\n");
   }

   private void blueCarExit() {
      System.out.println("Blue car " + counter + " exiting to the left\n");
   }

   private void blueCarDriving() {
      System.out.println("Blue car " + counter + " driving on the lane\n");
      try {
         Thread.sleep(5000);
      } catch (InterruptedException e) {}
   }
}