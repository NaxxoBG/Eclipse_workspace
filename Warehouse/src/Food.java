public class Food extends Item
{
   private MyDate date;

   public Food(String name, int amount, int id, MyDate date) {
      super(name, amount, id);
      this.date = date;
   }

   public MyDate getExpireDate() {
      return date;
   }

   public boolean equals(Object o) {
      if (!(o instanceof Food)) {
      return false;
      } else {
         Food other = (Food) o;
         return getName().equals(other.getName()) && getAmount() == other.getAmount() && getID() == other.getID();
      }
   }
}