package realJavaBook;

import java.util.Scanner;

public class Exercise13
{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int two = 2;
      int result = 0;

      System.out.println("Enter a number:");
      int num = input.nextInt();

      while (two <= num / 2) {
         if (num % two == 0) {
            result = 1;
         }
         two++;
      }
      if (result == 1) {
         System.out.printf("Number: %s is not prime.", num);
      } else {
         System.out.printf("Number: %s is prime.", num);
      }
      input.close();
   }
}