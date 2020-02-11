import java.util.ArrayList;

public class CarFerry
{
   private String name;
   private double weight;
   private double maxWeight;
   ArrayList<Vehicle> vehicles;

   public CarFerry(String name, double weight, double maxWeight) {
      this.name = name;
      this.weight = weight;
      this.maxWeight = maxWeight;
      vehicles = new ArrayList<Vehicle>();
   }

   public void addVehicle(Vehicle vehicle) {
      vehicles.add(vehicle);
   }

   public void removeVehicle(Vehicle vehicle) {
      vehicles.remove(vehicle);
   }

   public Vehicle getVehicle(String licensePlate) {
      for (Vehicle vehicle : vehicles) {
         if (vehicle.getLicensePlate().equals(licensePlate)) {
            return vehicle;
         }
      }
      return null;
   }

   public double getTotalWeight() {
      double total = 0;
      for (Vehicle vehicle : vehicles) {
         total += vehicle.getWeight();
      }
      return total + weight;
   }

   public boolean isOverWeight() {
      if (getTotalWeight() > maxWeight) {
         return true;
      } else {
         return false;
      }
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getWeight() {
      return weight;
   }

   public double getMaxWeight() {
      return maxWeight;
   }
}