package Chapter_10;

import java.util.Scanner;

public class Exercise_2
{
   static int numberOfLoops;
   static int[] loops;
   static int numberOfIterations;

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("N = ");
      numberOfLoops = in.nextInt();
      System.out.println("K = ");
      numberOfIterations = in.nextInt();

      loops = new int[numberOfLoops];

      combinations(0);
      in.close();
   }

   private static void combinations(int currentLoop) {
      if (currentLoop == numberOfLoops) {
         printLoops();
         return;
      }

      for (int i = 1; i <= numberOfIterations; i++) {
         loops[currentLoop] = i;
         combinations(currentLoop + 1);
      }
   }

   private static void printLoops() {
      for (int i = 0; i < numberOfLoops; i++) {
         System.out.printf("%d ", loops[i]);
      }
      System.out.println();
   }
}