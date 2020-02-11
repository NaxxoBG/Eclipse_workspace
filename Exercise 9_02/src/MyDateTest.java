
public class MyDateTest
{

   public static void main(String[] args)
   {
      
      MyDate date1 = new MyDate(6,2,2008);
      MyDate date2 = new MyDate(0, 0, 0);
      
      //Changing the value of an already set month
      date1.setMonth(4);
      
      System.out.println(date1.getFulldate());
      System.out.println(date1.isLeapYear());
      System.out.println(date1.numberOfDaysInMonth());
      System.out.println(date1.getMonthName());
      
      //Manually give day, month and year values 
      date2.getDay();
      date2.getMonth();
      date2.getYear();
      System.out.println(date2.getFulldate());
      System.out.println(date1.equals(date2));
   }
}