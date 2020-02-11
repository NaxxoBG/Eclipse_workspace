package Main2Exercise5;

import java.util.Scanner;

public class Main2Exercise5
{
   public static void main(String[] args) {
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      long start, end;
      System.out.println("Enter a number:");
      int num = in.nextInt();
      start = System.currentTimeMillis();
      solving(num);
      end = System.currentTimeMillis();
      System.out.println("It took " + (end - start) +  " ms for the execution.");     
   }

   /**The method finds all the triples of positive integers(>0)
    * with average N and prints out the triples.
    * @param<code>int N (0 < N < 100)</code>
    * @author Naxxo
    */

   public static void solving(int N) {
      int a, b, c, counter = 1;

      if (N > 0 && N < 100) {
         System.out.println("The average of the triples below is " + N + ".");
         for (a = 1; a < 100 ; a++) {
            for (b = 1; b < 100; b++) {
               for (c = 1; c < 100; c++) {
                  int sumTriples = a + b + c;
                  if (3 * N == sumTriples) {                                  
                     System.out.printf("%s. <%d,%d,%d>\n", counter++, a, b, c);
                  }
               }
            }
         } 
      } else {
         System.out.println("The number is not in the required range");
      }
   }
   //Problem with counter test with 36
}