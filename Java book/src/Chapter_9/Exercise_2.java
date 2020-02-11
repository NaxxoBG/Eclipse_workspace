package Chapter_9;

import java.util.Scanner;

public class Exercise_2
{
   private static int getMax(int num1, int num2) {
      if (num1 > num2) {
         return num1;
      } else if (num1 < num2) {
         return num2;
      } else {
         return num1;
      }
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number");
      int num1 = in.nextInt();

      System.out.println("Enter a second number");
      int num2 = in.nextInt();
      num1 = getMax(num1, num2);

      System.out.println("Enter a third number");
      num2 = in.nextInt();

      System.out.println("The largest number you entered is " + getMax(num1, num2));
      in.close();
   }
}