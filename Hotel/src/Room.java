public class Room
{
   // Room ----> Guest (Association)
   // Room ----> Bed (Composition)
   // Hotel ----> Room (Aggregation)

   private int number;
   private Guest guest;
   private Bed bed;

   private static final double PRICES[] = {59.50, 72.40, 89.00} ;
   private static final String BED_TYPES[] = {"Single", "Double", "King Size"};

   public Room(int number, String bedType) {
      this.number = number;
      this.bed = new Bed(bedType);
      this.guest = null;
   }

   public int getNumber() {
      return number;
   }

   public int getFloor() {
      return number / 100;
   }

   public double getPrice() {
      if (bed.isSingle()) {
         return PRICES[0];
      } else if (bed.isDouble()) {
         return PRICES[1];
      } else if (bed.isKingSize()) {
         return PRICES[2];
      } else return 0.00;  
   }

   public boolean isOccupied() {
      return guest != null;
   }

   public void registerGuest(Guest guest) {
      this.guest = guest;
   }

   public void vacate() {
      this.guest = null;
   }

   public String getBedType() {
      if (bed.isSingle()) {
         return BED_TYPES[0];
      } else if (bed.isDouble()) {
         return BED_TYPES[1];
      } else {
         return BED_TYPES[2];
      }
   }

   public Guest getGuest() {
      return this.guest;
   }
}