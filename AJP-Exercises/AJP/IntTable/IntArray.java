package IntTable;

public final class IntArray
{
   private IntArray()  // why a private constructor?
   {
   }

   public static int maxOfArray (int [] array, int size) {
      int max = array[0];
      for (int i = 0; i < size; i++) {
         if (array[i] > max) {
            max = array[i];
         }
      }
      return max;
   }

   public static void selectionSort (int [] array, int size) {
      int i = 0;
      int index = size - 1;
      while (i < index) {
         int j = findSmallest(array, i, index);
         swap(array, i, j);
         i++;
      }
   }

   /**
    * Precondition:
    *   array is not empty
    *   from <= to
    * @param array
    * @param from
    * @param to
    * @return index to smallest element
    */
   public static int findSmallest (int[] array, int from, int to) {
      int smallest = array[0];
      for (int i = from; i < to; i++) {
         if (array[i] < smallest) {
            smallest = i;
         }
      }
      return smallest;
   }

   /**
    * Swap two numbers in the array
    * @param array
    * @param i index to a number in the array
    * @param j index to another number in the array
    */
   public static void swap (int[] array, int i, int j) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
   }

   /**
    * Tests if the array is sorted in ascending order.
    * Precondition: The array is not null and has at least one element (n >= 1)
    * @param array The array to test
    * @param n     The number of elements in the array to test
    * @return      True, if array is sorted, else false
    */
   public static boolean isSorted (int [] array, int n) {
      return array[n] > array[++n];
   }

}
