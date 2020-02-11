package ClassExercises;
import java.util.Scanner;
public class PayrollWithTax
{
   public static void main(String[] args)
   {
      String name;   // Start of declarations
      double taxRate; 
      double payRate;
      int workHours;
      double grossPay = 0;
      double salary = 0;

      Scanner input = new Scanner(System.in); // End of declarations  

      // Statements, Scanner class
      System.out.println("Enter your name: ");
      name = input.nextLine();

      System.out.println("Enter your tax rate: ");
      taxRate = input.nextDouble();

      System.out.println("Enter hours of work during the week: ");
      workHours = input.nextInt();

      System.out.println("Enter your hourly pay rate: ");
      payRate = input.nextDouble();

      //Calculations
      grossPay = workHours * payRate;
      salary = grossPay - grossPay * taxRate;

      //Console output
      System.out.println("Hello " + name + "!");
      System.out.println("Your net pay is: " + salary + "$");
      input.close();
   }
}