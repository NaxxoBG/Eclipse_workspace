public class Apartment
{
   private int number;
   private Tenant tenant;

   public Apartment(int number) {
      this.number = number;
      tenant = null;
   }

   public int getNumber() {
      return number;
   }

   public boolean isAvailable() {
      if (tenant == null) {
         return true;
      } else {
         return false;
      }
   }

   public void rentTo(Tenant tenant, MyDate rentedFrom) {
      if (isAvailable()) {
         this.tenant = tenant;
         tenant.setRentedFrom(rentedFrom);
      } else 
         System.out.println("The room is not available");
   }

   public Tenant getTenant() {
      return tenant;
   }

   public String toString() {
      return String.format("**********\nNumber is: %s\nTenant is: %s\n**********", number, tenant);
   }
}