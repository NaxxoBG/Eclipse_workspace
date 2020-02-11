package Chapter_4;

import java.util.Scanner;

public class Exercise_2
{
   public static void main(String[] args)
   {
      double r = 0;
      @SuppressWarnings("resource")
      Scanner input = new Scanner(System.in);

      System.out.println("Enter radius:");
      r = input.nextDouble();

      System.out.println("The area of the Circle is " + Math.PI*Math.pow(r, 2));
      System.out.println("The circumference of the circle is " + 2*Math.PI*r);
   }
}