package Chapter_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_4
{

   public static void main(String[] args)
   {
      int a,b;
      ArrayList<Integer> dansNumbers = new ArrayList<>();
      int counter = 0;
      int danBank = 0;
      @SuppressWarnings("resource")
      Scanner input = new Scanner(System.in);

      System.out.println("Enter a number:");
      a = input.nextInt();

      System.out.println("Enter a number:");
      b = input.nextInt();

      if (b > a) {
         for (int i = a; i < b; i++) {
            if (i % 5 == 0) {
               dansNumbers.add(i);
               counter++;
            }
         }
      } else {
         for (int i = b; i < a; i++) {
            if (i % 5 == 0) {
               dansNumbers.add(i);
               counter++;
            }
         }
      }
      System.out.println("The number is " + counter + " and the numbers are: " + dansNumbers);

      for (int i = 0; i < dansNumbers.size(); i++) {
         danBank += dansNumbers.get(i);
      }

      System.out.println("Dans current balance(the sum of the numbers): " + danBank);
   }
}