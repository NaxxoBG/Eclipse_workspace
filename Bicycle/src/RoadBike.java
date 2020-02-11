public class RoadBike extends Bicycle
{
   private int tireWidth;

   public RoadBike(int startCadence, int startGear, int startSpeed, int startTireWidth) {
      super(startCadence, startGear, startSpeed);
      startTireWidth = tireWidth;
   }

   public void setTireWidth(int newValue) {
      tireWidth = newValue;
   }

   public void printDescription() {
      System.out.println("RoadBike tire width: " + tireWidth);
   }
}