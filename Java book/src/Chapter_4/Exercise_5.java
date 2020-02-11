package Chapter_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_5
{

   public static void main(String[] args)
   {
      int a, b;
      
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter first number:");
      a = in.nextInt();
      
      System.out.println("Enter second number:");
      b = in.nextInt();
      
      ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(a, b));
      Collections.sort(numbers);
      System.out.println("The larger number: " + numbers.get(1) + "\nThe smaller number: " + numbers.get(0));
   }
}