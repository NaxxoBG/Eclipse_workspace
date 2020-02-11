package Task1June2011;

public class Exp
{
   public static double exp(int e, int n) {
      return Power.calcPower(e, n) / Factorial.factorial(e);
   }

   public static void main(String[] args) {
      System.out.println(exp(4, 5));
   }
}