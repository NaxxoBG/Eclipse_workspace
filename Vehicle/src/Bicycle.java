public class Bicycle extends Vehicle
{
   private int gears;

   public Bicycle(String owner, double price, int gears) {
      super(owner, price);
      this.gears = gears;
   }

   public String toString() {
      return "\n\nBike\n" + super.toString() + "\nGears: " + gears;
   }

   public boolean equals(Object arg) {
      if(!(arg instanceof Bicycle)) {
         return false;
      } else {
         Bicycle other = (Bicycle) arg;
         return super.equals(other) && gears == other.gears;
      }
   }

   public int getGears() {
      return gears;
   }

   public void setGears(int gears) {
      this.gears = gears;
   }
}