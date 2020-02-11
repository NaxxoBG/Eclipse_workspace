package Algorithms;

import java.util.Arrays;

public class MergeSort
{
   public static void mergeSort(int[] A, int n) {
      n = A.length;
      if (n < 2) {
         return;
         //if array has less than two element, do nothing
      }
      int mid = n / 2;
      int[] left = new int[mid];
      int[] right = new int[n - mid];
      for (int i = 0; i <= mid - 1; i++) {
         left[i] = A[i];
      }
      for (int i = mid; i <= n - 1; i++) {
         right[i - mid] = A[i];
      }
      mergeSort(left, mid);
      mergeSort(right, n - mid);
      merge(left, right, A);
   }

   public static void merge(int[] A, int[] B, int[] C) {
      int i, j, k, m, n;
      i = 0; j = 0; k = 0; m = A.length; n = B.length;

      while (i < m && j < n) {
         if (A[i] < B[j]) {
            C[k++] = A[i++];
         } else {
            C[k++] = B[j++];
         }
      }
      while (i < m) {
         C[k++] = A[i++];
      }
      while (j < n) {
         C[k++] = B[j++];
      }
   }

   public static void recursiveMerge(int[] A, int[] B, int[] C, int p, int q, int r) {
      if (hasBeenCopied(B, q)) {
         copyRestOf(A, C, p, q);
      } else if (hasBeenCopied(A, p)) {
         copyRestOf(B, C, q, r);
      } else {
         if (head(A, p) <= head(B, q)) {
            //copy head(A) to C
            C[r++] = A[p++];
            recursiveMerge(A, B, C, p, q, r);
         }
         else {
            //copy head(B) to C
            C[r++] = B[q++];
            recursiveMerge(A, B, C, p, q, r);
         }
      }
   }

   //Methods for recursive merging

   private static boolean hasBeenCopied(int[] T, int idx) {
      return idx >= T.length;
   }

   private static int head(int[] A, int p) {
      return A[p];
   }

   private static void copyRestOf(int[] FromA, int[] ToB, int startInA, int startInB) {
      for (int i = 0; i <= FromA.length - startInA; i++) {
         ToB[startInB] = FromA[startInA];
         startInB++;
         startInA++;
      }
   }

   public static boolean isAPermutation(int[] a, int[] b) {
      if (a.length != b.length) {
         return false;
      }
      Arrays.sort(a);
      Arrays.sort(b);
      for (int i = 0; i < a.length; i++) {
         if(a[i] != b[i]) {
            return false;
         }
      }
      return true;
   }
   //End of methods for recursive merging
}