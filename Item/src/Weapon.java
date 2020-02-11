public class Weapon extends Item
{
   private double dbs;
   private boolean isLegendary;

   public Weapon(String itemName, String description, double dbs,
         boolean isLegendary) {
      super(itemName, description);
      this.dbs = dbs;
      this.isLegendary = isLegendary;
   }

   public Weapon(String itemName, String description, double dbs) {
      super(itemName, description);
      this.dbs = dbs;
   }

   public double getDbs() {
      return dbs;
   }

   public boolean isLegendary() {
      return isLegendary;
   }

   public boolean equals(Object o) {
      if (!(o instanceof Weapon)) {
         return false;
      } else {
         Weapon other = (Weapon) o;
         return super.equals(other) && dbs == other.dbs && isLegendary == other.isLegendary;
      }
   }

   public Weapon copy() {
      return new Weapon(getDescription(), getItemName(), dbs, isLegendary);
   }


   public String toString() {
      return "Weapon [dbs=" + dbs + ", isLegendary=" + isLegendary + "]";
   }
}