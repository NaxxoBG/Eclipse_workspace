package ClassExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5_02
{
   public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
         int numcount = 1;
         int[] numbers = new int [7];
          
         for (int i = 0; i < numbers.length; i++) {
            
            System.out.println("Enter a number: ");
            numbers[i] = input.nextInt();
         
            System.out.println(numcount++ + ". " + "\tThe entered number is " + numbers[i] + ".");
         }
        input.close();
        Arrays.sort(numbers); 
        System.out.println("\nThe sorted array: "); 
        for ( int i : numbers) {
           
           System.out.println("\nNumber is " + i + ".");
        }
           System.out.println("\nThe smallest number is " + numbers[0] + ".");
      }
}