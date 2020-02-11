public class Electronic extends Item
{
   private int yearsOfWarranty;
   private boolean previouslyOwned;

   public Electronic(String name, int amount, int id, int yearsOfWarranty,
         boolean previouslyOwned) {
      super(name, amount, id);
      this.yearsOfWarranty = yearsOfWarranty;
      this.previouslyOwned = previouslyOwned;
   }

   public int getYearsOfWarranty() {
      return yearsOfWarranty;
   }

   public boolean hasBeenOwned() {
      return previouslyOwned;
   }

   public boolean equals(Object o) {
      if (!(o instanceof Electronic)) {
         return false;
      }
      else {
         Electronic other = (Electronic) o;
         return getName().equals(other.getName())
               && getAmount() == other.getAmount() && getID() == other.getID()
               && yearsOfWarranty == other.yearsOfWarranty
               && previouslyOwned == other.previouslyOwned;
      }
   }
}