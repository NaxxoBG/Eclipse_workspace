public class Bed
{
   // Room ----> Bed (Composition)

   private String type;

   private static final String[] TYPES = {"Single", "Double", "Kingsize"};

   public Bed(String type) {
      this.type = type;
   }

   public boolean isSingle() {
      return type.equals(TYPES[0]);
   }

   public boolean isDouble() {
      return type.equals(TYPES[1]);
   }

   public boolean isKingSize() {
      return type.equals(TYPES[2]);
   }
}