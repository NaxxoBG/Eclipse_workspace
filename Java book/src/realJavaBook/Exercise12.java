package realJavaBook;

import java.util.Scanner;

public class Exercise12
{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter a number: ");
      int n = input.nextInt();
      System.out.println("Enter a position: ");
      int p = input.nextInt();
      System.out.println("Enter a value: ");
      int v = input.nextInt();
      int mask = v << p;

      n = n & (~(1 << p));

      int result = n | mask;
      input.close();

      System.out.println(result);
   }
}