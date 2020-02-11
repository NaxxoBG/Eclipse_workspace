package Chapter_6;

import java.util.Scanner;

public class Exercise_15
{
   public static void main(String[] args) {
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a hex number");
      String s = in.nextLine();
      String digits = "0123456789ABCDEF";
      s = s.toUpperCase();
      int val = 0;
      for (int i = 0; i < s.length(); i++) {
         char c = s.charAt(i);
         int d = digits.indexOf(c);
         val = 16 * val + d;
      }
      System.out.println(val);
   }
}