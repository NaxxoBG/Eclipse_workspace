package Facade;

public class VehicleMaker
{
   private Car car;
   private Boat boat;
   private Truck truck;

   public VehicleMaker() {
      car = new Car();
      truck = new Truck();
      boat = new Boat();
   }

   public void makeCar() {
      car.make();
   }

   public void makeTruck() {
      truck.make();
   }

   public void makeBoat() {
      boat.make();
   }
}