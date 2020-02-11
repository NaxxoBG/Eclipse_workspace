package Chapter_5;

import java.util.Scanner;

public class Exercise_1
{
   public static void main(String[] args)
   {
      int a, b, c;
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      System.out.println("Enter numbers:");
      a = in.nextInt();
      b = in.nextInt();

      if (a > b) {
         c = a;
         a = b;
         b = c;
         System.out.println("The numbers are " + a + " and " + b);
      } else {
         System.out.println("The numbers are " + a + " and " + b);
      }
   }
}