package Chapter_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_3
{
   public static void main(String[] args)
   {
      System.out.println("Enter numbers:");
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(a, b, c));
      Collections.sort(numbers);
      System.out.println("The largest number is " + numbers.get(numbers.size() - 1));
   }
}