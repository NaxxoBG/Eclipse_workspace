package realJavaBook;

import java.util.Scanner;

public class Exercise1 {
   public static void main(String[] args) {
      int num;
      System.out.println("Enter a number:");
      Scanner input = new Scanner(System.in);
      num = input.nextInt();
      input.close();
      System.out.println( num % 2 == 0 ? "Even" : "Odd");
   }
}