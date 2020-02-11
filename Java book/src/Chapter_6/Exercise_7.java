package Chapter_6;

import java.util.Scanner;

public class Exercise_7
{

   public static void main(String[] args)
   {
      try {
         @SuppressWarnings("resource")
         Scanner in = new Scanner(System.in);
         System.out.println("Enter first number");
         int n = in.nextInt();
         System.out.println("Enter second number");
         int k = in.nextInt();

         long result = factorial(n)*factorial(k)/(factorial(n-k));

         System.out.println("Result: " + result);
      } catch (Error e) {
         System.out.println("ERROR");
         System.out.println("N must be greater than K");
      }
   }

   public static long factorial(int num) {
      if (num == 0) {
         return 1;
      }

      return num * factorial(num - 1);
   }
}