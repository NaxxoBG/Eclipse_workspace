// ***************************************************
// File name  : Main.java
// Start date : 2015
// Programmer : Hans So.
// Java       : Java 1.7 
// Description: 
// ***************************************************

package Threads.BoundedCounter;

public class Main
{
   public static void main (String[] args) 
   { 
      Counter bc = new BoundedCounter(4);
      System.out.println ("*** BC at start: " + bc.value()); 

      Thread t1 = new IncThread ("IncThread", bc);
      Thread t2 = new DecThread ("DecThread", bc);

      t1.start();
      t2.start();
   }
}
