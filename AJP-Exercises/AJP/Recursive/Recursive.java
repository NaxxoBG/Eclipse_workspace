// ***************************************************
// File name  : Recursive.java
// Start date : 
// Programmer : Hans So.
// Java       : Java 1.7
// Description:
// ***************************************************

package Recursive;

public class Recursive
{

   public static long fac(int n) // factorial
   {
      if (n == 0) {
         return 1;
      }
      else
         return n * fac(n - 1);
   }

   public static int sum(int n) // 1 + 2 + .. + n
   {
      if (n == 1) {
         return 1;
      }
      return n + sum(n - 1);
   }

   public static double power(double x, int n) // x raised to n'th power; n >= 0
   {
      if (n == 0) {
         return 1;
      }
      else if (x == 0) {
         return 0;
      }
      return x * power(x, n - 1);
   }

   public static int fib(int n) // Fibonacci numbers
   {
      if (n == 0) {
         return 0;
      }
      else if (n == 1) {
         return 1;
      }
      return fib(n - 1) + (fib(n - 2));
   }

   public static long iterativeFib(int n) // Fibonacci numbers, iterative
   // solution
   {
      long[] fibnum = new long[n + 1];
      fibnum[0] = 0;
      fibnum[1] = 1;

      for (int i = 2; i < n + 1; i++) {
         fibnum[i] = fibnum[i - 1] + fibnum[i - 2];
      }
      return fibnum[n];
   }

   // a: from, b: to, c: using
   public static void moveHanoiTower(int n, char a, char b, char c) // perhaps
   // static
   {
      if (n > 0) {
         moveHanoiTower(n - 1, a, c, b);
         System.out.println("Move a disc from tower " + a + " to tower " + c);
         moveHanoiTower(n - 1, b, a, c);
      }
   }

   public static void moveHanoiTowerV2(int n, char a, char b, char c) {
      if (n == 1) {
         System.out.println("Move a disc from " + a + " to " + c);
      }
      else {
         moveHanoiTowerV2(n - 1, a, c, b);
         moveHanoiTowerV2(1, a, b, c);
         moveHanoiTowerV2(n - 1, b, a, c);
      }
   }

   // prints the string s reverse; e.g if s = "abcd", the method prints "dcba"
   public static String printString(String s) {
      if (s.length() == 0)
         return s;
      return printString(s.substring(1)) + s.charAt(0);
   }

   // prints val in base 2; e.g. if val = 3, 101 is printed
   public static void printInt(int val) {
      if (val > 0) {
         printInt(val / 2);
         System.out.print(val % 2);
      }
   }

   // prints val in base; e.g. if base is 16, the value is printed in
   // hexadecimal.
   // Example: val = 19 is printed as A3; base = 2 and value = 19: 10011 is
   // printed
   public static void printInt(int value, int base) {
      if (value < base) {
         printValue(value);
      }
      else {
         printInt(value / base, base);
         printValue(value % base);
      }
   }

   private static void printValue(int value) {
      switch (value) {
         case 10:
            System.out.print("A");
            break;
         case 11:
            System.out.print("B");
            break;
         case 12:
            System.out.print("C");
            break;
         case 13:
            System.out.print("D");
            break;
         case 14:
            System.out.print("E");
            break;
         case 15:
            System.out.print("F");
            break;
         default:
            System.out.print(value);
            break;
      }
   }
}