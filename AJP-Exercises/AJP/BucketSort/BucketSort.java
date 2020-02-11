package BucketSort;

import java.util.ArrayList;
import java.util.Arrays;

public class BucketSort
{
   public static void bucketSort(int[] A, int m) {
      Bucket b1 = new Bucket(m);
      Bucket b2 = new Bucket(m);
      Bucket b3 = new Bucket(m);
      Bucket b4 = new Bucket(m);

      ArrayList<Bucket> buckets = new ArrayList<Bucket>();

      for (int i = 0; i < A.length; i++) {
         if (A[i] < 25) {
            b1.insert(A[i]);
         } else if (A[i] >= 25 && A[i] < 50) {
            b2.insert(A[i]);
         } else if (A[i] >= 50 && A[i] < 75) {
            b3.insert(A[i]);
         } else if (A[i] >= 75 && A[i] <= 100) {
            b4.insert(A[i]);
         }
      }
      buckets.addAll(Arrays.asList(b1, b2, b3, b4));
      buckets.stream().forEach(b -> b.sort());
      int placeNo = 0;
      placeNo += b1.copyBucketInto(A, placeNo);
      placeNo += b2.copyBucketInto(A, placeNo);
      placeNo += b3.copyBucketInto(A, placeNo);
      placeNo += b4.copyBucketInto(A, placeNo);
   }
}