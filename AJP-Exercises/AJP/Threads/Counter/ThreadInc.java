package Threads.Counter;

public class ThreadInc extends Thread
{
   private OrdinaryCounter counter;
   private final int N = 500*1000*1000;

   public ThreadInc(String name, OrdinaryCounter counter) {
      super(name);
      this.counter = counter;
   }

   public void run() {
      for (int i = 0; i < N; i++) {
         counter.inc();
         System.out.println(getName() + " finished: Counter.value = " + counter.value());
      }
   }
}