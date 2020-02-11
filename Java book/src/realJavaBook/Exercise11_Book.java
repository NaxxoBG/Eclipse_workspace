package realJavaBook;

import java.util.Scanner;

public class Exercise11_Book
{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter a number");
      int n = input.nextInt();
      int p = 5;
      int i = 1;
      int mask = p << i;

      System.out.println((n & mask) != 0 ? 1 : 0);
      input.close();
   }
}