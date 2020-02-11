package Algorithms;

import java.util.Arrays;
import java.util.Random;

public class InsertionSortTest
{
   public static void main(String[] args) {
      long a, b, c, d, e, f, g, h;
      Random random = new Random();

      Integer[] numArr = new Integer[10];
      int[] numArr2 = new int[10];

      String[] stringArr = {"e", "d", "c", "b", "a", "x", "r", "o", "w", "z", "t", "y"};
      String[] stringArr2 = {"dog", "eye", "elephant", "dodst", "elevate", "sun", "car"};

      for (int i = 0; i < numArr.length; i++) {
         numArr[i] = random.nextInt(100);
         numArr2[i] = random.nextInt(100);
      }

      a = System.currentTimeMillis();
      InsertionSort.insertionSortGen(numArr);
      b = System.currentTimeMillis();

      c = System.currentTimeMillis();
      InsertionSort.insertionSort(numArr2);
      d = System.currentTimeMillis();

      e = System.currentTimeMillis();
      InsertionSort.insertionSortGen(stringArr);
      f = System.currentTimeMillis();

      g = System.currentTimeMillis();
      InsertionSort.insertionSortGen(stringArr2);
      h = System.currentTimeMillis();

      System.out.println("Generic Insertion sort numbers " + Arrays.toString(numArr) + " --> Time: " + (b - a) + " ms");
      System.out.println("Insertion sort numbers ------> " + Arrays.toString(numArr2) + " --> Time: " + (d - c) + " ms");
      System.out.println("Generic Insertion sort strings " + Arrays.toString(stringArr) + "    --> Time: " + (f - e) + " ms");
      System.out.println("Generic Insertion sort strings " + Arrays.toString(stringArr2) + " --> Time: " + (h - g) + " ms");
   }
}