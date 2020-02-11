package ClassExercises;
import java.util.Scanner;
public class Exercises3_06
{

   public static void main(String[] args)
   
   {
      double a = 0, b = 0, sum = 0;
      
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter value for a:");
      a = input.nextDouble();
      
      System.out.println("Enter value for b:");
      b = input.nextDouble();
      sum = a + b;
      double quotent1 = a / b;
      double quotent2 = b / a;
      double modulus1 = a % b;
      double modulus2 = b % a;
      
      if ( a > b && b != 0) {
         
         System.out.println("The bigger number is " + a + ", the smaller number is " + b + ", the quotent is " + quotent1 + ", the sum is " + sum + " and the result of the modulus operation is " + modulus1 + ".");
      }
      else if (b > a && a != 0) {
         System.out.println("The bigger number is " + b + ", the smaller number is " + a + ", the quotent is " + quotent2 + ", the sum is " + sum + " and the result of the modulus operation is " + modulus2 + ".");
         System.out.println("");
         
      }
      else if (a == 0 || b == 0) {
         System.out.println("Division by zero is punishable by law!");
         
      }
      input.close();
     
         
            
            
            }

}
