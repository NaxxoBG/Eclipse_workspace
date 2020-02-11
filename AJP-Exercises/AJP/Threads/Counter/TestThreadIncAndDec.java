package Threads.Counter;

public class TestThreadIncAndDec
{
   public static void main(String[] args) {
      OrdinaryCounter counter = new OrdinaryCounter();
      Thread thInc = new ThreadInc("ThreadInc", counter);
      Thread thDec = new ThreadDec("ThreadDec", counter);

      thInc.start();
      thDec.start();
   }
}