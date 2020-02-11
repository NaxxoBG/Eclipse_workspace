public class CarFerry_Test
{
   public static void main(String[] args)
   {
      Vehicle vehicle1 = new Vehicle("3462GK", 650);
      Vehicle vehicle2 = new Vehicle("2894TX", 800);

      CarFerry ferry = new CarFerry("Ferrybot", 5000, 5500);

      ferry.addVehicle(vehicle1);
      ferry.addVehicle(vehicle2);
      System.out.println(vehicle1);
      System.out.println(ferry.getTotalWeight());
      System.out.println(ferry.isOverWeight());
      System.out.println(ferry.getVehicle("2894TX"));
   }
}