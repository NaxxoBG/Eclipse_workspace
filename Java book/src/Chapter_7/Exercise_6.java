package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_6
{
   private static Scanner input;
   private static int num1 = 0, num2 = 0, sum = 0;
   private static int[] nums, maxSum;

   public static int[] maxSumElements(int[] array, int num) {
      maxSum = new int[num];
      Arrays.sort(array);
      System.arraycopy(array, array.length - num, maxSum, 0, num);
      return maxSum;
   }

   public static int arrSum(int[] array) {
      sum = 0;
      for (int i = 0; i < array.length; i++) {
         sum += array[i];
      }
      return sum;
   }

   public static void enterNums() {
      input = new Scanner(System.in);
      System.out.println("Enter number1");
      num1 = input.nextInt();
      System.out.println("Enter number 2");
      num2 = input.nextInt();
      while (num2 > num1) {
         System.out.println("This number must be less than " + num1);
         num2 = input.nextInt();
      }
   }

   public static void populateArray() {
      nums = new int[num1];
      System.out.println("Enter array numbers");
      for (int i = 0; i < num1; i++) {
         nums[i] = input.nextInt();
      }
   }

   public static void main(String[] args) {
      enterNums();
      populateArray();
      maxSum = maxSumElements(nums, num2);
      sum = arrSum(maxSum);
      System.out.println("The sorted array is " + Arrays.toString(nums));
      System.out.println("There are " + maxSum.length +" elements with max sum: " + Arrays.toString(maxSum) + "\nMax sum: " + sum);
      input.close();
   }
}