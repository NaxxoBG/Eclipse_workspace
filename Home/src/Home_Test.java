public class Home_Test
{
   public static void main(String[] args)
   {
      Home apartment = new Apartment("Street 1", 400);
      Home house = new House("Street 2", 25000);

      System.out.println(house.getInfo());
      System.out.println(apartment.getInfo());

      Person guy1 = new Person("Jack", apartment);
      Person guy2 = new Person("Dave", house);

      System.out.println(guy1);
      System.out.println(guy2.getHomeInfo());
   }
}