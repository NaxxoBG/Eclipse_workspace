package Chapter_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_7
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

      ArrayList<Integer> ordered = new ArrayList<>(Arrays.asList(a, b, c, d, e));
      Collections.sort(ordered);
      Collections.reverse(ordered);
      System.out.println("Numbers are " + ordered + " and the largest number is " + ordered.get(0));
   }
}