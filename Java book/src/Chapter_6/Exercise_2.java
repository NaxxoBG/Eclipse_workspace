package Chapter_6;

import java.util.Scanner;

public class Exercise_2
{
   public static void main(String[] args)
   {
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number");
      int n = in.nextInt();
      for (int i = 0; i <= n; i++) {
         if (i % 3 == 0 && i % 7 == 0) {
            continue;
         }
         System.out.print(i + "; ");
      }

   }
}