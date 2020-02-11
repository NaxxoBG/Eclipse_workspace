package Chapter_6;

import java.util.Scanner;

public class Exercise_11
{
   @SuppressWarnings("resource")
   public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

      System.out.println("Enter a number");
      int input = in.nextInt();

      char[] digits = String.valueOf(factorial(input)).toCharArray();
      int arrLength = digits.length;
      int counter = 0;

      while (digits[arrLength - 1] == '0') {
         counter++;
         arrLength--;
      }

      System.out.println("The factorial of " + input + " is -> " + factorial(input));
      System.out.println("Number of zeros at the end of the number is -> " + counter);
   }

   public static long factorial(int num) {
      long sum = 1;
      for (int i = 1; i <= num; i++) {
         sum *= i;
      }
      return sum;
   }

   public static long RecursiveFactorial(int num) {
      if (num == 1) {
         return 1;
      }
      return num * factorial(num - 1);
   }
}