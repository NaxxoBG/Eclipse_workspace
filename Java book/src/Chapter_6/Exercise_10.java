package Chapter_6;

import java.util.Scanner;

public class Exercise_10
{
   public static void main(String[] args) {
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = in.nextInt();

      for (int i = 0; i <= num - 1; i++) {
         for (int j = i+1; j <= num + i; j++) {
            System.out.print(j + " | ");
         }
         System.out.println();
      }
   }
}