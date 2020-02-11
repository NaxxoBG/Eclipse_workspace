package Server;

import Client.VehicleMakerInterface;

public class VehicleMaker implements VehicleMakerInterface
{
   private Car car;
   private Boat boat;
   private Truck truck;
   
   public void makeCar() {
      car = new Car();
      car.make();
   }

   public void makeTruck() {
      truck = new Truck();
      truck.make();
   }

   public void makeBoat() {
      boat = new Boat();
      boat.make();
   }
}