package Room;

@SuppressWarnings("serial")
public class Suite extends Room
{
   protected Suite(int roomNumber, int capacity) {
      super(roomNumber);
      switch (capacity) {
         case 2:
            super.capacity = 2;
            super.price = 340;
            break;
         case 3:
            super.capacity = 3;
            super.price = 450;
            break;
         default:
            break;
      }
   }
}