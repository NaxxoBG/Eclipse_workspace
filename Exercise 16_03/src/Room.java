
public class Room
{
   private int number;
   private Guest guest;
   private Bed bed;

   public Room(int number, String bedType) {
      this.number = number;
      bed = new Bed(bedType);
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
         return 59.50;
      } else if (bed.isDouble()) {
         return 72.40;
      } else if (bed.isKingSize()) {
         return 89.00;
      } else
         return 0;
   }

   public boolean isOccupied() {
      if (guest != null) {
         return true;
      } else {
         return false;
      }
   }

   public void registerGuest(Guest guest) {
      if (isOccupied()) {
         System.out.println("The room is occupied!");
      } else {
         this.guest = guest;
      }
   }

   public void vacate() {
      if (isOccupied() == true) {
         this.guest = null;
      } else {
         System.out.println("Cannot vacate the room as it is empty!");
      }
   }

   public String getBedType() {
      if (bed.isSingle()) {
         return "The price of a room with a single bed is 59.50$";

      } else if (bed.isDouble()) {

         return "The price of a room with a double bed is 72.40$";
      } else if (bed.isKingSize()) {

         return "The price of a room with a King Size bed is 89.00$";
      } else

         return "no price";
   }

   public Guest getGuest() {
      return guest;
   }
}