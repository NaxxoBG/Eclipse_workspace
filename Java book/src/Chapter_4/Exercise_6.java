package Chapter_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_6
{

   public static void main(String[] args)
   {
      long a, b, c, d, e, f;
      long sum = 0;

      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);

      System.out.println("Enter six numbers:");
      a = in.nextLong();
      b = in.nextLong();
      c = in.nextLong();
      d = in.nextLong();
      e = in.nextLong();
      f = in.nextLong();

      ArrayList<Long> numbers = new ArrayList<>(Arrays.asList(a, b, c, d, e, f));

      for (int i = 0; i < numbers.size(); i++) {
         sum += numbers.get(i);
      }

      System.out.println("The sum of the numbers is " + sum);
   }
}