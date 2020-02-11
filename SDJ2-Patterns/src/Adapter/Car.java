package Adapter;

public class Car implements CarInterface
{
   public void goForward() {
      System.out.println("Car is going forward");
   }

   public void goBackwards() {
      System.out.println("Car is going backwards"); 
   }

   public void turn(int deg) {
      System.out.println("Car is turning " + deg);
   }
}