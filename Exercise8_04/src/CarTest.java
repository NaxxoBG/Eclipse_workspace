
public class CarTest
{
   public static void main(String[] args)
      {
         Car car = new Car(null, null, null);
         String colour = car.getColour();
         String owner = car.getOwner();
         String regnumber = car.getRegnumber();
         System.out.println("The car's colour is " + colour + ", the owner is " + owner + " and the registration number is " + regnumber + ".");
      
      Car car2 = new Car("red", "Richard", "45654754");
      System.out.println("The car's colour is " + car2.colour + ", the owner is " + car2.owner + " and the registration number is " + car2.regnumber + ".");
      }
}