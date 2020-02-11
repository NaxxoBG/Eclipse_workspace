
public class Test
{
   public static void main(String[] args)
   {
      @SuppressWarnings("unused")
      Bed bed1 = new Bed("Single");

      Guest guest1 = new Guest("John");

      Room room1 = new Room(801, "Double");

      room1.registerGuest(guest1);

      System.out.println(room1.getGuest());
      System.out.println(room1.getGuest().getName());
      System.out.println(room1.getPrice());
      System.out.println(room1.getBedType());
      System.out.println(room1.isOccupied());
      System.out.println(room1.getFloor());
      System.out.println(room1.getNumber());
      System.out.println("----------------------");

      room1.vacate();

      System.out.println("----------------------");
      System.out.println(room1.isOccupied());
      room1.vacate();
      System.out.println(room1.getGuest());
      
      room1.registerGuest(guest1);
      
      System.out.println(room1.getGuest());
   }
}