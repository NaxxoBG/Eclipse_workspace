package Threads.Counter;

public class ThreadSyncDec extends Thread
{
   private SynchCounter counter;
   private final int N = 500*1000*1000;

   public ThreadSyncDec(String name, SynchCounter counter) {
      super(name);
      this.counter = counter;
   }

   public void run() {
      for (int i = N; i > 0; i--) {
         counter.dec();
         System.out.println(getName() + " finished: Counter.value = " + counter.value());
      }
   }
}