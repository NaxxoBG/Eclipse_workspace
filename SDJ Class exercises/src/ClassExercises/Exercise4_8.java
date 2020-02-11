package ClassExercises;

import java.util.Scanner;

public class Exercise4_8
{
   public static void main(String[] args)
      {
         int y;
         
         @SuppressWarnings("unused")
         int x = 0;
         
         Scanner input = new Scanner(System.in);
         System.out.println("Enter y:");
         y = input.nextInt();
         if (y == 100) {
            System.out.println(x = 1);  
         } else {
            System.out.println(x = 0);
         }
         input.close();
      }
}