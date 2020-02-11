// *****************************************************************************
// File name  : Counter.java.
// Start date : 
// Programmer : Hans So.
// Java       : 
// Description: 
//
// Revision history:
//   date     init  comment
//
// *****************************************************************************

package Threads.BoundedCounter;

public class Counter //implements ICounter
{
   private long value;

   public void inc() {      
      value++;
   }   

   public void dec() {
      value--;
   }

   public long value() {
      return value;
   }
}