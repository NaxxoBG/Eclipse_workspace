package Task1June2011;

public class Factorial
{
   public static long factorial(int n) {
      long res = 1;
      for (int i = 1; i <= n; i++) {
         res *= i;
      }
      return res;
   }

   public static void main(String[] args) {
      System.out.println(factorial(5));
   }
}