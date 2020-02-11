package Algorithms;

public class QuickSort
{
   public static <T extends Comparable<T>> void quickSort(T[] A, int first, int last) {
      if (first < last) {
         int partition = partition(A, first, last);
         quickSort(A, first, partition);
         quickSort(A, partition + 1, last);
      }
   }

   private static <T extends Comparable<T>> int partition(T[] A, int low, int high) {
      T pivot = A[low];
      int i = low - 1;
      int j = high + 1;
      while (i < j) {
         //incrementing index until 
         //values lesser or greater 
         //than the pivot are found
         //A[i] < pivot
         for (i++; A[i].compareTo(pivot) < 0; i++);
         //A[j] > pivot
         for (j--; A[j].compareTo(pivot) > 0; j--);
         if (i < j) {
            swap(A, i, j);
         }
      }
      return j;
   }

   private static <T> void swap(T[] A, int i, int j) {
      T temp = A[i];
      A[i] = A[j];
      A[j] = temp;
   }
}