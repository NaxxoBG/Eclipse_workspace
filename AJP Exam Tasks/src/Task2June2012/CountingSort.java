package Task2June2012;

import java.util.Arrays;

public class CountingSort
{
   public static int max(int[] max) {
      int maxInt = max[0];
      for (int i = 1; i < max.length; i++) {
         if (maxInt<max[i]) {
            maxInt = max[i];
         }
      }
      return maxInt;
   }

   public static int[] createCountersArray(int[] A) {
      int[] newArr = new int[max(A) + 1];
      for (int i = 0; i < A.length; i++) {
         newArr[A[i]]++;
      }
      return newArr;
   }

   public static void countingSort(int[] A) {
      int[] counterArr = createCountersArray(A);
      int index = 0;
      for (int i = 0; i < counterArr.length; i++) {
         for (int k = 0; k < counterArr[i]; k++) {
            A[index++] = i;
         }
      }
   }

   public static void main(String[] args) {
      int[] array = {4, 2, 1, 3, 4, 1, 2, 1, 0, 6, 4};
      System.out.println(max(array) + " -> Max value in the array");
      System.out.println(Arrays.toString(createCountersArray(array)) + " -> counter for each value in the array");
      countingSort(array);
      System.out.println(Arrays.toString(array));
   }
}