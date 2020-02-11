public class Tenant
{
   private String name;
   private MyDate rentedFrom;

   public Tenant(String name) {
      this.name = name;
      rentedFrom = new MyDate();
   }

   public String getName() {
      return name;
   }

   public MyDate getRentedFrom() {
      return rentedFrom.copy();
   }

   public void setRentedFrom(MyDate date) {
      rentedFrom = date.copy();
   }

   public boolean equals(Object obj) {
      if (!(obj instanceof Tenant)) {
         return false;
      } else {
         Tenant other = (Tenant) obj;
         return name.equals(other.name);
      }
   }

   public String toString() {
      return String.format("Tenant's name: %s\nRoom rented on: %s", name, rentedFrom);
   }
}