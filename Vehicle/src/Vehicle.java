public abstract class Vehicle
{
   private String owner;
   private double price;

   public Vehicle(String owner, double price) {
      this.owner = owner;
      this.price = price;
   }

   public String getOwner() {
      return owner;
   }

   public void setOwner(String owner) {
      this.owner = owner;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }


   public String toString() {
      return "Owner: " + owner + "\nPrice: " + price;
   }

   public boolean equals(Object arg) {
      if(!(arg instanceof Vehicle)) {
         return false;
      } else {
         Vehicle other = (Vehicle) arg;
         return owner == other.owner && price == other.price;
      }
   }
}