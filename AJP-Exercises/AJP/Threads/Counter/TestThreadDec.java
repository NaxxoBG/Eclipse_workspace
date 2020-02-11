package Threads.Counter;

public class TestThreadDec
{
   public static void main(String[] args) {
      OrdinaryCounter counter = new OrdinaryCounter();
      Thread thDec = new ThreadDec("ThreadDec", counter);
      thDec.start();
   }
}