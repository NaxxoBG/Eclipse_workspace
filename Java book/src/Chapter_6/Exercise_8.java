package Chapter_6;

import java.util.Scanner;

public class Exercise_8
{
   public static void main(String[] args)
   {
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a value for n");
      int n = in.nextInt();
      System.out.println("Enter a value for x");
      int x = in.nextInt();

      double S = 0;
      double F = 0;
      int sum = 1;

      for (int i = 1; i <= n; i++) {
         //sum *= i instead of factorial(i)
         S += ((sum *= i) / Math.pow(x,i));
         F += ((factorial(i)) / Math.pow(x,i));        
      }
      System.out.println(S + 1);
      System.out.println(F + 1);
   }

   private static long factorial(int num) {
      if (num ==  0) {
         return 1;
      }
      return num * factorial(num - 1);
   }
}
