import java.util.ArrayList;

public class Vehicle_Test
{
   public static void main(String[] args)
   {
      ArrayList<Vehicle> vehicles = new ArrayList<>();

      Vehicle car = new Car("Jake", 5000, "FZ4793");
      Vehicle bike = new Bicycle("Dean", 400, 5);
      Vehicle van = new Van("Sam",10000 , "JL2568", 1500);
      Vehicle sportsCar = new SportsCar("Bill", 25000, "GE1739", 70);

      vehicles.add(car);
      vehicles.add(bike);
      vehicles.add(van);
      vehicles.add(sportsCar);

      System.out.println(vehicles);
   }
}