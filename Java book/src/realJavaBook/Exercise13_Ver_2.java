package realJavaBook;

import java.util.Scanner;

public class Exercise13_Ver_2
{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number:");
      int number = input.nextInt();
      boolean isPrime = true;
      for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
         if (number % divisor == 0) {
            isPrime = false;
            break;
         }
      }
      System.out.println(isPrime);
      input.close();
   }
}