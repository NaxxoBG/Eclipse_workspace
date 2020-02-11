
public class MyDate2Test
{

   public static void main(String[] args)
   {
      MyDate2 date = new MyDate2(3, 3, 2013);
      MyDate2 date1 = new MyDate2(3, 3, 2013);
      
      System.out.println(date.numberOfDaysInMonth());
      
      System.out.println(date.getFulldate());
      System.out.println(date1.getFulldate());
      
      System.out.println(date.isBefore(date1));
      System.out.println(date.equals(date1));
      System.out.println(date.yearsBetween(date1));
      
      
   }

}
