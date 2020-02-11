package ClassExercises;

import java.util.Scanner;

public class ExerciseT1_02
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[] array = new int[4];

      for (int i = 0; i < array.length; i++) {

         System.out.println("Enter number: ");
         array[i] = input.nextInt();
      }

      for (int i = 0; i < array.length; i++) {
         System.out.println("Number is " + array[i]);
      }

      input.close();
      System.out.println("\nThe numbers in reverse order");

      for (int i = array.length - 1; i >= 0; i--) {

         System.out.print("\nNumber is " + array[i]);
      }
   }
}