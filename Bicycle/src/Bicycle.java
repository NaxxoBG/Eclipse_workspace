public abstract class Bicycle
{
   @SuppressWarnings("unused")
   private int cadence;
   @SuppressWarnings("unused")
   private int gear;
   @SuppressWarnings("unused")
   private int speed;

   public Bicycle(int startCadence, int startGear, int startSpeed) {
      cadence = startCadence;
      gear = startGear;
      speed = startSpeed;
   }

   public void setCadence(int newValue) {
      this.cadence = newValue;
   }

   public void setGear(int newValue) {
      this.gear = newValue;
   }

   public void applyBrake(int decrement) {
      speed -= decrement;
   }

   public void speedUp(int increment) {
      speed += increment;
   }
}