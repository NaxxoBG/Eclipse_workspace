package ClassExercises;

import java.util.Scanner;

public class Exercise5_08
{
//Should improve the input
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      boolean eqArray = true;
      int[] array1 = new int[5];
      int[] array2 = new int[5];
      int index = 0;
      
      for (int i = 0; i < array1.length; i++) {
         System.out.println("Enter number: ");
         i = input.nextInt();
         
      }
      
      for (int i = 0; i < array2.length; i++) {
         System.out.println("Enter number: ");
         i = input.nextInt();
         
      }
      
      if (array1.length != array2.length) {
               
               System.out.println("The arrays DO not have the same length.");
               eqArray = false;
      }
      
      while (eqArray && index < array1.length) {
         if (array1[index] != array2[index]) {
            eqArray = false;
            index++;
         }
      }
      
      if (eqArray) {
         System.out.println("The arrays are identical.");
      } else {
         System.out.println("The arrays are not identical.");
      }
      input.close();
   }
      
}  