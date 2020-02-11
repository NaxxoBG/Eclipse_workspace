package Chapter_5;

import java.util.Scanner;

public class Exercise_7
{
   public static void main(String[] args)
   {
      int a, b, c;
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      System.out.println("Enter three numbers");
      a = in.nextInt();
      b = in.nextInt();
      c = in.nextInt();

      if (a + b == 0) {
         System.out.println(a + " and " + b);
         if (a + c == 0) {
            System.out.println(a + " and " + c);
         } else if (b + c == 0) {
            System.out.println(b + " and " + c);
         }
      } else if (a + c == 0) {
         System.out.println(a + " and " + c);
         if (a + b == 0) {
            System.out.println(a + " and " + b);
         } else if (b + c == 0) {
            System.out.println(b + " and " + c);
         }
      } else if (b + c == 0) {
         System.out.println(b + " and " + c);
         if (a + c == 0) {
            System.out.println(a + " and " + c);
            if (a + b == 0) {
               System.out.println(a + " and " + b);
            }
         }
      }
   }
}