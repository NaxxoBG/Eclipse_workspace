package Task1;

public class Binomial
{
   public static int factorial(int num) {
      int res = 1;
      for (int i = 1; i <= num; i++) {
         res = res*i;
      }
      return res;
   }

   public static int binomial(int n, int q) {
      return factorial(n) / (factorial(n - q) * factorial(q));
   }

   public static int recBinomial(int n, int q) {
      if (q == 0 || n == q) {
         return 1;
      } else {
         return recBinomial(n-1, q) + recBinomial(n - 1, q - 1);
      }
   }

   public static void main(String[] args) {
      System.out.println(factorial(5));
      System.out.println("----------");
      System.out.println(binomial(4, 2));
      System.out.println("----------");
      System.out.println(recBinomial(4, 2));
   }
}
