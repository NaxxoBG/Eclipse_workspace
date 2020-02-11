package Task1June2010;

public class Division
{
   public static int intDivision(int m, int n) {
      if (m < n || m == 0) {
         return 0;
      } else if (n == 0) {
         return new Integer(null);
      } else {
         return 1 + intDivision(m - n, n);
      }
   }



   public static int iterIntDiv(int m, int n) {
      int res = 0;
      if (n == 0) {
         res = new Integer(null);
      }
      while (m >= n) {
         m -= n;
         res++;    
      }
      return res;

   }

   public static void main(String[] args) {
      System.out.println(intDivision(64, 8));
      System.out.println(iterIntDiv(64, 8));
   }
}