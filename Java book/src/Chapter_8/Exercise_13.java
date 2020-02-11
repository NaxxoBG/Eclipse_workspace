package Chapter_8;

import java.util.Scanner;
import java.util.function.Function;

public class Exercise_13
{
   static Function<Integer, String> converter = Integer::toBinaryString;
   static Function<Long, String> converter2 = Long::toBinaryString;
   //Sign
   public static int getSign(float num) {
      return (((Float.floatToRawIntBits(num) >> 31) == 0) ? 1 : -1);
   }

   public static int getSign(double num) {
      return (((Double.doubleToRawLongBits(num) >> 63) == 0) ? 1 : -1);
   }

   //Exponent
   public static int getExponent(float num) {
      return ((Float.floatToRawIntBits(num) >> 23) & 0xff);
   }

   public static long getExponent(double num) {
      return (int)((Double.doubleToRawLongBits(num) >> 52) & 0x7ffL);
   }

   //Mantissa
   public static int getMantissa(float num) {
      return (Float.floatToRawIntBits(num) &  0x007fffff);
   }

   public static long getMantissa(double num) {
      return (Double.doubleToRawLongBits(num) &  0x000fffffffffffffL);
   }

   public static void processDouble(double number) {
      System.out.println("Sign -> " + getSign(number));
      System.out.println("Exponent -> " + converter2.apply(getExponent(number)));
      System.out.println("Mantissa -> " + converter2.apply((getMantissa(number))));
   }

   public static void processFloat(float number) {
      System.out.println("Sign -> " + getSign(number));
      System.out.println("Exponent -> " + converter.apply(getExponent(number)));
      System.out.println("Mantissa -> " + converter.apply((getMantissa(number))));
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Please write \"f\" for float, \"d\" for double or \"q\" for quit");
      char choice = in.next().charAt(0);
      while (choice == 'f' || choice == 'd') {
         if (choice == 'd') {
            System.out.println("Enter a double");
            double number = in.nextDouble();
            processDouble(number);
         } else if (choice == 'f') {
            System.out.println("Enter a float");
            float number = in.nextFloat();
            processFloat(number);
         }
         System.out.println("Please write \"f\" for float, \"d\" for double or \"q\" for quit");
         choice = in.next().charAt(0);
      }
      System.out.println("Program shut down");
      in.close();
   }
}