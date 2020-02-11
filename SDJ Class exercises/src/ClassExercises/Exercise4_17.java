package ClassExercises;
import java.util.Scanner;

public class Exercise4_17
{

   public static void main(String[] args)
   {
      int speed = 0;
      Scanner input = new Scanner(System.in);
      System.out.println("What is your speed?");
      speed = input.nextInt();
      if (speed > 0 && speed < 200) {
         System.out.println("The speed is acceptable.");
      } else {
         System.out.println("Please, change your speed.");
             }
      input.close();
   
   
   }
}


