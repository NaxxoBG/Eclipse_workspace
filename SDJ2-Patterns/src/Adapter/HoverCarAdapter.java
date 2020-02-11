package Adapter;

public class HoverCarAdapter implements CarInterface
{
   HoverCar hoverCar = new HoverCar();

   public void goForward() {
      hoverCar.hoverForward();
   }

   public void goBackwards() {
      hoverCar.hoverBackwards();  
   }


   public void turn(int deg) {
      hoverCar.turnCabin(deg);
   } 
}