package Chapter_9;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7
{
   private static int reverseNumber(int number) {
      String[] digits = Integer.toString(number).split("");
      String[] result = new String[digits.length];
      for (int i = digits.length - 1; i >= 0; i--) {
         result[i] = digits[digits.length - i - 1];
      }
      return Integer.parseInt(Arrays.toString(result).replaceAll("\\[|\\]|,|\\s", ""));
   }

   private static int reverseNumber2(int number) {
      int reversedNum = 0;

      while (number != 0) {
         int lastDigit = number % 10;
         reversedNum = lastDigit + reversedNum * 10;
         number /= 10;
      }
      return reversedNum;
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = in.nextInt();
      System.out.println(String.format("The reversed number is %d from %d", reverseNumber(num), num));
      System.out.println(String.format("The reversed number with method 2 is %d from %d", reverseNumber2(num), num));
      in.close();
   }
}