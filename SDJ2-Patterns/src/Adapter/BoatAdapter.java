package Adapter;

public class BoatAdapter implements CarInterface
{
   Boat boat = new Boat();

   public void goForward() {
      boat.sailForward();
   }

   public void goBackwards() {
      boat.sailBackwards();
   }

   public void turn(int deg) {
      boat.turnBoat(deg);
   }
}