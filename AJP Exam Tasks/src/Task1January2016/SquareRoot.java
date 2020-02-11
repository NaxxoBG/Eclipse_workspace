package Task1January2016;

public class SquareRoot
{
   public static double sqrRoot(double a, double x, double epsilon) {
      while (Math.abs(x * x - a) > epsilon) {
         x = (x + a / x) / 2;
      }
      return x;
   }

   public static double sqrRootRec(double a, double x, double epsilon) {
      if (Math.abs(x * x - a) < epsilon) {
         return x;
      } else {
         return sqrRootRec(a, 0.5 * (x + a / x), epsilon);
      }
   }

   public static double biSection(Function fct, double left, double right, double epsilon){
      double l = left;
      double r = right;
      while (Math.abs(fct.f(l) - fct.f(r)) > epsilon) {
         double middle = (l + r) / 2;
         if (fct.f(l) * fct.f(middle) > 0)
            l = middle;
         else r = middle;
      }
      return (l + r) / 2;
   }

   public static void main(String[] args) {
      System.out.println(sqrRoot(64, 4, 0.01));
      System.out.println(sqrRootRec(64, 4, 0.01));
      System.out.println(biSection(x -> x * x - 2, 0, 3, 0.01));
   }  
}