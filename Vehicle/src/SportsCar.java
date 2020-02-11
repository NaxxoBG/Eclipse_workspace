public class SportsCar extends Car
{
   private int maxVelocity;

   public SportsCar(String owner, double price, String regNo, int maxVelocity) {
      super(owner, price, regNo);
      this.maxVelocity = maxVelocity;
   }

   public int getMaxVelocity() { 
      return maxVelocity;
   }

   public boolean equals(Object arg) {
      if(!(arg instanceof SportsCar)) {
         return false;
      } else {
         SportsCar other = (SportsCar) arg;
         return super.equals(other) && maxVelocity == other.maxVelocity;
      }
   }

   public String toString() {
      return "\n" + super.toString() + "\nmaxVelocity: " + maxVelocity;
   }
}