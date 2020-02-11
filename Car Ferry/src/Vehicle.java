public class Vehicle
{
   private String licensePlate;
   private double weight;

   public Vehicle(String licensePlate, double weight) {
      this.licensePlate = licensePlate;
      this.weight = weight;
   }

   public String getLicensePlate() {
      return licensePlate;
   }

   public double getWeight() {
      return weight;
   }


   public String toString() {
      return "Vehicle \nLicense plate: " + licensePlate + "\nWeight: " + weight;
   }

   public boolean equals(Object o) {
      if(!(o instanceof Vehicle)) {
         return false;
      } else {
         Vehicle other = (Vehicle) o;
         return licensePlate.equals(other.licensePlate) && weight == other.weight;
      }
   }
}