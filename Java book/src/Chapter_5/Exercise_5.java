package Chapter_5;

import java.util.Scanner;

public class Exercise_5
{
   public static void main(String[] args)
   {
      @SuppressWarnings({ "resource" })
      Scanner in = new Scanner(System.in);
      int a, b, c;
      double x1, x2, x3;
      double determinant;

      System.out.println("Enter a, b, c");
      a = in.nextInt();
      b = in.nextInt();
      c = in.nextInt();

      determinant = Math.pow(b, 2) - 4 * a * c;
      x1 = -b/2*a;
      x2 = (-b + Math.sqrt(determinant))/2*a;
      x3 = (-b - Math.sqrt(determinant))/2*a;

      if (a == 0 || b == 0 || determinant < 0) {
         System.out.println("The equation does not have roots");
      } else if (determinant == 0) {
         System.out.println("The root is " + x1);
      } else if (determinant > 0) {
         System.out.println("The roots are " + x2 + " and " + x3);
      }
   }
}