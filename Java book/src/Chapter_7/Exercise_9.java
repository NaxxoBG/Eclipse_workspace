package Chapter_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise_9
{
   public static List<Integer> streakSum(int sum, int[] arr) {
      int numSum = 0;
      ArrayList<Integer> nums = new ArrayList<>();
      for (int i = 0; i < arr.length; i++) {
         for (int j = i; j < arr.length; j++) {
            if (numSum < sum) {
               numSum += arr[j];
               nums.add(arr[j]);
               if (numSum == sum) {
                  return nums;
               } else if (numSum > sum) {
                  nums = new ArrayList<Integer>();
                  numSum = 0;
                  break;
               }
            } 
         }
      }
      return null;
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int[] arr = {1, 5, 12, 5, 124, 4, 6};
      System.out.println("Enter a sum");
      int number = in.nextInt();
      System.out.println("The streak of numbers in the array " + Arrays.toString(arr) + " with "
            + "sum equal to " + number + " is: " + streakSum(number, arr));
      in.close();
   }
}