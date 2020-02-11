// ***************************************************
// File name  : IncThread.java
// Start date : 2015
// Programmer : Hans So.
// Java       : Java 1.7
// Description:
// ***************************************************

package Threads.BoundedCounter;

public class IncThread extends Thread
{
   Counter bc;

   public IncThread (String name, Counter bc) {
      super (name);
      this.bc = bc;
   }

   public void run () {
      System.out.println ("* Thread:  " + getName () + ".run ()");
      while(true) {
         doSomeThingBefore();
         bc.inc ();
         doSomeThingAfter();
      }
   }

   private void doSomeThingBefore() {
      System.out.println ("Implement doSomeThingBefore");
      try {
         Thread.sleep(2000);
      } catch (InterruptedException e) {}
   }

   private void doSomeThingAfter() {
      System.out.println ("Implement doSomeThingAfter");
      try {
         Thread.sleep(1000);
      }
      catch (InterruptedException e) {}
   }
}