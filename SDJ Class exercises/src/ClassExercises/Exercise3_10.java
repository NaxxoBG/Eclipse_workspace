package ClassExercises;

import java.util.Scanner;

public class Exercise3_10

//Write a program that asks the user to enter three numbers and print the numbers in sorted order.
{
   public static void main(String[] args)
   {
      int a ,b ,c;
      Scanner input = new Scanner(System.in);

      System.out.println("Enter\na:\nb:\nc:\n");
      a = input.nextInt();
      b = input.nextInt();
      c = input.nextInt();

      if (a > b && b > c) {
         System.out.println("The order of the numbers is:\n" + a + " > " + b + " > " + c);

      } else if (b > a && a > c) {
         System.out.println("The order of the numbers is:\n" + b + " > " + a + " > " + c);

      } else if (c > a && a > b) {
         System.out.println("The order of the numbers is:\n" + c + " > " + a + " > " + b);

      } else if (a > c && c > b) {
         System.out.println("The order of the numbers is:\n" + a + " > " + c + " > " + b);

      } else if (b > c && c > a) {
         System.out.println("The order of the numbers is:\n" + b + " > " + c + " > " + a);

      } else if (c > b && b > a) {
         System.out.println("The order of the numbers is:\n" + c + " > " + b + " > " + a);

      } else {
         System.out.println("Error!");
      }
      input.close();
   }
}