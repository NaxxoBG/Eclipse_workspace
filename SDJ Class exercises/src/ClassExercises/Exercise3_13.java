package ClassExercises;

import java.util.Scanner;

public class Exercise3_13
{
   public static void main(String[] args)
   {
      String month;
      int monthNumber = 0;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a month: ");
      month = input.nextLine();

      switch (month.toLowerCase()) {
         case "january" :   monthNumber = 1;
         break;
         case "february" :   monthNumber = 2;
         break;
         case "march" : monthNumber = 3;
         break;
         case "april" : monthNumber = 4;
         break;
         case "may" : monthNumber = 5;     
         break;
         case "june" : monthNumber = 6;
         break;
         case "july" : monthNumber = 7;
         break;
         case "august" : monthNumber = 8;
         break;
         case  "september" : monthNumber = 9;  
         break;
         case "october" : monthNumber = 10;
         break;
         case "november" : monthNumber = 11;
         break;
         case "december" : monthNumber = 12;
         break;
      }

      if (monthNumber <= 0) {

         System.out.println("This is not a valid month!");
      } else  {
         System.out.println("This month is number " + monthNumber + ".");
         input.close();
      }
   }
}