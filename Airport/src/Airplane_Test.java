public class Airplane_Test
{
   public static void main(String[] args) 
   {
      Passenger pas1 = new Passenger("John", "Street 1");
      Passenger pas2 = new Passenger("Dave", "Street 2");
      Passenger pas3 = new Passenger("Nick", "Street 3");
      Passenger pas4 = new Passenger("Luke", "Street 4");

      Passenger[] pass1 = {pas1, pas2};
      Passenger[] pass2 = {pas3, pas4};

      Airplane air1 = new Airplane("Boeing", 200);
      Airplane air2 = new Airplane("MiG", 2);

      Airport airport = new Airport("Street 5");

      System.out.println(air1);
      air1.BoardPlane(pass1);
      System.out.println(air1);
      System.out.println(air2);

      air2.BoardPlane(pass2);
      System.out.println(air2);

      System.out.println(air1.equals(air2));
      System.out.println(air2.isFull());

      System.out.println(airport);
      airport.landAirplane(air1);
      airport.landAirplane(air2);
      System.out.println(airport);
      airport.takeOffAirplane(air2);
      System.out.println(airport);
      System.out.println(airport.largestAirplane());


   }
}