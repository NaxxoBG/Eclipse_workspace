package Algorithms;

import java.util.Arrays;

public class AlgoTest
{
   public static void main(String[] args) {
      int[] arr1 = {15, 5};
      int[] arr2 = {1, 3};
      int[] resArr = new int[arr1.length + arr2.length];
      int[] recursiveResArr = new int[arr1.length + arr2.length];
      int[] binArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int[] mergeArr = {4, 6, 2, 1, 3, 8, 7, 9, 5};
      Integer[] quickArr = {5, 2, 6, 1, 4, 7, 67};
      Integer[] linArr = {12, 51, 3, 7, 23, 8, 543, 6};
      Integer[] selectArr = {11, 13, 12, 14, 16, 15, 18, 17, 20, 19};
      Integer[] insertArr = {3, 1, 2, 4, 6, 5, 8, 9, 7, 10};
      Integer[] bubbleArr = {4, 2, 6, 5, 9, 7, 3, 1, 10, 8};
      long a, b, c, d, e, f, g, h, i ,j, k, l, m, n;

      // Merge and recursive merge
      System.out.println("Arrays to be merged -> " + Arrays.toString(arr1) + " and " + Arrays.toString(arr2));
      a = System.currentTimeMillis();
      MergeSort.merge(arr1, arr2, resArr);
      b = System.currentTimeMillis();
      System.out.println("Time -> " + (b - a) + " ms\nMerge result -> " + Arrays.toString(resArr));
      System.out.println("\nArrays to be recursively merged -> " + Arrays.toString(arr1) + " and " + Arrays.toString(arr2));
      c = System.currentTimeMillis();
      MergeSort.recursiveMerge(arr1, arr2, recursiveResArr, 0, 0, 0);
      d = System.currentTimeMillis();
      System.out.println("Time -> " + (d - c) + " ms\nRecursive merge result -> " + Arrays.toString(recursiveResArr));

      //Quicksort
      System.out.println("\nArray to be quicksorted -> " + Arrays.toString(quickArr));
      e = System.currentTimeMillis();
      QuickSort.quickSort(quickArr, 0, quickArr.length - 1);
      f = System.currentTimeMillis();
      System.out.println("Time -> " + (f - e) + " ms\nQuicksort result -> " + Arrays.toString(quickArr));

      //Mergesort
      System.out.println("\nArray to be merge-sorted -> " + Arrays.toString(mergeArr));
      g = System.currentTimeMillis();
      MergeSort.mergeSort(mergeArr, mergeArr.length);
      h = System.currentTimeMillis();
      System.out.println("Time -> " + (h - g) + " ms\nMerge sort result -> " + Arrays.toString(mergeArr));

      System.out.println("\nArray to be selection-sorted -> " + Arrays.toString(selectArr));
      i = System.currentTimeMillis();
      SelectionSort.selectionSort(selectArr);
      j = System.currentTimeMillis();
      System.out.println("Time -> " + (j - i) + " ms\nSelection sort result -> " + Arrays.toString(selectArr));

      System.out.println("\nArray to be insertion-sorted -> " + Arrays.toString(insertArr));
      k = System.currentTimeMillis();
      InsertionSort.insertionSortGen(insertArr);
      l = System.currentTimeMillis();
      System.out.println("Time -> " + (l - k) + " ms\nInsertion sort result -> " + Arrays.toString(insertArr));

      System.out.println("\nArray to be bubble-sorted -> " + Arrays.toString(bubbleArr));
      m = System.currentTimeMillis();
      BubbleSort.bubbleSort(bubbleArr);
      n = System.currentTimeMillis();
      System.out.println("Time -> " + (n - m) + " ms\nBubble sort result -> " + Arrays.toString(bubbleArr));

      System.out.println("\nBinary seach array -> " + Arrays.toString(binArr));
      //Searching position of 9 in binArr
      System.out.println("Binary search for 9 -> " + BinarySearch.binSearch(binArr, 9, 0, binArr.length-1));
      //Searching position of 10 in binArr
      System.out.println("Binary search for 10 -> " + BinarySearch.binSearch(binArr, 10, 0, binArr.length-1));
      //Searching position of 1 in binArr
      System.out.println("Binary search for 1 -> " + BinarySearch.binSearch(binArr, 1, 0, binArr.length-1));

      System.out.println("\nLinear seach array -> " + Arrays.toString(linArr));
      //Linear seach
      System.out.println("Linear search for num 543 -> " + LinearSearch.linearSearch(linArr, 543));

      System.out.println("\nPermutation test -> " + MergeSort.isAPermutation(arr1, arr2));
   }
}