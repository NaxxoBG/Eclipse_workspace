package Task1June2009;

public class GoldenRatio
{
   public static double golden1(int n) {
      if (n == 0) {
         return 1;
      } else {
         return 1 + (1 / golden1(n - 1));
      }
   }

   public static double golden2(int n) {
      double res = 1;
      double a = 1;
      for (int i = 0; i < n; i++) {
         res = 1 + 1 / a;
         a = res;
      }
      return res;
   }

   public static void main(String[] args) {
      System.out.println(golden1(3));
      System.out.println("--------");
      System.out.println(golden2(3));
      System.out.println("--------");
   }
}