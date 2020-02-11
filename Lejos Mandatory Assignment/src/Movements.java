//Class from which the movement objects are instantiated. Object has a value(cm or degrees) and a type(forward, left or right);
public class Movements
{
   private int value;
   private String type;

   public Movements(String type, int value) {
      this.value = value;
      this.type = type;
   }

   public int getValue() {
      return value;
   }

   public void setValue(int power) {
      this.value = power;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }
}