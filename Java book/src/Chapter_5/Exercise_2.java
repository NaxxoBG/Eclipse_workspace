package Chapter_5;

import java.util.Scanner;

public class Exercise_2
{

   public static void main(String[] args)
   {
      int a = 0, b = 0;
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      System.out.println("Enter numbers");
      a = in.nextInt();
      b = in.nextInt();
      if (a < 0 && b < 0) {
         System.out.println("+");
      } else if (a > 0 && b < 0) {
         System.out.println("-");
      } else if (a < 0 && b > 0) {
         System.out.println("-");
      } else {
         System.out.println("+");
      }
   }
}