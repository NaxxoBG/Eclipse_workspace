package ClassExercises;
import java.util.Scanner;
public class Exercise4_04Type2
{

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String word;
      int wordCount = 0;
      
      for (int i = 0; i < 5; i++) {
         System.out.println("Enter a word:");
         word = input.nextLine();
         
         wordCount += word.length();
      }
      
      System.out.println("The sum of the characters of the entered strings is " + wordCount + ".");
      input.close();
   }

}
