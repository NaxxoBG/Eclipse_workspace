package Chapter_6;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_3
{
   public static void main(String[] args)
   {
      int counter = 1;
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      System.out.println("Enter number count");
      int num = in.nextInt();
      int[] numbers = new int[num];

      for (int i = 0; i < numbers.length; i++) {
         System.out.println("Enter number " + counter++);
         numbers[i] = in.nextInt();
      }
      Arrays.sort(numbers);
      System.out.println("The numbers are " + Arrays.toString(numbers));
      System.out.println("Largest: " + numbers[--num] + "\nSmallest: " + numbers[0]);
   }
}