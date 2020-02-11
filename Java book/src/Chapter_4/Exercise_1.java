package Chapter_4;

import java.util.Scanner;

public class Exercise_1
{
   public static void main(String[] args)
   {
      int a, b, c = 0;
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      System.out.println("Enter three numbers:");
      a = in.nextInt();
      b = in.nextInt();
      c = in.nextInt();

      int sum = a + b + c;
      System.out.println("The sum is " + sum);
   }
}