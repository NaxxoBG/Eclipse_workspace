import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.postgresql.util.PSQLException;

public class SQLJavaInsertAndDisplay
{
   public static void main(String[] args)
   {
      Connection connection = null;
      Statement statement = null;
      try {
         Class.forName("org.postgresql.Driver");
         connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "password");
         System.out.println("Database opened successfully.");
         statement = connection.createStatement();
         try {
            String sql = "INSERT INTO \"Students\".classes"
                  + "(SectionID, CourseNo, Semester, Year, Instructor)"
                  + "VALUES (190, 'CAL1', 'Spring', 16, 'Ronald');";
            statement.executeUpdate(sql);
            System.out.println("Insertion was successful.\n");
         } catch(PSQLException e) { System.out.println("Dupicate values.\n"); }
         ResultSet rs = statement.executeQuery("SELECT * FROM \"Students\".classes;");
         while(rs.next()) {
            int sectionID = rs.getInt("sectionid");
            String  courseNo = rs.getString("courseno");
            String  semester = rs.getString("semester");
            int year = rs.getInt("year");
            String instructor = rs.getString("instructor");
            System.out.println("Section ID: " + sectionID);
            System.out.println("Course Number: " + courseNo);
            System.out.println("Semester: " + semester);
            System.out.println("Year: " + year);
            System.out.println("Instructor: " + instructor);
            System.out.println();
         }
         rs.close();
         statement.close();
         connection.close();
      } catch (Exception e) {System.err.println( e.getClass().getName()+": "+ e.getMessage()); System.exit(0);}
      System.out.println("Operation done successfully.");
   }
}