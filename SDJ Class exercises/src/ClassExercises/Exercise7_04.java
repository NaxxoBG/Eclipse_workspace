package ClassExercises;

import java.util.Scanner;

public class Exercise7_04
{
   public static void main(String[] args)
      {
        Scanner input = new Scanner(System.in);
        int count1 = 0, count2 = 0;
        int[] array1, array2, sumarray;
        array1 = new int[4];
        array2 = new int[4];
        sumarray = new int[4];
       
        for (int i = 0; i < array1.length; i++) 
        {
        System.out.println(++count1 + "." + "Enter value for array1:");
        array1[i] = input.nextInt();
        
        }
        System.out.println("----------------------------------------");
        for (int i = 0; i < array2.length; i++) 
        {
        System.out.println(++count2 + "." + "Enter value for array2:");   
        array2[i] = input.nextInt();
        
        }
        System.out.println("The sum of the paired elements is: ");
        for (int i = 0 ; i < array1.length; i++) {
            int j = 0;
              {
                 sumarray[j] = array1[i] + array2[i]; 
                 System.out.print(sumarray[j] + "; ");
              }
        }
        input.close();
      }
}