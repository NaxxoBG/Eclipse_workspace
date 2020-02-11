package Chapter_6;

import java.util.Random;
import java.util.Scanner;

public class Exercise_16
{
   public static void main(String[] args) {
      Random random = new Random();
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      System.out.println("Enter an upper bound for ther random number");
      int num = in.nextInt();
      System.out.println(random.nextInt(num) + 1);
   }
}