package Task1June2013;

import java.util.function.Function;

public class Power
{
   public static long power(long x, int n) {
      if (n == 0) {
         return 1;
      } else {
         return x * power(x, n - 1);
      }
   }

   public static long iterativePow(long x, int n) {
      long res = x;
      if (n == 0) {
         return 1;
      } else {

         for (int i = 1; i < n; i++) {
            res = res * x;
         }
      }
      return res;
   }

   public static long powerFormula2(long x, int n) {
      Function<Long, Long> sqr = r -> r * r;
      if (n == 0) {
         return 1;
      } else if (n % 2 == 0) {
         return sqr.apply(power(x, n / 2));
      } else {
         return x * power(x, n - 1);
      }
   }

   public static void main(String[] args) {
      for (int i = 1; i < 12; i++) {
         System.out.println("Test " + i);
         System.out.println(Power.power(2, i));
         System.out.println("---------------");
         System.out.println(Power.iterativePow(2, i));
         System.out.println("---------------");
         System.out.println(Power.powerFormula2(2, i));
         System.out.println("---------------\n");
      }
   }
}