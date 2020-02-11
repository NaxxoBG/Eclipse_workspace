package Adapter;

public class HoverCar
{
   public void hoverForward() {
      System.out.println("Hovering forward");
   }

   public void hoverBackwards() {
      System.out.println("Hovering backwards");
   }

   public void turnCabin(int deg) {
      System.out.println("Hovercar is turning "+ deg);
   }
}