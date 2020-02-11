package ClassExercises;

import java.util.Scanner;

public class Exercise3_14
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      System.out.println("Please enter\nday:\nmonth:\nyear:");
      int day = input.nextInt();
      int month = input.nextInt();
      int year = input.nextInt();
      input.close();

      if (day < 1 || day > 31) {
         throw new IllegalArgumentException("This is not a valid day!");
      } else if (month < 1 || month > 12) {
         throw new IllegalArgumentException("This is not a valid month!");
      }
      else if (year < 1) {
         throw new IllegalArgumentException("Please enter another year!");
      }
      System.out.println("The date you have entered is " + day + "/" + month + "/" + year);
   }
}