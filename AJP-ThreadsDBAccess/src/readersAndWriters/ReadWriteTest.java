package readersAndWriters;

import java.util.Arrays;

import bankExample.Account;
import bankExample.BankDatabase;

public class ReadWriteTest
{
   public static void main(String[] args) {
      System.out.println("DbBank start ...");
      IReadWrite lock = new ReadWrite();

      BankDatabase database = new BankDatabase("postgres", "account");
      Account acc = new Account(21, "YY", 300.00);
      Account acc2 = new Account (1, "TR", 500.00);
      Account acc3 = new Account (14, "GF", 600.00);
      BankDatabase.getTotalAccounts().addAll(Arrays.asList(acc, acc2, acc3));

      new Reader(lock, Integer.toString(1), database).start();
      new Reader(lock, Integer.toString(2), database).start();
      try {
         Thread.sleep(3000);
      } catch (InterruptedException e) {} 
      new Writer(lock, Integer.toString(1), database).start();
   }
}