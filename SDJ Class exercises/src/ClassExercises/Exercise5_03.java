package ClassExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5_03
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[] numbers = new int[5];
      int sum = 0;
      int numcount = 1;

      for (int number = 0; number < numbers.length; number++) {

         System.out.println("Please enter a number: ");
         numbers[number] = input.nextInt();
         System.out.println(numcount++ + ".\t" + "Number is: " + numbers[number]);
         sum += numbers[number];
         System.out.println("\nThe sum of the entered integers is: " + sum + ".");
      }

      Arrays.sort(numbers);
      int average = sum/5;
      System.out.println("The average of the entered numbers is: " + average + ".");
      System.out.println("The smallest number is: " + numbers[0] + ".");
      System.out.println("The largest num is: " + numbers[4] + ".");
      input.close();
   }
}