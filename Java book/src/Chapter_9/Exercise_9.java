package Chapter_9;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise_9
{
   private static int reverseNum(int number) {
      int reversedNum = 0;

      while (number != 0) {
         int lastDigit = number % 10;
         reversedNum = lastDigit + reversedNum * 10;
         number /= 10;
      }
      return reversedNum;
   }

   private static double average(Integer... numbers) {
      return Stream.of(numbers).reduce(0, (a, b) -> a + b) / new Double(numbers.length);
   }

   private static double solveEq(double a, double b) {
      if (a == b) {
         return -1;
      } else {
         return - b / a;
      }
   }

   private static void printMenu() {
      System.out.println();
      System.out.println("0) Quit");
      System.out.println("1) Reverse a number");
      System.out.println("2) Find the average of a set of numbers");
      System.out.println("3) Solve the equation a * x + b = 0");
      System.out.println();
   }

   private static String formatDouble(double number) {
      return String.format(Locale.getDefault(), "%.2f", number);
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int choice = 0;
      System.out.println("Welcome to Mathworks!");
      System.out.println("Choose an option from the menu or enter \"0\" to quit");
      do {
         printMenu();
         choice = in.nextInt();
         switch (choice) {
            case 0:
               System.out.println("Program terminated");
               break;
            case 1:
               System.out.println("Enter a number:");
               int number = in.nextInt();
               while (number < 0) {
                  System.out.println("Please enter a non-negative number");
                  number = in.nextInt();
               }
               System.out.println("The reversed number is " + reverseNum(number));
               break;
            case 2:
               System.out.println("Enter a set of numbers:");
               boolean checker = true;
               Integer[] inputNums = new Integer[0];
               in.nextLine();
               while (checker) {
                  try {
                     inputNums = (Integer[]) Arrays.stream(in.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList()).toArray(new Integer[0]);
                     checker = false;
                  } catch (Exception e) {
                     System.out.println("Please enter a set that is not empty and is valid");
                  }
               }
               System.out.println("The average of the set is " + formatDouble(average(inputNums)));
               break;
            case 3:
               System.out.println("Enter value for a:");
               double a = in.nextDouble();
               while (a == 0.0) {
                  System.out.println("Please enter a number different from 0");
                  a = in.nextDouble();
               }
               System.out.println("Enter value for b:");
               double b = in.nextDouble();
               System.out.println("The solution of a * x + b = 0 is " + formatDouble(solveEq(a, b)));
               break;
            default:
               break;
         }
      } while (choice != 0);
      in.close();
   }
}