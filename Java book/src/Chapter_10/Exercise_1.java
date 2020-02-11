package Chapter_10;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_1
{
   
   static int n;
   static int k;
   static ArrayList<Integer> nums;
   
   private static void printDoubleNestedLoop(int n, int k) {
      for (int i = 1; i <= n; i++) {
         for (int j = i; j <= k; j++) {
            out.println(i + " " + j);
         }
      }
   }

   public static void printRec(int start) {
      if (start == k) {
         for (int i = 1; i <= k--; i++) {
            out.println(i + " " + k);
         }
         return;
      }
      
      for (int i = 1; i <= n--; i++) {
         out.println(i + " " + k);
      }
      printRec(start + 1);
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter N");
      n = in.nextInt();
      System.out.println("Enter K");
      k = in.nextInt();
      printDoubleNestedLoop(n, k);
      System.out.println("Recursive part");
      printRec(0);
      in.close();
   }
}