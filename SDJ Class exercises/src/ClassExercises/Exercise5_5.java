package ClassExercises;
import java.util.Scanner;

public class Exercise5_5
{

   public static void main(String[] args)
   {
      // DECLARATIONS
      
      char response;
      String input;
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Enter answer:");
      input = scanner.nextLine();
      
      response = input.charAt(0);
      scanner.close();
      
      while (response != 'Y' && response != 'y' && response != 'N' && response != 'n')
            {
               
           throw new Error("You did not answer the question properly.");
      }
      
     
      System.out.println("Thank you for the answer.");
   
   }

}