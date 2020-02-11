package Chapter_6;

import java.util.Scanner;

public class Exercise_6_b
{
   public static void main(String[] args)
   {
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      int n, k;
      long sum = 1;
      System.out.println("Enter first number");
      n = in.nextInt();
      System.out.println("Enter second number");
      k = in.nextInt();

      while (n < k) {
         System.out.println("N must be greater than k");
         System.out.println("Enter first number");
         n = in.nextInt();
         System.out.println("Enter second number");
         k = in.nextInt();
      }

      for (int i = k + 1; i <= n; i++) {
         sum *= i;
      }

      System.out.println("N!/K! = " + sum);
   }
}