package Chapter_6;

import java.util.Scanner;

public class Exercise_14
{
   public static void main(String[] args) {
      @SuppressWarnings({ "resource"})
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number");
      int rem;
      String str = "";

      int num = in.nextInt();
      char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

      while (num > 0) {
         rem = num % 16;
         str = hex[rem] + str;
         num /= 16;
      }
      System.out.println("Hex number -> " + str);
   }
}