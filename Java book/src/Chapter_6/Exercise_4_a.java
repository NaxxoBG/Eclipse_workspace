package Chapter_6;

import java.util.Arrays;

public class Exercise_4_a
{
   public static void main(String[] args)
   {

      String[] numCards = {"2", "3", "4", "5",
            "6", "7", "8", "9", "10", "J", "K",
            "Q", "A"};

      String[] paint = {"Спатия", "Каро", "Купа",
      "Пика"};

      Arrays.asList(numCards).forEach(e -> {
         for (int i = 0; i < paint.length; i++) {
            System.out.println(e + "-" + paint[i]);
         }
      });
   }
}