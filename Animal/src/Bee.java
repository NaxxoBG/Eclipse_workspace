public class Bee extends Animal
{
   private boolean isAHoneyBee;

   public boolean isAHoneyBee() {
      return isAHoneyBee;
   }

   public void setAHoneyBee(boolean isAHoneyBee) {
      this.isAHoneyBee = isAHoneyBee;
   }

   public String speak() {
      return "Zuum";
   }

   public boolean equals(Object o) {
      if (!(o instanceof Bee)) {
         return false;
      } else {
         Bee other = (Bee) o;
         return isAHoneyBee == other.isAHoneyBee;
      }
   }
}