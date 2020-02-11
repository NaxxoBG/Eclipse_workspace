package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7
{
   static Scanner input;
   
   public static void selectionSort(int[] a) {
      int min, temp;
      for (int i = 0; i < a.length - 1; i++) {
         min = i;
         for (int j = i + 1; j < a.length; j++) {
            if (a[j] < a[min]) {
               min = j;
            }
         }
         temp = a[i];
         a[i] = a[min];
         a[min] = temp;
      }
   }
   
   public static void main(String[] args) {
      int[] testArr = {3, 5, 235, 6, 34, 46, 2, 78, 7, 8, 4};
      selectionSort(testArr);
      System.out.println(Arrays.toString(testArr));
   }
}