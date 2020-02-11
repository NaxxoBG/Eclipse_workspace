public class PetrolPump
{
   private int petrolAmount;
   private int distanceToNext;

   public PetrolPump(int petrolAmount, int distanceToNext) {
      this.petrolAmount = petrolAmount;
      this.distanceToNext = distanceToNext;
   }

   public int getPetrolAmount() {
      return petrolAmount;
   }

   public int getDistanceToNext() {
      return distanceToNext;
   }

   public String toString() {
      return "PetrolPump - petrolAmount: " + petrolAmount + ", distanceToNext: " + distanceToNext;
   }
}