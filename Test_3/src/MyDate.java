import java.util.GregorianCalendar;

public class MyDate
{
   private int day, month, year;

   public MyDate(int day, int month, int year)
   {
      set(day, month, year);
   }

   public MyDate()
   {
      GregorianCalendar gregorianCalendar= new GregorianCalendar();
      set(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH), gregorianCalendar.get(GregorianCalendar.MONTH), gregorianCalendar.get(GregorianCalendar.YEAR));
   }

   public void set(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;

      if(year < 0)
      {
         this.year = -year;
      }

      if(month < 1)
      {
         this.month = 1;
      }

      if(month > 12)
      {
         this.month = 12;
      }

      if(day < 1)
      {
         this.day = 1;
      }
   }

   public boolean equals(Object obj) 
   {
      if (!(obj instanceof MyDate))
      {  
         return false;
      }
      MyDate other = (MyDate) obj;
      return day == other.getDay() && month == other.getMonth() && year == other.getYear(); 
   }

   public MyDate copy() 
   {
      return new MyDate(day, month, year);
   }



   public int getDay()
   {
      return day;
   }

   public void setDay(int day)
   {
      this.day = day;
   }

   public int getMonth()
   {
      return month;
   }

   public void setMonth(int month)
   {
      this.month = month;
   }

   public int getYear()
   {
      return year;
   }

   public void setYear(int year)
   {
      this.year = year;
   }

   public static MyDate now()
   {
      return new MyDate();
   }
}