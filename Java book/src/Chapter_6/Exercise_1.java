package Chapter_6;

import java.util.Scanner;

public class Exercise_1
{
   public static void main(String[] args)
   {
      System.out.println("Enter a number");
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();

      for (int i = 1; i <= n; i++) {
         System.out.print(i + "; ");
      }
   }
}