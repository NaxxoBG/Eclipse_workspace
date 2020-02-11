package Threads.Counter;

public class TestThreadIncAndDecSync
{
   public static void main(String[] args) {
      SynchCounter counter = new SynchCounter();
      Thread thInc = new ThreadSyncInc("thInc", counter);
      Thread thDec = new ThreadSyncDec("thDec", counter);
      thInc.start();
      thDec.start();
   }
}