import java.util.Scanner;
public class MyDate
{
   Scanner input = new Scanner(System.in);
   public int day; 
   public int month;
   public int year;

   public MyDate (int day, int month, int year) 
      {
         this.day = day;
         this.month = month;
         this.year = year;
      }
      public void setDay(int d)
      {
         day = d;
      }
      public void setMonth(int m)
      {
         month = m;
      }
      public void setYear(int y)
      {
         if (y < 0)
         {
            y = -y;
         }
         year = y;
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
}