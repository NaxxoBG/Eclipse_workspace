package ClassExercises;
import java.util.Scanner;
public class Exercise4_03
{

   public static void main(String[] args)
   {
      int a;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter number:");
      a = input.nextInt();
      
         while (a < 10 || a > 25) {
         
               System.out.println("Number is not valid, please enter another number in the range of 10 through 25:");
               a = input.nextInt();
               
               
                                  }
         System.out.println("Number is valid.");
         input.close();
         
   }       
     
        
}
