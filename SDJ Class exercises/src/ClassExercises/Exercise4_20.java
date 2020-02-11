package ClassExercises;
import java.util.Scanner;
public class Exercise4_20
{
   public static void main(String[] args)
   {
      String name;

      Scanner input = new Scanner(System.in);
      System.out.println("Enter a name:");
      name = input.nextLine();

      if (name.equalsIgnoreCase("Timothy")) {
         System.out.println("Do i know you?");
      } else {
         System.out.println("Hello " + name + "!");
      }
      input.close();
   }
}