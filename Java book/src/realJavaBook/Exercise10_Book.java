package realJavaBook;

import java.util.Scanner;

public class Exercise10_Book
{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number;

      System.out.println("Enter a number:");
      number = input.nextInt();

      while  (number > 9999 || number < 1000 ) {
         System.out.println("Invalid! It has to be a four-figure number!");
         number = input.nextInt();
      }

      System.out.println("The number is " + number);

      int a = number / 1000;
      int b = (number / 100) % 10;
      int c = (number % 100) / 10;
      int d = number % 10;

      System.out.println("The figures of the number are " + a + "/" + b + "/" + c + "/" + d);
      System.out.println("The figures of the number in reverse are " + d + "/" + c + "/" + b + "/" + a);
      System.out.println("The figures of the number in reverse are " + d + "/" + a + "/" + b + "/" + c);
      System.out.println("The figures of the number in reverse are " + a + "/" + c + "/" + b + "/" + d);

      input.close();
   }
}