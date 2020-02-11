package Task3June2012;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Application implements Runnable {
   private String name;
   private MonitorQueue monitor;

   public Application(String name, MonitorQueue monitor) {
      this.name = name;
      this.monitor = monitor;
   }

   public void run() {
      while (true) {
         String write = this.writing();
         monitor.putAll(write);
      }
   }

   private String writing() {
      String randomCharSeq = RandomStringUtils.randomAlphabetic(RandomUtils.nextInt(1, 6));
      System.out.println("Application " + name + " is writing char " + randomCharSeq);
      try {
         Thread.sleep(RandomUtils.nextInt(1000, 4001));
      } catch (InterruptedException e) {}
      return randomCharSeq;
   }
}