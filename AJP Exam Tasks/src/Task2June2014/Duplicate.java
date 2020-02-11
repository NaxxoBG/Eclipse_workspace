package Task2June2014;

import java.util.Arrays;

public class Duplicate
{
   private static int[] array = {4, 6, 3, 1, 89, 89, 0, 4};

   public static boolean hasDuplicates(int[] arr) {
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
      for (int i = 1; i < arr.length; i++) {
         if (arr[i - 1] == arr[i]) {
            return true;
         } 
      }
      return false;
   }

   public static int numOfDifferentElements(int[] arr) {
      Arrays.sort(arr);
      int counter = arr.length;
      System.out.println(Arrays.toString(arr));
      for (int i = 1; i < arr.length; i++) {
         if (arr[i - 1] == arr[i]) {
            counter--;
         }
      }
      return counter;
   }

   public static int[] removeDuplicates(int[] array) {
      System.out.println("\nBefore and removing same ints " + Arrays.toString(array));
      Arrays.sort(array);
      int i = 1;
      int j = 0;
      while (i < array.length) {
         if (array[i] == array[j]) {
            i++;
         } else {
            j++;
            array[j] = array[i];
            i++;
         }
      }
      int[] arrayToReturn = Arrays.copyOf(array, j + 1);
      return arrayToReturn;
   }

   public static void main(String[] args) {
      System.out.println(hasDuplicates(array));
      System.out.println(numOfDifferentElements(array));
      System.out.println("After removing same ints  ->  " + Arrays.toString(removeDuplicates(array)));
   }
}