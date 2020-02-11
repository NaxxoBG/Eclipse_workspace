package readersAndWriters;

import java.sql.SQLException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import bankExample.Account;
import bankExample.BankDatabase;

public class Writer extends Thread
{
   IReadWrite lock;
   String writer;
   private static BankDatabase database;

   final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   final static int N = ALPHABET.length();

   public Writer(IReadWrite lock, String writer, BankDatabase database) {
      this.lock = lock;
      this.writer = writer;
      Writer.database = database;
   }

   public void run() {
      while (true) {
         this.beforeWriting();
         lock.acquireWrite();
         this.writing(accountGenerator());
         lock.releaseWrite();
         this.afterWriting();
      }
   }

   private void beforeWriting() {
      System.out.printf("%nWriter %s is about to write!%n", writer);
   }

   private void afterWriting() {
      System.out.printf("%nWriter %s has finished writing!%n", writer);
   }

   private void writing(Account account) {
      System.out.printf("%nWriter %s is currently writing!%n", writer);
      try {
         Writer.database.insertDB(account);
      } catch (SQLException e2) {
         System.err.println("ERROR WRITING");
         account = accountGenerator();
         writing(account);
      }
      try {
         Thread.sleep(ThreadLocalRandom.current().nextInt(2000, 4001));
      } catch (InterruptedException e) {}
   }

   private static Account accountGenerator() {
      Account account = new Account(ThreadLocalRandom.current().nextInt(1, 100), nameGen(), ThreadLocalRandom.current().nextDouble(100, 1001));
      database.addAccount(account);
      return account;
   }

   private static String nameGen() {
      Random r = new Random();
      StringBuilder builder = new StringBuilder();
      for (int i = 0; i < 2; i++) {
         builder.append(ALPHABET.charAt(r.nextInt(N)));
      }
      return builder.toString();
   }
}