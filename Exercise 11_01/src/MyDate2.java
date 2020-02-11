import java.util.Calendar;
import java.util.Scanner;
public class MyDate2
{
   Scanner input = new Scanner(System.in);
   private int day; 
   private int month;
   private int year;

   public MyDate2 (int day, int month, int year) 
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }


   public void set(int day, int month,int year)
   {
      if (month < 1)
         this.month = 1;
      else if (month > 12)
         this.month = 12;
      else
         this.month = month;
      if (year < 0)
         this.year = -year;
      else
         this.year = year;
      if (day < 1)
         this.day = 1;
      else if (day > numberOfDaysInMonth())
         this.day = numberOfDaysInMonth();
      else
         this.day = day;
   }
   public void set(int day, String monthName, int year)
   {
      this.day = day;
      this.month = convertToMonthNumber(monthName);
      this.year = year;
   }

   public int getDay()
   {
      System.out.println("Type a day:");
      int day = input.nextInt();


      while (day < 1 || day > 31 ) 
      {
         System.out.println("The date must be valid! Try again!");
         day = input.nextInt();        
      }
      return this.day = day;
   }
   public int getMonth()
   {
      System.out.println("------------------------\nType a month:");
      int month = input.nextInt();


      while (month < 1 || month > 12) 
      {
         System.out.println("The month must be valid! Try again!");
         month = input.nextInt();
      }

      return this.month = month;
   }


   public int getYear()
   {
      System.out.println("------------------------\nType a year:");
      int year = input.nextInt();


      while (year < 1000 || year > 2100) 
      {
         System.out.println("------------------------\nThe year must be valid! Try again!");
         year = input.nextInt();      
      }
      return this.year = year;
   }
   public String getFulldate()
   {
      String fulldate = null;
      if ( month <= 9) 
      {
         fulldate = "The full date is "+ day + "/0" + month + "/" + year;
      }
      else 
      {
         fulldate = "The full date is " + day + "/" + month + "/" + year;
      }
      return fulldate;
   }
   public boolean isLeapYear() 
   {
      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) 
      {
         System.out.println("The year is leap.");
         return true;
      } else 
      {
         System.out.println("The year is not leap.");
         return false;
      }
   }

   public int numberOfDaysInMonth() 
   {
      switch(month) 
      {
         case 1:  
            System.out.println("The number of days in January is");
            return 31;
         case 2: if (isLeapYear() == false)
         { 


            System.out.println("The number of days in February is");
            return 28;
         }
         else 
         {

            System.out.println("The number of days in February is");
            return 29;
         }
         case 3: 
            System.out.println("The number of days in March is");
            return 31;
         case 4: 
            System.out.println("The number of days in April is");
            return 30;
         case 5: 
            System.out.println("The number of days in May is");
            return 31;
         case 6: 
            System.out.println("The number of days in June is");
            return 30;
         case 7: 
            System.out.println("The number of days in July is");
            return 31;
         case 8: 
            System.out.println("The number of days in August is");
            return 31;
         case 9: 
            System.out.println("The number of days in September is");
            return 30;
         case 10: 
            System.out.println("The number of days in October is");
            return 31;
         case 11: 
            System.out.println("The number of days in November is");
            return 30;
         case 12: 
            System.out.println("The number of days in December is");
            return 31;
      }
      return day;
   }

   public String getMonthName() 
   {
      switch (month) 
      {
         case 1: return "January";
         case 2 : return "February";
         case 3 : return "March";
         case 4 : return "April";
         case 5 : return "May";
         case 6 : return "June";
         case 7 : return "July";
         case 8 : return "August";
         case 9 : return "September";
         case 10 : return "October";
         case 11: return "November";
         case 12 : return "December";
      }
      return toString(month);

   }
   private String toString(int month2)
   {

      return null;
   }
   public void stepForwardOneDay() 
   {
      day++;
      if (day > numberOfDaysInMonth())
      {
         month++;
         day = 1;
         if (month > 12) 
         {
            year++;
            month = 1;
         }
      }
   }

   public void stepForward(int days)
   {
      for (int i = 0; i < days; i++)
         stepForwardOneDay();
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


   public boolean equals(Object o) 
   {
      if (!(o instanceof MyDate2))

         return false;
      else {

         MyDate2 other = (MyDate2) o;
         System.out.println("The dates are equal! (From the equals method)");
         return other.day == day && other.month == month && other.year == year;
      }
   }



   public MyDate2 copy() 
   {
      return new MyDate2(day, month, year);
   }

   public boolean isBefore(MyDate2 other) 
   {
      if ((this.day < other.day) || ((this.month < other.month) && (this.year < other.year)))
      { 
         System.out.println("The date is before!");
         return true;
      }
      if (this.year < other.year)
      { 
         System.out.println("The date is before!");
         return true;
      }
      if (this.month < other.month && this.year < other.year)
      { 
         System.out.println("The date is before!");
         return true;
      }
      if ((this.day > other.day) && (this.month < other.month) && (this.year < other.year))
      { 
         System.out.println("The date is before!");
         return true;
      }
      if ((this.day >= other.day) && (this.month <= other.month) && (this.year < other.year))
      { 
         System.out.println("The date is before!");
         return true;
      }
      if ((this.day >= other.day) && (this.month <= other.month) && (this.year < other.year))
      { 
         System.out.println("The date is before!");
         return true;
      }

      else if (this.day == other.day && this.month == other.month && this.year == other.year) 
      {
         System.out.println("The dates are equal.");
         return false;
      }
      else 
      {
         System.out.println("The date is NOT before.");
         return false;
      }
   }

   public int yearsBetween(MyDate2 other) 
   {
      if (this.year > other.year) 
      {
         int yeardiff = this.year - other.year;
         System.out.println("The number of years in between is");
         return yeardiff;
      } 
      else if (this.year < other.year) 
      {
         int yeardiff1 = other.year - this.year;
         System.out.println("The number of years in between is");
         return yeardiff1;
      }
      else if (this.year == other.year) 
      {
         System.out.println("The number of years in between is");
         return 0;
      }
      return day;
   }

   public int daysBetween(MyDate2 other) 
   {
      if (isBefore(other)) 
      {
         MyDate2 counterDate =this.copy();
         int counter = 0;
         while(isBefore(other)) 
         {
            counterDate.stepForwardOneDay();
            counter++;
         }
         return counter;
      }

      else 
      {
         @SuppressWarnings("unused")
         MyDate2 counterDate = other.copy();
         @SuppressWarnings("unused")
         int counter = 0;
      }
      return 0;
   } 

   public MyDate2()
   {
      set(Calendar.DAY_OF_MONTH, Calendar.MONTH+1,Calendar.YEAR);
   }

   public static MyDate2 now() 
   {
      return new MyDate2();
   }
}