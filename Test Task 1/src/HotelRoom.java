
public class HotelRoom
{
   private int roomNumber;
   private double rent;
   private String guest;

   public HotelRoom(int roomNumber, double rent, String guest) {
      this.roomNumber = roomNumber;
      this.rent = rent;
      this.guest = guest;
   }
   
   public HotelRoom (int roomNumber, double rent) {
      this.roomNumber = roomNumber;
      this.rent = rent;
      this.guest = "No one";
   }
   
   public int getRoomNumber()
   {
      return roomNumber;
   }
   
   public double getRent()
   {
      return rent;
   }
   
   public void setRent(double rent)
   {
      this.rent = rent;
   }
   
   public String getGuest()
   {
      return guest;
   }
   
   public boolean isAvailable() {
         if (getGuest().equals("No one")) {
            System.out.println("The room is available.");
            return true;
         
         } else {
         System.out.println("The room is taken by " + getGuest());
         return false;
         }
   }
   
   public void checkIn(String guest) {
      if (isAvailable() == true) 
       this.guest = guest;
   }
   
   public void checkOut() {
      this.guest ="No one";
   }
   
   public String toString() {
      return "The guest is " + guest + ", the room number is " + roomNumber + ", the rent is " + rent;
   }
}