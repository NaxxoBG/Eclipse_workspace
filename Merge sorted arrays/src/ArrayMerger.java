import java.util.Arrays;

public class ArrayMerger
{
   public static int[] merge(int[] a, int[] b) {
      int[] answer = new int[a.length + b.length];
      int i = 0, j = 0, k = 0;
      while (i < a.length && j < b.length) {
         if (a[i] < b[j]) {
            answer[k] = a[i];
            i++;
         } else {
            answer[k] = b[j];
            j++;
         }
         k++;
      }
      while (i < a.length) {
         answer[k] = a[i];
         i++;
         k++;
      }
      while (j < b.length) {
         answer[k] = b[j];
         j++;
         k++;
      }
      return answer;
   }

   public static int[] sortAndMerge(int[] a, int[] b) {
      int[] answer = new int[a.length + b.length];
      int i = a.length - 1, j = b.length - 1, k = answer.length;

      while (k > 0) {
         answer[--k] = (j < 0 || (i >= 0 && a[i] >= b[j])) ? a[i--] : b[j--];
      }
      return answer;
   }

   public static void main(String[] args) {
      int[] arr = {1, 52, 42, 6};
      int[] arr2 = {5, 351, 53, 6, 8};
      Arrays.sort(arr);
      Arrays.sort(arr2);
      System.out.println(Arrays.toString(arr));
      System.out.println(Arrays.toString(arr2));
      System.out.println(Arrays.toString(merge(arr, arr2)));
      System.out.println(Arrays.toString(sortAndMerge(arr, arr2)));
   }
}