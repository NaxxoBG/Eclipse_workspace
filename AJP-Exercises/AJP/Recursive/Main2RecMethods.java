//*****************************************************************************
//File name  : Main2RecMethods.java.
//Start date :
//Programmer : Hans So.
//Java       : Java 1.7
//Description: see http://en.wikipedia.org/wiki/Recursion_(computer_science)
//*****************************************************************************
package Recursive;

public class Main2RecMethods
{
   public static void main (String[] args)
   {
      System.out.println ("*** Start of recursion, call and test the recursive methods here ***");

      long a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, x, y;
      a = System.currentTimeMillis();
      System.out.println(Recursive.fac(4));
      b = System.currentTimeMillis();
      System.out.println("Factorial execution time: " + (b - a));
      System.out.println();

      c = System.currentTimeMillis();
      System.out.println(Recursive.sum(4));
      d = System.currentTimeMillis();
      System.out.println("Sum execution time: " + (d - c));
      System.out.println();

      e = System.currentTimeMillis();
      System.out.println(Recursive.power(2,3));
      f = System.currentTimeMillis();
      System.out.println("Power execution time: " + (f - e));
      System.out.println();

      g = System.currentTimeMillis();
      System.out.println(Recursive.fib(5));
      h = System.currentTimeMillis();
      System.out.println("Fibonacci execution time: " + (h - g));
      System.out.println();

      i = System.currentTimeMillis();
      System.out.println(Recursive.iterativeFib(5));
      j = System.currentTimeMillis();
      System.out.println("Iterative Fibonacci execution time: " + (j - i));
      System.out.println();

      x = System.currentTimeMillis();
      char a1 = 'a';
      char b1 = 'b';
      char c1 = 'c';
      Recursive.moveHanoiTower(3,a1, b1, c1);
      System.out.println("\nHanoi tower solution V2\n");
      Recursive.moveHanoiTowerV2(3, a1, b1, c1);
      y = System.currentTimeMillis();
      System.out.println("Hanoi Tower solution execution time: " + (y - x));
      System.out.println();
      
      k = System.currentTimeMillis();
      System.out.println(Recursive.printString("abcd"));
      l = System.currentTimeMillis();
      System.out.println("PrintString execution time: " + (l - k));
      System.out.println();
      
      m = System.currentTimeMillis();
      Recursive.printInt(34);
      n = System.currentTimeMillis();
      System.out.println();
      System.out.println("PrintInt execution time: " + (n - m));
      System.out.println();
      
      o = System.currentTimeMillis();
      Recursive.printInt(19, 16);
      p = System.currentTimeMillis();
      System.out.println();
      System.out.println("PrintInt with specific base execution time: " + (p - o));
      
      System.out.println ("*** End of recursion ***");
   }
}