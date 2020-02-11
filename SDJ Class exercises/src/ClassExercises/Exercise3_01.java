package ClassExercises;
import java.util.Scanner;

public class Exercise3_01
{
   public static void main(String[] args)
   {
      // DECLARATIONS

      double radius;
      double area;
      double circumference;

      Scanner input = new Scanner(System.in);

      //STATEMENTS

      System.out.println("Enter radius: ");
      radius = input.nextDouble();
      area = Math.PI * radius * Math.pow(2,2);
      circumference = 2 * Math.PI * radius;

      System.out.println("The area of the circle is " + area + " and the circumference is " + circumference);
      //CLOSING INPUT  
      input.close(); 
   }
}