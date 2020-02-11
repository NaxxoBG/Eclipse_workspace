package ClassExercises;
import java.util.Scanner;
public class Exercise3_08
{

   public static void main(String[] args)
   {
      int age ;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Type gender (M or F): ");
      String line = input.nextLine();
      System.out.println("Enter your age:");
      age = input.nextInt();
      char gender = line.charAt(0);
      if (gender == 'M' && age >= 18)
          System.out.print("Man");
      else if (gender == 'M' && age < 18) {
          
         System.out.print("Boy");
          
      } else if (gender == 'F' && age >= 18)
      {
         System.out.println("Woman");
         
      } else if (gender == 'M' && age < 18) {
         
         System.out.println("Girl");
      }
      
      input.close();


   }

}
