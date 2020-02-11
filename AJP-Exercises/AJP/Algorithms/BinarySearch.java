package Algorithms;

public class BinarySearch
{
   public static int binSearch(int[] T, int key, int first, int last) {
      if (last < first) {
         //interval is empty
         return -1;
      } else {
         int mid = first + (last-first) / 2;
         if (T[mid] == key) {
            return mid;
         } else if (key < T[mid]) {
            return binSearch(T, key, first, mid-1);
         } else {
            return binSearch(T, key, mid+1, last);
         }
      }
   }
}