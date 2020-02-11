package Threads.Counter;

public class OrdinaryCounter
{
   private long value = 0;

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