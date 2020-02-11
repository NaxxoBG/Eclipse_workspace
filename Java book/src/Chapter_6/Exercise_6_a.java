package Chapter_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_6_a
{

   public static void main(String[] args)
   {
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      int N, K;
      System.out.println("Enter first number");
      N = in.nextInt();
      System.out.println("Enter second number");
      K = in.nextInt();

      while (N < K) {
         System.out.println("N must be greater than K");
         System.out.println("Enter first number");
         N = in.nextInt();
         System.out.println("Enter second number");
         K = in.nextInt();
      }

      long sumns = 1;
      long sumks = 1;

      ArrayList<Integer> ns = new ArrayList<>();
      ArrayList<Integer> ks = new ArrayList<>();

      for (int i = 1; i <= N; i++) {
         ns.add(i);
      }

      for (Integer integer : ns) {
         sumns *= integer;
      }

      for (int i = 1; i <= K; i++) {
         ks.add(i);
      }

      for (Integer integer : ks) {
         sumks *= integer;
      }

      long result = sumns/sumks;
      System.out.println("N!/K! = " + ns +" / " + ks + " = " + result);
      System.out.println(sumks);
   }
}