package Chapter_9;

import java.math.BigInteger;

public class Exercise_8
{
   private static BigInteger factorialOfNum(int number) {
      BigInteger num = BigInteger.ONE;

      for (int i = 1; i <= number; i++) {
         num = num.multiply(new BigInteger(new Integer(i).toString()));
      }

      return num;
   }

   public static void main(String[] args) {
      System.out.println(factorialOfNum(5).toString());
   }
}