package ClassExercises;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise7_07b
{
   public static void main(String[] args)
   {
      //Declarations
      Scanner input = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<String>();
      //Instructions
      System.out.println("Instructions:\nEnter a string.\nType \"QUIT\" to quit\n---------------------------------------------");
      //Beginning of entry addition
      System.out.println("\nEnter a string:");
      String answer = input.nextLine();
      list.add(answer);
      System.out.println(list);
      
         while (!"quit".equalsIgnoreCase(answer)) {
              
              System.out.println("Enter a string: ");
              answer = input.nextLine();
              list.add(answer);
              System.out.println(list);
         } 
      System.out.println("\nThe array you have created is: ");
         for (int i = 0; i < list.size() - 1; i++) {
         System.out.print(" " +  list.get(i) + "; ");
         }
      input.close();
   }
}