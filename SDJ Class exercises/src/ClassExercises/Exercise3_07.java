package ClassExercises;
import java.util.Scanner;
public class Exercise3_07
{
   public static void main(String[] args)
   {
      int age;
      Scanner input = new Scanner(System.in);

      System.out.println("Please enter your age:");
      age = input.nextInt();

      if (age <= 0) {
         System.out.println("Error in age value!");
      } else if (age > 0 && age < 12) {

         System.out.println("You are a child.");
      } else if (age >= 12 && age <= 19) {

         System.out.println("You are a teenager.");
      } else if (age >= 19 && age <= 65) {
         System.out.println("You are an adult.");

      } else if ( age > 65) {

         System.out.println("You are a senior citizen.");
      }
      input.close();
   }
}