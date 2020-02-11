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

      if(day > numberOfDaysInMonth())
      {
         this.day = numberOfDaysInMonth();
      }
   }

   public void set(int day, String monthName, int year)
   {
      set(day, convertToMonthNumber(monthName), year);
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

   public String getMonthName()
   {
      switch(month)
      {
         default : return null;
         case 1: return "January";
         case 2: return "February";
         case 3: return "March";
         case 4: return "April";
         case 5: return "May";
         case 6: return "June";
         case 7: return "July";
         case 8: return "August";
         case 9: return "September";
         case 10: return "October";
         case 11: return "November";
         case 12: return "December";
      }
   }

   public void stepForwardOneDay() 
   {
      day++;
      if(day > numberOfDaysInMonth())
      {
         month++;
         day = 1;
         if(month > 12)
         {
            year++;
            month = 1;
         }
      }
   }

   public void stepForward(int days)
   {
      for(int i = 0; i < days; i++)
      {
         stepForwardOneDay();
      }
   }

   public boolean isLeapYear()
   {
      if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
         return true;
      else
         return false;
   }

   public int numberOfDaysInMonth()
   {
      switch (month)
      {
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
            return 31;
         case 2:
            if (isLeapYear())
               return 29;
            else
               return 28;
         case 4:
         case 6:
         case 9:
         case 11:
            return 30;
         default:
            return -1;
      }
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

   public String toString()
   {
      String day = this.day + "";
      String month = this.month + "";
      String year = this.year + "";

      if (this.day < 10)
      {
         day = "0" + this.day;
      }
      if (this.month < 10)
      {
         month = "0" + this.month;
      }
      if (this.year < 1000)
      {

         year = "0" + this.year;

         if (this.year < 100)
         {

            year = "0" + year;

            if (this.year < 10)
            {
               year = "0" + year;
            }
         }
      }

      return day + "/" + month + "/" + year;
   }

   public boolean isBefore(MyDate other)
   {
      if(this.year < other.getYear())
      {
         return true;
      }
      else if(this.month < other.getMonth())
      {
         return true;
      }
      else if(this.day < other.getDay())
      {
         return true;
      }
      else
      {
         return false;
      }
   }

   public int yearsBetween(MyDate other)
   {
      int potentialAnswer = 0;

      if(this.year < other.getYear())
      {
         potentialAnswer = Math.abs(this.year - other.getYear());
         if(this.month > other.getMonth())
         {
            potentialAnswer--;           
         }
         else if(this.day > other.getDay() && this.month == other.getMonth())
         {
            potentialAnswer--;
         }
      }
      else if(this.year > other.getYear())
      {
         potentialAnswer = Math.abs(this.year - other.getYear());
         if(this.month < other.getMonth())
         {
            potentialAnswer--;           
         }
         else if(this.day > other.getDay() && this.month == other.getMonth())
         {
            potentialAnswer--;
         }
      }
      return potentialAnswer;
   }

   public int daysBetween(MyDate other) 
   {
      if(isBefore(other))
      {
         MyDate counterDate = this.copy();
         int counter = 0;
         while(counterDate.isBefore(other))
         {
            counterDate.stepForwardOneDay();
            counter++;
         }
         return counter;
      }
      else
      {
         MyDate counterDate = other.copy();
         int counter = 0;
         while(counterDate.isBefore(this))
         {
            counterDate.stepForwardOneDay();
            counter++;
         }
         return counter;
      }
   }

   public static int convertToMonthNumber(String monthName) 
   {
      switch(monthName.toUpperCase())
      {
         default : return -1;
         case "JANUARY" : return 1;
         case "FEBRUARY" : return 2;
         case "MARCH" : return 3;
         case "APRIL" : return 4;
         case "MAY" : return 5;
         case "JUNE" : return 6;
         case "JULY" : return 7;
         case "AUGUST" : return 8;
         case "SEPTEMBER" : return 9;
         case "OCTOBER" : return 10;
         case "NOVEMBER" : return 11;
         case "DECEMBER" : return 12;
      }
   }

   public static MyDate now()
   {
      return new MyDate();
   }
}