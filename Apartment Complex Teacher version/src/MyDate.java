import java.util.Calendar;


public class MyDate
{

   private int day;
   private int month;
   private int year;
   
   public MyDate(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }
   
   public int getDay()
   {
      return day;
   }

   public int getMonth()
   {
      return month;
   }

   public int getYear()
   {
      return year;
   }
   
   public void set(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }
   
   public MyDate copy()
   {
      MyDate returnDate;
      returnDate = new MyDate(day, month, year);
      return returnDate;
   }
   
   public static MyDate now()
   {
      MyDate returnDate;
      returnDate = new MyDate(Calendar.DAY_OF_MONTH, Calendar.MONTH+1, Calendar.YEAR);
      return returnDate;
   }
   
}
