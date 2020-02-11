package Bisection;

public class BisectionTest
{
   public static void main(String[] args) {
      System.out.println("--------TEST--1--RECURSIVE---------------\n");
      System.out.format(" Result of recursive method --> %.4f\n\n",Bisection.solveEq(Bisection.F, 1, 3, 0.00001));
      System.out.println("--------END--OF--TEST--1--RECURSIVE------\n");
      System.out.println("--------TEST--2--ITERATIVE---------------\n");
      System.out.format(" Result of iterative method --> %.4f\n\n",Bisection.solveEqIterative(Bisection.F, 1, 3, 0.00001));
      System.out.println("--------END--OF--TEST--2--ITERATIVE------\n");
   }
}