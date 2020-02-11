
public class Vehicle
{
   private int regNo;
   private String make;
   private String model;

   public Vehicle(int regNo, String make, String model) {
      this.regNo = regNo;
      this.make = make;
      this.model = model;
   }

   public String getMake() {
      return make;
   }

   public void setMake(String make) {
      this.make = make;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public int getRegNo() {
      return regNo;
   }
}