public class MountainBike extends Bicycle
{
   @SuppressWarnings("unused")
   private int seatHeight;

   public MountainBike(int startCadence, int startGear, int startSpeed,
         int seatHeight)
   {
      super(startCadence, startGear, startSpeed);
      this.seatHeight = seatHeight;
   }

   public void setHeight(int newValue) {
      seatHeight = newValue;
   }
}