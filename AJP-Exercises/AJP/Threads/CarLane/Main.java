package Threads.CarLane;

public class Main
{
   public static void main(String[] args) {
      SingleLane lane = new SingleLane();
      for (int i = 1; i < 100; i++) {
         BlueCar blue = new BlueCar(lane, i);
         RedCar red = new RedCar(lane, i);
         blue.start();
         red.start();
         try {
            Thread.sleep(RandomGenerator.randomGenerator(6));
         } catch (InterruptedException e) {}
      }
   }
}