package Room;

@SuppressWarnings("serial")
public class SingleRoom extends Room
{
   public SingleRoom(int roomNumber) {
      super(roomNumber);
      super.price = 110;
      super.capacity = 1;
   }
}