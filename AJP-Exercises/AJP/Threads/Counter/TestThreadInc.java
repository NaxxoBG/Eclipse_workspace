package Threads.Counter;

public class TestThreadInc
{
   public static void main(String[] args) {
      OrdinaryCounter counter = new OrdinaryCounter();
      Thread thInc = new ThreadInc("ThreadInc", counter);
      thInc.start();
   }
}