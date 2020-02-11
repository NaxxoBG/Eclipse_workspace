package Threads.Counter;

public class ThreadDec extends Thread
{
   private OrdinaryCounter counter;
   private final int N = 500*1000*1000;

   public ThreadDec(String name, OrdinaryCounter counter) {
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
