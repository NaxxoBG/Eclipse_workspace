package Algorithms;

public class SelectionSort
{
   public static <T extends Comparable<T>> void selectionSort(T[] A) {
      int i = 0, n = A.length - 1;
      int idx = 0;
      while (i < n) {
         idx = findSmallestElemIn(A, i, n);
         swap(A, i, idx);
         i++;
      }
   }

   private static <T extends Comparable<T>> int findSmallestElemIn(T[] A, int from, int to) {
      int idxToSmallest = from;

      for (int i = from + 1; i <= to; i++) {
         if (A[i].compareTo(A[idxToSmallest]) < 0) {
            idxToSmallest = i;
         }
      }
      return idxToSmallest;
   }

   private static <T> void swap(T[] A, int i, int j) {
      T temp = A[i];
      A[i] = A[j];
      A[j] = temp;
   }
}