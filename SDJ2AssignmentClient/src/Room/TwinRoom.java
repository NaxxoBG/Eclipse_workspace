package Room;

@SuppressWarnings("serial")
public class TwinRoom extends Room
{
   public TwinRoom(int roomNumber) {
      super(roomNumber);
      super.price = 220;
      super.capacity = 2;
   }
}
