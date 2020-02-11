package BucketSort;

import java.util.Arrays;

public class Bucket
{
   private int[] bucket;
   private int count;

   public Bucket(int size) {
      this.bucket = new int[size];
      this.count = 0;
   }

   public void insert(int x) {
      bucket[count] = x;
      count++;
   }
   
   // Version of the method with the method System.arraycopy
   public int copyBucketIntoWithSysArrayCopy(int[] A, int first) {
      System.arraycopy(bucket, 0, A, first, bucket.length-1);
      return count;
   }

   public int copyBucketInto(int[] A, int first) {
      for (int i = 0; i < count; i++) {
         A[i + first] = bucket[i];
      }
      return count;
   }

   public void sort() {
      Arrays.sort(bucket, 0, count);
   }
}