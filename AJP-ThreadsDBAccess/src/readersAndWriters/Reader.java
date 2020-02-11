package readersAndWriters;

import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;
import bankExample.Account;
import bankExample.BankDatabase;

public class Reader extends Thread
{
   IReadWrite lock;
   private String reader;
   private BankDatabase database;

   public Reader(IReadWrite lock, String reader, BankDatabase database) {
      this.lock = lock;
      this.reader = reader;
      this.database = database;
   }

   public void run() {
      while(true) {
         this.beforeReading();
         lock.acquireRead();
         this.reading(selectRandomAcc());
         lock.releaseRead();
         this.afterReading();
      }
   }

   private void beforeReading() {
      System.out.printf("%nReader %s is about to read!", reader);
   }

   private void reading(Account account) {
      System.out.printf("%nReader %s is currently reading!", reader);
      try {
         Account[] accArr = database.queryDB(account);
         for (Account account2 : accArr) {
            System.out.println("\naccountNo: " + account2.accountNo + "; name: " + account2.name + "; balance: " + account2.balance);
         }
      } catch (SQLException e1) {
         System.err.println("ERROR READING");
         account = selectRandomAcc();
         reading(account);
      }
      try {
         Thread.sleep(ThreadLocalRandom.current().nextInt(2000, 4001));
      } catch (InterruptedException e) {}
   }

   private void afterReading() {
      System.out.printf("%nReader %s has finished reading!", reader);
   }

   private static Account selectRandomAcc() {
      return BankDatabase.getTotalAccounts().get((int)(Math.random() * ((BankDatabase.getTotalAccounts().size()))));
   }
}