package Facade;

public class FacadeTest
{
   public static void main(String[] args) {
      VehicleMaker maker = new VehicleMaker();

      maker.makeCar();
      maker.makeTruck();
      maker.makeBoat();
   }
}