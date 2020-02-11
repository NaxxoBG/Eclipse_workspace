package Task2;

public class SpecialSearch
{
   static int[] array = {2, 4, 5, 7, 9, 12};
   static int[] array2 = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 615, 678, 789};

   public static int specialLinearSearch(int[] T, int key) {
      for (int i = 0; i < T.length; i++) {
         if (T[i] == key) {
            return i;
         } else if (T[i] < key && T[i + 1] > key) {
            return -1;
         } /*else if (T[i] > key) {
               return -1;
         } */
      }
      return -1;
   }

   public static int jumpSearch(int[] T, int key) {
      for (int i = 0; i < T.length; i += 3) {
         if (T[i] == key) {
            return i;
         }
         if (T[i] > key) {
            int num = i;
            i -= 3;
            for (int j = i; j < num; j++) {
               if (T[j] == key) {
                  return j;
               }
            }
         }
      }
      return -1;
   }

   public static void main(String[] args) {
      System.out.println(specialLinearSearch(array, 9));
      System.out.println("----------");
      System.out.println(jumpSearch(array2, 55));
   }
}