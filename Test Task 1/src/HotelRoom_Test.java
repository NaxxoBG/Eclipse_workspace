import java.util.Scanner;
public class HotelRoom_Test
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      HotelRoom room1 = new HotelRoom(200, 60);
      HotelRoom room2 = new HotelRoom(300,70,"Zack");

      System.out.println(room1.isAvailable());
      System.out.println(room2.isAvailable());
      
      room2.checkOut();
      room1.checkIn("John");
      
      System.out.println("Please enter a rent");
      double newRent = input.nextDouble();
      
      while (newRent < 0) {
         System.out.println("The rent should be a valid number! Enter again!");
         newRent = input.nextDouble();
         room2.setRent(newRent);
      }
      
      System.out.println(room1.toString());
      System.out.println(room2.toString());
      
      input.close();
   }
}