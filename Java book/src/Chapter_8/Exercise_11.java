package Chapter_8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_11
{

   public static int romanToArabic(String s) {
      if (s == null || s.isEmpty() || !s.matches("^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"))
         return -1;

      final Matcher matcher = Pattern.compile("M|CM|D|CD|C|XC|L|XL|X|IX|V|IV|I").matcher(s);
      final int[] decimalValues = {1000, 900, 500, 400, 100,90, 50, 40, 10, 9, 5, 4, 1};
      final String[] romanNumerals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
      int result = 0;

      while (matcher.find()) {
         for (int i = 0; i < romanNumerals.length; i++)
            if (romanNumerals[i].equals(matcher.group(0)))
               result += decimalValues[i];
      }
      return result;
   }


   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a roman number: ");
      String roman = in.nextLine();
      while (!roman.equals("q")) {
         int number = romanToArabic(roman);
         System.out.println("Roman -> " + "roman " + "||" + " Arabic -> " + number);
         System.out.println("Enter a roman number or type \"q\" to quit");
         roman = in.nextLine();
      }
      in.close();
   }
}