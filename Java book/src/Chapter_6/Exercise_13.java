package Chapter_6;

import java.util.Scanner;

public class Exercise_13
{
   public static void main(String[] args) {
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a binary number");
      String num = in.nextLine();

      System.out.println("The number converted to binary is " + Integer.parseInt(num, 2));
   }
}