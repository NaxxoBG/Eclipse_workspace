// *****************************************************************************
// File name  : Integrate.java
// Start date :
// Programmer : Hans So.
// Java       : Java 1.7.0
// Description:
//
// Revision history:
//   date     init  comment
//
// *****************************************************************************
package Integrate;

public class Integrate
{
   public static double middleSum (Function f, double a, double b, int n) {

      double deltaX = (b-a) / n;
      double x = a + (deltaX / 2.0);
      double sum = 0.0;

      for (int i = 0; i < n; i++) {
         sum += f.f(x);
         x += deltaX;
      }
      return sum * deltaX;
   }
   
   public static double leftSum (Function f, double a, double b, int n) {

      double deltaX = (b-a) / n;
      double x = a;
      double sum = 0.0;

      for (int i = 0; i < n; i++) {
         sum += f.f(x);
         x += deltaX;
      }
      return sum * deltaX;
   }
   
   public static double rightSum (Function f, double a, double b, int n) {

      double deltaX = (b - a) / n;
      double x = a + deltaX;
      double sum = 0.0;

      for (int i = 0; i < n; i++) {
         sum += f.f(x);
         x += deltaX;
      }
      return sum * deltaX;
   }
}