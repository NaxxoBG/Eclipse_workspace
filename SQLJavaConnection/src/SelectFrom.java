import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectFrom {
   public static void main(String args[])
   {
      Connection c = null;
      Statement stmt = null;
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "goobyplease");
         c.setAutoCommit(false);
         System.out.println("Opened database successfully");
         stmt = c.createStatement();
         ResultSet rs = stmt.executeQuery( "SELECT * FROM \"Company Assignment\".employee;");
         while (rs.next()) {
            String ssn = rs.getString("ssn");
            String fname = rs.getString("fname");
            String lname  = rs.getString("lname");
            float salary = rs.getFloat("salary");
            System.out.println("SSN = " + ssn);
            System.out.println("FNAME = " + fname);
            System.out.println("AGE = " + lname);
            System.out.println("SALARY = " + salary);
            System.out.println();
         }
         rs.close();
         stmt.close();
         c.close();
      } catch (Exception e) {
         System.err.println(e.getClass().getName()+": "+ e.getMessage());
         System.exit(0);
      }
      System.out.println("Operation done successfully");
   }
}