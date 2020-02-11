package Algorithms;

public class BubbleSort
{
   public static <T extends Comparable<T>> void bubbleSort(T[] A) {
      int index = 1, n = A.length - 1;
      while (index < n) {
         bubbleDownTo(A, index);
         index++;
      }
   }

   private static <T extends Comparable<T>> void bubbleDownTo(T[] A, int i) {
      int n = A.length - 1;
      for (int j = n; j >= i; j--) {
         if (A[j - 1].compareTo(A[j]) > 0) {
            swap(A, j);
         }
      }
   }

   private static <T> void swap(T[] A, int idx) {
      T element = A[idx - 1];
      A[idx - 1] = A[idx];
      A[idx] = element;
   }
}
