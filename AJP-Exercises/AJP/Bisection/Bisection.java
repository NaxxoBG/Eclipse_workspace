package Bisection;

import Integrate.Function;

public class Bisection
{
   static Function F = x -> Math.pow(x,3) + 4 * Math.pow(x,2) - 10;

   public static double solveEq(Function F, final double left,final double right,final double epsilon ) {
      if (F.f(left) * F.f(right) > 0) {
         return 0;
      }
      if (Math.abs(right-left) < epsilon) {
         return (left + right) / 2;
      }
      double middle =  (left + right) / 2;
      if (F.f(left) * F.f(middle) > 0) {
         return solveEq(F, middle, right, epsilon);
      } else { 
         return solveEq(F, left, middle, epsilon);
      }
   }

   public static double solveEqIterative(Function F, final double left,final double right,final double epsilon ) {
      double a = left;
      double b = right;
      double middle = 0;
      if (F.f(left) * F.f(right)>0) {
         return 0;
      }
      while (Math.abs(a - b) > epsilon) {
         middle = (a + b) / 2.0;
         if (F.f(a) * F.f(middle) > 0) {
            a = middle;
         } else { 
            b = middle; 
         }
      }
      return middle;
   }
}