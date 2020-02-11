
public class Bed
{
   private String type;

   public Bed(String type) {
      this.type = type;
   }

   public boolean isSingle() {
      if (type.equals("Single")) {
         return true;
      } else {
         return false;
      }

   }
   public boolean isDouble() {
      if (type.equals("Double")) {
         return true;
      } else {
         return false;
      }
   }

   public boolean isKingSize() {
      if (type.equals("King Size")) {
         return true;

      } else {
         return false;
      }
   }
}