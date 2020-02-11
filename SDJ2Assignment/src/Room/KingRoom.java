package Room;

@SuppressWarnings("serial")
public class KingRoom extends Room
{ 
   public KingRoom(int roomNumber) {
      super(roomNumber);
      super.price = 170;
      super.capacity = 2;
   }
}
