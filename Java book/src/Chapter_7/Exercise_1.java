package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_1
{
   public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      int[] array = new int[20];

      for (int i = 0; i < array.length; i++) {
         array[i] = 5 * i;
      }

      System.out.println(Arrays.toString(array));
      in.close();
   }
}