package Chapter_8;

import java.util.Scanner;

public class Exercise_12
{
   public static String arabicToRoman(int arabic) {
      if (arabic < 1 || arabic > 3999) {
         return "Invalid Roman Number Value";
      }
      StringBuilder s = new StringBuilder();

      while (arabic >= 1000) {
         s.append("M");
         arabic -= 1000;        
      }
      while (arabic >= 900) {
         s.append("CM");
         arabic -= 900;
      }
      while (arabic >= 500) {
         s.append("D");
         arabic -= 500;
      }
      while (arabic >= 400) {
         s.append("CD");
         arabic -= 400;
      }
      while (arabic >= 100) {
         s.append("C");
         arabic -= 100;
      }
      while (arabic >= 90) {
         s.append("XC");
         arabic -= 90;
      }
      while (arabic >= 50) {
         s.append("L");
         arabic -= 50;
      }
      while (arabic >= 40) {
         s.append("XL");
         arabic -= 40;
      }
      while (arabic >= 10) {
         s.append("X");
         arabic -= 10;
      }
      while (arabic >= 9) {
         s.append("IX");
         arabic -= 9;
      }
      while (arabic >= 5) {
         s.append("V");
         arabic -= 5;
      }
      while (arabic >= 4) {
         s.append("IV");
         arabic -= 4;
      }
      while (arabic >= 1) {
         s.append("I");
         arabic -= 1;
      }
      return s.toString();
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      while (number != 0) {
         String roman = arabicToRoman(number);
         System.out.println("Arabic -> " + number + " || Roman -> " + roman);
         number = in.nextInt();
      }
      in.close();
   }
}