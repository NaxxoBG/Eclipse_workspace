package realJavaBook;
import java.util.Scanner;
public class Exercise6 {
   public static void main(String[] args) {
      double a;
      double b;
      double h;
      System.out.println("Enter a: ");
      System.out.println("Enter b: ");
      System.out.println("Enter h: ");
      Scanner input = new Scanner(System.in);
      a = input.nextInt();
      b = input.nextInt();
      h = input.nextInt();
      input.close();
      double area1 = (a + b);
      double area2 = area1 / 2;
      double area3 = area2 * h;
      System.out.println("The area of the trapezoid is " + area3);
   }
}