package Algorithms;

public class InsertionSort
{
   public static <T extends Comparable<T>> void insertionSortGen(T[] A) {
      int i = 1, n = A.length - 1, idx = 0;
      while (i <= n) {
         idx = i;
         putIntoRightPlaceGen(A, idx);
         i++;
      }
   }

   private static <T extends Comparable<T>> void putIntoRightPlaceGen(T[] A, int index) {
      T element = A[index];
      int pos = index;
      while (pos > 0 && A[pos-1].compareTo(element) > 0) {
         A[pos] = A[pos-1];
         pos--;
      }
      A[pos] = element;
   }

   public static void insertionSort(int[] A) {
      int i = 1, n = A.length - 1, idx = 0;
      while (i <= n) {
         idx = i;
         putIntoRightPlace(A, idx);
         i++;
      }
   }

   private static void putIntoRightPlace(int[] A, int index) {
      int element = A[index];
      int pos = index;
      while (pos > 0 && A[pos-1] > element) {
         A[pos] = A[pos-1];
         pos--;
      }
      A[pos] = element;
   }
}