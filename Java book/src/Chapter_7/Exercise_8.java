package Chapter_7;

import java.util.Arrays;

public class Exercise_8
{
   public static int countOccurrence(int[] a) {
      int counter = 1, max = 0;
      int maxVal = a[0];
      for (int i = 0; i < a.length - 1; i++) {
         for (int j = i + 1; j < a.length; j++) {
            if (a[i] == a[j]) {
               counter++;
               maxVal = a[i];
            }
         }
         if (counter > max) {
            max = counter;
         }
         counter = 1;
      }
      System.out.printf("The value that occurs the most is: %d (Times repeated: %d)\n", maxVal, max);
      System.out.println(Arrays.toString(a) + "\n");
      return maxVal;
   }

   public static void main(String[] args) {
      int[] arr = {2, 2, 2, 3, 3, 5, 3, 3, 1, 3};
      countOccurrence(arr);
      Arrays.sort(arr);
      countOccurrence(arr);
   }
}