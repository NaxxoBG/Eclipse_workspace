package ClassExercises;
import java.util.Scanner;
public class Exercise3_04
{
   public static void main(String[] args)
   {
      int a, b, c, sum;
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter first number:\n" + "Please enter second number:\n" + "Please enter third number:\n");
      a = input.nextInt();
      b = input.nextInt();
      c = input.nextInt();
      sum = a + b + c; 
      System.out.println("The sum of the numbers is " + sum);
      input.close();
   }
}