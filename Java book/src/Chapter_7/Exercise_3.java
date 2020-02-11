package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_3
{
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter size for array 1");
      int size1 = in.nextInt();
      char[] arr1 = new char[size1];
      for (int i = 0; i < arr1.length; i++) {
         System.out.println("Enter element for array 1");
         arr1[i] = in.next().charAt(0);
      }
      System.out.println("Enter size for array 2");
      int size2 = in.nextInt();
      char[] arr2 = new char[size2];
      for (int i = 0; i < arr2.length; i++) {
         System.out.println("Enter element for array 2");
         arr2[i] = in.next().charAt(0);
      }
      String arr1ToString = new String(arr1);
      String arr2ToString = String.valueOf(arr2);

      if (arr1ToString.compareTo(arr2ToString) > 0) {
         System.out.println("Array 2 is greater\n" + Arrays.toString(arr1) + " is lexicographically lesser than " + Arrays.toString(arr2));
      } else if (arr1ToString.compareTo(arr2ToString) < 0) {
         System.out.println("Array 1 is greater\n" + Arrays.toString(arr1) + " is lexicographically greater than " + Arrays.toString(arr2));
      } else {
         System.out.println("Arrays are equal\n" + Arrays.toString(arr1) + " is lexicographically equal to " + Arrays.toString(arr2));
      }
      in.close();
   }
}