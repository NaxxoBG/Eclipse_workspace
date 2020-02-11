package Chapter_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_6
{
   public static void main(String[] args)
   {
      int a, b, c, d, e;
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      System.out.println("Enter numbers");
      a = in.nextInt();
      b = in.nextInt();
      c = in.nextInt();
      d = in.nextInt();
      e = in.nextInt();
      ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(a, b, c, d, e));
      Collections.sort(numbers);
      System.out.println("The largest number is " + numbers.get(numbers.size() - 1));
   }
}