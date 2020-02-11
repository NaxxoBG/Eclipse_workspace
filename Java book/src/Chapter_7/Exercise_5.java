package Chapter_7;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Exercise_5
{
   public static void main(String[] args) {
      //            int[] array = {1, 4, 7, 2, 4, 5, 1, 2, 3, 4, 5, 7};
      int[] array = {9, 8, 7, 6, 5, 4, 3, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 1, 2, 3};

      int count = 1, max = 1; 
      int maxStreakLength = 0;

      for (int i = 1; i < array.length; i++) {
         if (array[i] >= array[i - 1]) {
            count++;
         } else {
            count = 1;
         }

         if (count > max) {
            maxStreakLength = i + 1;
            max = count;
         }
      }
      System.out.println("Array is " + Arrays.toString(array));
      System.out.println("Longest streak is " + max);
      System.out.println(Arrays.toString(ArrayUtils.subarray(array, maxStreakLength - max, maxStreakLength)));
   }
}