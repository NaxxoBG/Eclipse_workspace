package Chapter_6;

import java.util.Scanner;

public class Exercise_5
{
   public static void main(String[] args)
   {
      try {
         @SuppressWarnings("resource")
         Scanner in = new Scanner(System.in);
         System.out.println("Enter a number");
         int num = in.nextInt();

         int[] fibnum = new int[num];

         fibnum[0] = 0;
         fibnum[1] = 1;

         for (int i = 2; i < num; i++) {
            fibnum[i] = fibnum[i-1] + fibnum[i - 2];
         }

         for (int i = 0; i < num; i++) {
            System.out.print(fibnum[i] + "; ");
         }
      } catch (Exception e) {
         System.out.println(0);
      }
   }
}