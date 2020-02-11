package ClassExercises;
import java.util.Scanner;
public class TEST____1
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String userInput;

      System.out.println("Answer with yes/no:");

      while ( input.hasNextLine()) {

         userInput = input.nextLine();
         char answer = userInput.charAt(0);

         switch (answer) {
            case 'Y' :
               System.out.println("You have answered yes!");
               break;
            case 'y':
               System.out.println("You have answered yes!");
               break;
            case 'N' :
               System.out.println("You have answered no!");
               break;
            case 'n':
               System.out.println("You have answered no!");
               break;
            default:
               System.out.println("Please answer with Yes/No!");         
         } 
      }
      System.out.println("That is it!");
      input.close();
   }
}