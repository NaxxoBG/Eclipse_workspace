package realJavaBook;

import java.util.Scanner;

public class Exercise9
{
   public static void main(String[] args) {
      double x;
      double y;
      System.out.println("Enter x: ");
      System.out.println("Enter y: ");
      Scanner input = new Scanner(System.in);
      x = input.nextInt();
      y = input.nextInt();
      input.close();
      double c = x * x + y * y;
      if (c <= 5) {
         System.out.println("The point is in the circle.");
      } else {
         System.out.println("The point is not in the circle.");
      }
   }
}