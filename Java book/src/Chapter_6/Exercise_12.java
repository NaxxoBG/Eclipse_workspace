package Chapter_6;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_12
{
   public static void main(String[] args) {
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = in.nextInt();

      System.out.println("Number converted to binary is " + Integer.toBinaryString(num));

      int i = 0, temp[] = new int[20];
      int binary[];
      while (num > 0) {
         temp[i++] = num % 2;
         num /= 2;
      }
      binary = new int[i];
      int k = 0;
      for (int j = i - 1; j >= 0; j--) {
         binary[k++] = temp[j];
      }
      System.out.println(Arrays.toString(binary));
   }
}