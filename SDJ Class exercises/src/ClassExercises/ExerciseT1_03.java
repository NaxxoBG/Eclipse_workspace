package ClassExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseT1_03 {

   public static void main(String[] args) {
      //DECLARATIONS
      int number = 1;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter size of the array: ");
      int size = input.nextInt();
      int[] numbers = new int[size];
      int counter = 1;

      System.out.println("The size of the array is: " + size-- + ".");

      for (int i = 0; i < numbers.length; i++) {
         System.out.println("\nPlease enter a number: " + "\t");
         numbers[i] = input.nextInt();
         System.out.println(number++ + "." + "\tNumber " + "you have entered is:\t " + numbers[i] + ".");
      }

      int min = Arrays.stream(numbers).filter(i -> i >= 0).min().orElse(0);
      System.out.println("\n*****************************************");
      System.out.println("Array number COUNT: " + --number);
      System.out.println("******************************************");

      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] < 100 && numbers[i] > 9) {
            counter++;
            System.out.println( "The two digit number is " + numbers[i]);
         } else {
            System.out.println("The number is " + numbers[i]);
         }
      }

      System.out.println("******************************************");
      System.out.println("The SMALLEST positive number is " + min);
      System.out.println("Number of POSITIVE TWO-DIGIT numbers is " + --counter);
      Arrays.sort(numbers);

      for(int i = 1; i < numbers.length; i++) {
         if (numbers[i] == numbers[i - 1]) {
            System.out.println("Duplicate: " + numbers[i]);
         }
      }
      System.out.println("******************************************");
      input.close();
   }
}
/**Write a program that creates an integer array and assign some values to it using keyboard input
Print out the smallest positive number from the array
Count and print out the number of positive two-digit numbers in the array
For each element in the array count and print out the number of elements in the array with the same value.
public class ExerciseT1_03**/