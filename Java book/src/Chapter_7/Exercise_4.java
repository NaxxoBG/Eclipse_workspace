package Chapter_7;

import java.util.Arrays;

public class Exercise_4
{
   public static void main(String[] args) {
      int[] array = {1, 4, 6, 2, 5, 5, 5, 8, 8, 8, 8, 8, 8, 8, 7, 2};
      int[] streak;
      int count = 1;
      int tempCounter;
      int popular = array[0];
      int temp = 0;

      for (int i = 0; i < array.length - 1; i++) {
         temp = array[i];
         tempCounter = 0;
         for (int k = 1; k < array.length; k++) {
            if (temp == array[k]) {
               tempCounter++;
            }
         }
         if (tempCounter > count) {
            popular = temp;
            count = tempCounter;
         }
      }
      streak = new int[count];
      Arrays.fill(streak, 8);
      System.out.println("Integer with biggest streak -> " + popular);
      System.out.println("Times repeated -> " + count);
      System.out.println("Streak of numbers -> " + Arrays.toString(streak));
      System.out.println("\nArray is " + Arrays.toString(array));
   }
}