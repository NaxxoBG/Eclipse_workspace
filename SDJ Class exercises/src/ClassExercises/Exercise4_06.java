package ClassExercises;
import java.util.Scanner;
public class Exercise4_06
{

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int num = 0, count = 0;

      while ( num != -1) {
         System.out.println("Enter a number:\nIf you want to exit, enter -1.");
         num = input.nextInt();

         count++;
      }
      System.out.println("Your entry count is " + --count + ".");
      input.close();
   }
}