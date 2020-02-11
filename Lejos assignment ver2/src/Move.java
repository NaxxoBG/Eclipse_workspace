public class Move
{
   private static int value;
   private String type;

   public Move( String type, int value) {
      this.value=value;
      this.type=type; 
   }

   public static int getValue() {
      return value;
   }

   public String getType() {
      return type;
   }
}