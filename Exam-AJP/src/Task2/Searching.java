package Task2;

public class Searching
{
   public static int linearSearch(int[] arr, int key, int left, int right) {
      int index = -1;
      if (arr.length != 0 && 0 <= left && left <= right && right < arr.length) {
         for (int i = left; i <= right; i++) {
            if (arr[i] == key) {
               index = i;
               break;
            } else {
               index = -1;
            }
         }
      } else {
         return -1;
      }
      return index;
   }

   public static int binarySearch(int[] arr, int key, int left, int right) {
       if (arr[left] == key && left <= right && arr.length != 0 && right < arr.length) {
         return left;
      } else {
         return binarySearch(arr, key, ++left, right);
      }
   }
   
   public static int binarySearchWithLinear(int[] arr, int key, int left, int right) {
      if (right - left < 10 && arr[left] == key) {
         return linearSearch(arr, key, ++left, right);
      } else if  (arr[left] == key && left <= right && arr.length != 0 && right < arr.length) {
         return left;
      } else {
         return binarySearch(arr, key, ++left, right);
      }
   }

   public static void main(String[] args) {
      int[] testArr = {1};
      int[] testArr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      int[] testArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
      System.out.println(testArr.length + " -> Arr length");
      System.out.println(linearSearch(testArr, 1, 0, 0));
      System.out.println(binarySearch(testArr1, 5, 0, 8));
      System.out.println(binarySearchWithLinear(testArr1, 3, 0, 6));

      System.out.println(testArr1.length + " -> Arr length");
      System.out.println(linearSearch(testArr1, 6, 0, 8));
      System.out.println(binarySearch(testArr1, 5, 0, 8));
      System.out.println(binarySearchWithLinear(testArr2, 10, 4, 16));

      System.out.println(testArr2.length + " -> Arr length");
      System.out.println(linearSearch(testArr2, 4, 0, 8));
      System.out.println(binarySearch(testArr2, 15, 0, 19));
      System.out.println(binarySearchWithLinear(testArr2, 14, 5, 19));
   }
}