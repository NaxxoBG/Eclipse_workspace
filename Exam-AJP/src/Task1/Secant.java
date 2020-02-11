package Task1;

public class Secant
{
   public static double secant(Function F, double x0, double x1, double epsilon) {
      double f1 = F.f(x0);
      double f2 = F.f(x1);
      double x = 0;

      while (Math.abs(x1 - x0) > epsilon) {
         x = (x0 - f2 - x1 * f1) / f2 - f1;
         f1 = F.f(x0);
         f2 = F.f(x1);
         x0 = x1;
         x1 = x;
      }
      return x;
   }

   public static double secRec(Function F, double x0, double x1, double epsilon) {
      double f1 = F.f(x0);
      double f2 = F.f(x1);
      double x = (x0 - f2 - x1 * f1) / f2 - f1;
      if (Math.abs(x1 - x0) > epsilon) {
         return x;
      } else {
         return secRec(F, x1, x, epsilon);
      }
   }

   public static void main(String[] args) {
      System.out.printf("%.2f\n", secant(x -> x * x * x - 5, 0, 125, 0.001));
      System.out.printf("%.2f", secRec(x -> x * x * x - 5, 0, 125, 0.001));
   }
}