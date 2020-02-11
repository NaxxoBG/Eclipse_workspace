package Chapter_9;

import java.util.Scanner;

public class Exercise_1
{
   private static void printName(String name) {
      System.out.println(String.format("Hello, %s!", name));
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a name");
      printName(in.nextLine());
      in.close();
   }
}