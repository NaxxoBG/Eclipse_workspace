package realJavaBook;
import java.util.Scanner;
public class Exercise8 {
   public static void main(String[] args) {
      double x;
      double y;
      System.out.println("Enter x: ");
      System.out.println("Enter y: ");
      Scanner input = new Scanner(System.in);
      x = input.nextInt();
      y = input.nextInt();
      input.close();
      boolean isInCircle = Math.sqrt(x*x + y*y) <= 5;
      boolean isOutsideRectangle = x < -1 || x > 5 ||  y < 1 || y > 5;
      boolean isInCircleAndOutsideRectangle = isInCircle && isOutsideRectangle;
      System.out.println(isInCircleAndOutsideRectangle);
   }
}