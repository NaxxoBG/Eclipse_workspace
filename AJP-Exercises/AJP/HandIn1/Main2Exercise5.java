package HandIn1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2Exercise5
{
   static ArrayList<String> digits = new ArrayList<>();
   static int counter = 1;

   public static void main(String[] args) {
      long startExec, endExec;

      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = in.nextInt();
      while ( num < 1 || num > 99) {
         System.out.println("The number should be in the range 0 < N < 100. Enter again.");
         num = in.nextInt();
      }
      startExec = System.currentTimeMillis();
      solving(num);
      endExec = System.currentTimeMillis();
      printTriples();
      System.out.println("Execution time: " + (endExec - startExec));

   }

   /**The method finds all the triples of positive integers
    * with average N and prints out the triples.
    * @param<code>int N (0 < N < 100)</code>
    * @author Atanas
    */
   public static void solving(int N) {
      int a = 1, b = 1, c = 0;
      for (a = 1; a <= 3 * N - 2; a++) {
         while (b <= 3 * N - a - 1) {
            c = 3 * N - (a + b);
            digits.add("<" + a +  "," + b + "," + c + ">");
            b++;
         }
         b = 1;          
      } 
   }

   /**Prints out all the possible triples.
    * @author Atanas
    */
   private static void printTriples() {
      // Alternative way of printing the triples. It is slower than the foreach.
      // digits.forEach(e -> {System.out.printf("%d. %s\n", counter++, e);});
      for (String triplet : digits) {    
         System.out.printf("%d. %s\n", counter++, triplet);
      }
   }

}