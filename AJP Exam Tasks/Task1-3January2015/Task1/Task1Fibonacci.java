package Task1;

public class Task1Fibonacci
{
   public static int recFibFor1(int n) {
      if (n == 0) {
         return 0;
      } else if (n == 1) {
         return 1;
      } else {
         return recFibFor1(n - 1) + recFibFor1(n - 2);
      }
   }

   public static int recFibFor2(double n) {
      if (n == 1 || n == 2) {
         return 1;
      } else if (n % 2 != 0) {
         return (int) (Math.pow(recFibFor2((n + 1) / 2), 2) + Math.pow(recFibFor2((n - 1) / 2), 2));
      } else {
         return (int) (Math.pow(recFibFor2(n / 2 + 1 ), 2) - Math.pow(recFibFor2(n / 2 - 1), 2));
      }
   }

   public static int iterFib(int n) {
      int[] res = new int[n + 1];
      res[0] = 0;
      res[1] = 1;

      for (int i = 2; i < res.length; i++) {
         res[i] = res[i-1] + res[i-2];
      }
      return res[res.length-1];
   }

   public static void main(String[] args) {
      System.out.println(recFibFor1(9));
      System.out.println(recFibFor2(9));
      System.out.println(iterFib(9));
   }
}