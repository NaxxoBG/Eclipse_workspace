import java.util.ArrayList;

public class CleaningPerson extends Employee
{
   private ArrayList<Room> rooms;

   public CleaningPerson(int number, String name) {
      super(number, name);
      this.rooms = new ArrayList<Room>();
   }
   
   public void addRoom(Room room) {
      rooms.add(room);
   }

   public void removeRoom(Room room) {
      rooms.remove(room);
   }

   public boolean cleansRoom(int roomNumber) {
      System.out.println("Room " + roomNumber + " has been cleaned");
      return true;
   }
   
   public ArrayList<Room> getRooms() {
      return rooms;
   }
}