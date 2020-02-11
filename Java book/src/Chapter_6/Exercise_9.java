package Chapter_6;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise_9
{
   public static void main(String[] args)
   {
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number");
      BigInteger n = in.nextBigInteger();
      BigInteger sum;
      BigInteger two  = new BigInteger("2");
      BigInteger product = factorial(n.multiply(two));
      BigInteger productbelow1 = factorial(n.add(BigInteger.ONE));
      BigInteger productbelow2 = factorial(n);
      BigInteger smallsum = productbelow1.multiply(productbelow2);

      sum = product.divide(smallsum);

      System.out.println("The sum is " + sum);
   }

   private static BigInteger factorial(BigInteger num) {
      if (num.equals(BigInteger.ZERO)) {
         return BigInteger.ONE;
      }   
      return num.multiply(factorial(num.subtract(BigInteger.ONE)));
   }
}