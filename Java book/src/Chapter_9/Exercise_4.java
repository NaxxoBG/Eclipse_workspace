package Chapter_9;

import java.util.Scanner;

public class Exercise_4
{

   private static void numOccurrence(int number, int... numbers) {
      int counter = 0;
      for (int i : numbers) {
         if (i == number) {
            counter++;
         }
      }
      System.out.println(number + " occurs " + counter + " times");
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number to see how many times it occurs in the array");
      int num = in.nextInt();

      int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 8, 8, 8, 9, 10};

      numOccurrence(num, array);
      in.close();
   }
}
