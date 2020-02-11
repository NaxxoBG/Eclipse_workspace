package Algorithms;

public class LinearSearch
{
   public static <T extends Comparable<T>> int linearSearch(T[] A, T key) {
      for (int i = 0; i < A.length; i++) {
         if (A[i].compareTo(key) == 0) {
            return i;
         }
      }
      return -1;
   }
}
