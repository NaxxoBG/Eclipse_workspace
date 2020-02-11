package Task1June2011;

public class Power
{
   public static double calcPower(double x, int n) {
      if (n == 0) {
         return 1;
      } else {
         return x * calcPower(x, n - 1);
      }
   }

   public static void main(String[] args) {
      System.out.println(calcPower(4, 4));
   }
}