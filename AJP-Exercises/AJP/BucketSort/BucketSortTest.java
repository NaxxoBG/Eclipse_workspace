package BucketSort;

import java.util.Arrays;

public class BucketSortTest
{
   public static void main(String[] args) {
      int[] array = {78, 17, 39, 26, 72, 94, 21, 4, 47, 12, 68, 87};
      int[] array2 = array.clone();
      
      Arrays.sort(array2);
      System.out.println("Array to be sorted -> " + Arrays.toString(array));
      
      long a = System.currentTimeMillis();
      BucketSort.bucketSort(array, 4);
      long b = System.currentTimeMillis();
      
      System.out.println("Bucketsort Test ----> " + Arrays.toString(array));
      System.out.println("Sorted Array -------> " + Arrays.toString(array2));
      System.out.println("Execution Time -----> " + (b - a) + "ms");
   }
}