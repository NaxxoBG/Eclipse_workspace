
public class Driver extends Person
{
   private String companyName;
   private Vehicle vehicle;

   public Driver(String name, String address, int telephone,
         String companyName, Vehicle vehicle) {
      super(name, address, telephone);
      this.companyName = companyName;
      this.vehicle = vehicle;
   }

   public String getCompanyName() {
      return companyName;
   }

   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   public Vehicle getVehicle() {
      return vehicle;
   }

   public boolean hasVehicle() {
      if (vehicle == null) {
         return false;
      } else {
         return true;
      }
   }
}