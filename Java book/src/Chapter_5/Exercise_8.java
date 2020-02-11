package Chapter_5;

import java.util.Scanner;

public class Exercise_8
{
   public static void main(String[] args)
   {
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      int a = 0;

      while (a <= 0 || a > 9) {
         System.out.println("Enter a number(1-9)");
         a = in.nextInt();
      }

      switch (a) {
         case 1:
         case 2:
         case 3:
            System.out.println("Multiplied by 10");
            a *= 10;
            break;
         case 4:
         case 5:
         case 6:
            System.out.println("Multiplied by 100");
            a *= 100;
            break;
         case 7:
         case 8:
         case 9:
            System.out.println("Multiplied by 1000");
            a *= 1000;
            break;
      }
      System.out.println("Total points: " + a);
   }
}