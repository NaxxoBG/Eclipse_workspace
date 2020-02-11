package ClassExercises;

import java.util.Scanner;

public class Exercise5_01
{
  public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[] numbers;
      numbers = new int[10];
      int number = 1; // number counter for first loop
      int number2 = 1; // number counter for second loop
      
     for ( int i = 0; i < numbers.length; i++) {
         
         System.out.println("Please enter a number: " + "\t");
         numbers[i] = input.nextInt();
         
         System.out.println(number++ + "." + "\tNumber " + " you have entered is:\t " + numbers[i] + ".");
     }
      
      input.close();
      System.out.println("\nThe numbers in reverse order are:");
      
      for (int i = numbers.length - 1; i >= 0; i--) {
         
         System.out.println("\nNumber "+ number2++ + " is:\t " + numbers[i] + ".");
      }
         System.out.println("\nThat was great!");
   }
}