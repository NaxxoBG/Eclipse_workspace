package bankExample;
// *****************************************************************************
// File name  : BankDatabase.java
// Start date : Sep 26, 2013
// Programmer : Hans So.
// Java       : Java 1.6.0 
// Description: 
//
// Revision history:
//   date     init  comment
//
// *****************************************************************************

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@SuppressWarnings("unused")
public class BankDatabase
{
   private Database db;
   private String table;
   private static List<Account> totalAccounts;

   public BankDatabase(String dbName, String table) {
      this.table = table;
      BankDatabase.setTotalAccounts(new ArrayList<Account>());
      try {
         this.db = new Database(dbName);
      } catch (ClassNotFoundException e) {
         System.out.println("MySQL driver not found. Exiting.");
         System.exit(1);
      }
   }

   public synchronized void addAccount(Account account) {
      BankDatabase.getTotalAccounts().add(account);
   }

   public synchronized void insertDB(Account acc) throws SQLException {
      // The id (primary key) is auto incremented
      //String sql = "INSERT INTO " + table + "(accountNo, name, balance) VALUES (?, ?, ?)";
      String sql = "INSERT INTO \"Bank\".account (accountNo, name, balance) VALUES (?, ?, ?)";
      try {
         db.update(sql, acc.accountNo, acc.name, acc.balance);
      }    
      catch (SQLException e) {
         e.printStackTrace();
      }
   }

   public synchronized void updateDB(Account acc) throws SQLException {
      String sql = "UPDATE \"Bank\".account SET balance = balance + ? where accountNo = ?";
      try {
         db.update(sql, acc.balance, acc.accountNo);
      }
      catch (SQLException e) {
         e.printStackTrace();
      }
   }

   public synchronized void deleteDB(Account acc) throws SQLException {
      System.out.println("BankDatabase.deleteDB; no test of balance == 0.00");

      String sql = "DELETE FROM \"Bank\".account WHERE accountNo = ?";
      try {
         db.update(sql, acc.accountNo);
      }
      catch (SQLException e) {
         e.printStackTrace();
      }
   }

   public synchronized Account[] queryDB(Account acc) throws SQLException {
      String sql = "SELECT accountNo, name, balance FROM \"Bank\".account WHERE name = ?";

      ArrayList<Object[]> list;
      Account[] accountList;
      try {
         list = db.query(sql, acc.name);

         accountList = new Account[list.size()];

         for (int i = 0; i < accountList.length; i++) {
            accountList[i] = toAccount(list.get(i));
         }
         return accountList;
      }
      catch (SQLException e) {
         e.printStackTrace();
         return null;
      }
   }

   private Account toAccount(Object[] arr) {    
      Account acc = new Account (((Number) arr[0]).intValue(), arr[1].toString(), ((Double)arr[2]).doubleValue());
      return acc;
   }

   public static void main(String[] args) throws Exception {
      System.out.println("DbBank start ...");

      BankDatabase db = new BankDatabase("postgres", "account");
      Account acc = new Account(21, "YY", 300.00);
      db.insertDB(acc);
      Account acc2 = new Account (1, "TR", 500.00);
      db.insertDB(acc2);
      Account acc3 = new Account (14, "GF", 600.00);
      db.insertDB(acc3);

      Map<Integer, Account[]> map = new HashMap<Integer, Account[]>();
      Account[] accArr = db.queryDB(acc);
      Account[] accArr2 = db.queryDB(acc2);
      Account[] accArr3 = db.queryDB(acc3);

      map.put(1, accArr);
      map.put(2, accArr2);
      map.put(3, accArr3);

      for (Entry<Integer, Account[]> entry : map.entrySet()) {
         Account[] result = entry.getValue();
         for (Account account : result) {
            System.out.println("\naccountNo: " + account.accountNo + "; name: " + account.name + "; balance: " + account.balance);
         }
      }
      System.out.println("\nDbBank: arr size: " + map.size());
      System.out.println("\nDbBank END");
   }

   public static List<Account> getTotalAccounts() {
      return totalAccounts;
   }

   public static void setTotalAccounts(List<Account> totalAccounts) {
      BankDatabase.totalAccounts = totalAccounts;
   }
}