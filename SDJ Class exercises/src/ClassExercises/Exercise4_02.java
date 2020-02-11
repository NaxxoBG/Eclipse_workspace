package ClassExercises;
import java.util.Scanner;
public class Exercise4_02
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double sum = 0;
      double average = 0;

      // For Loop

      for (int i = 0; i < 5; i++) {

         System.out.println("Type an integer:");
         int value = input.nextInt();

         sum += value;
         average = sum / 5;

         // End of For Loop
      }
      System.out.println("The sum is " + sum + " and the average is " + average + ".");
      input.close();
   }
}