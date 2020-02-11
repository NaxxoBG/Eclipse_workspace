package Threads.Counter;

public class SynchCounter
{
   private long value = 0;

   public synchronized void inc() {
      value++;
   }

   public synchronized void dec() {
      value--;
   }

   public synchronized long value() {
      return value;
   }
}