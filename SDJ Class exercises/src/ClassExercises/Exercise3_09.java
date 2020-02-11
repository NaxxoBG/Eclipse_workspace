package ClassExercises;
import java.util.Scanner;
public class Exercise3_09
{
   public static void main(String[] args)
   {
      int a, b, c;
      double x1, x2, x3;
      double determinant;
      Scanner input = new Scanner(System.in);

      System.out.println("Enter value for \na:\nb:\nc:\n");
      a = input.nextInt();
      b = input.nextInt();
      c = input.nextInt();

      determinant = Math.pow(b,2) - 4 * a * c;
      x1 = -b/2*a;
      x2 = (-b + Math.sqrt(determinant))/2*a;
      x3 = (-b - Math.sqrt(determinant))/2*a;

      if (a == 0 || b == 0 || determinant < 0) {
         System.out.println("The equation has no solutions!");

      } else if (determinant == 0) {
         System.out.println("The solution is " + x1 );

      } else if (determinant > 0) {
         System.out.println("The first solution is " + x2 + " and the second solution is " + x3 + ".");
      }
      input.close();
   }
}