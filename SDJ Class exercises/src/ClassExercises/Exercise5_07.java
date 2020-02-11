package ClassExercises;

import java.util.Scanner;

public class Exercise5_07
{
   public static void main(String[] args)
   {
      //Declare a scanner,array size and array
      Scanner input = new Scanner(System.in);
      int size, negativeSum = 0,negativeCount = 0;
      int[] numbers;

      //Ask for the size of the array and printing it out on the console
      System.out.println("Enter size of the array: ");
      size = input.nextInt();
      numbers = new int[size];
      System.out.println("The size of the array is: " + size-- + ".");

      //Entering a number of values depending on the size
      System.out.println("\nNUMBER INPUT");
      for (int i = 0; i<numbers.length; i++) {
         System.out.println("\nEnter a number:");
         numbers[i] = input.nextInt();
      }
      //Print the array to the console and check for negative values(sum and count)
      System.out.print("The array\'s values are: [");
      for(int i = 0; i<numbers.length; i++) {
         System.out.print(" " + numbers[i] + ";");

         if (numbers[i] < 0) {
            negativeSum += numbers[i];
            negativeCount++;
         }
      }
      System.out.println(" ]");

      //Print out the sum of the negative values in the array and their number
      System.out.println("\nThe number of negative values is " + negativeCount + " and their sum is "  + negativeSum + ".");
      input.close();
   }
}