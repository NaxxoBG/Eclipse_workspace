package Adapter;

public class AdapterTest
{
   public static void main(String[] args) {

      Car car = new Car();
      HoverCarAdapter hover = new HoverCarAdapter();
      BoatAdapter boat = new BoatAdapter();

      car.goForward();
      hover.goForward();
      boat.goForward();
      hover.turn(45);
      boat.turn(45);
   }
}