package ClassExercises;

import java.util.Scanner;

public class Exercise4_07c
{
  public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int usernumber;
      
      System.out.println("Enter a number:");
      usernumber = input.nextInt();
      
      while (usernumber <= 0) {
         System.out.println("The number must be greater than 0!");
         usernumber=input.nextInt();       
      }
         System.out.println("The numbers are as follows:");
      
      for (int i = 1; i <= usernumber; i++) {
        System.out.print(Math.pow(i, 2) + "; ");
      }
     System.out.println("\nGreat, you can try again!");
     input.close();
   }   
}