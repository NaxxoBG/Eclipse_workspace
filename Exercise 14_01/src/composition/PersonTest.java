package composition;

public class PersonTest
{
   public static void main(String[] args)
   {
      MyDate date = new MyDate();
      MyDate birthday = new MyDate(12,3,1980);

      Person guy = new Person("John", birthday);

      System.out.println(guy.getBirthday());
      System.out.println(guy.toString());
      System.out.println(date.toString());
      System.out.println(date.yearsBetween(birthday));
      System.out.println(MyDate.now());
   }
}