package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_2
{
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Size of first array");
      int size = in.nextInt();
      System.out.println("Size of second array");
      int size2 = in.nextInt();
      if (size != size2) {
         System.out.println("The arrays are not equal");
      }
      else {
         int[] arr = new int[size];
         int[] arr1 = new int[size2];
         for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter numbers for arr1");
            arr[i] = in.nextInt();
         }
         for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter numbers for arr2");
            arr1[i] = in.nextInt();
         }
         System.out.println("Are the arrays equal -> " + Arrays.equals(arr,arr1));
         in.close();
      }
   }
}