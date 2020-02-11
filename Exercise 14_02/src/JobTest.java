
public class JobTest
{

   public static void main(String[] args)
   {
      MyDate date1 = new MyDate(1, 4, 1990);
      MyDate date2 = new MyDate(5,8,2004);
      Person person1 = new Person("John", date1);
      Person person2 = new Person("Jack", date2);
      
      Job programmer = new Job("programmer", 5000, person1);

      Job designer = new Job("designer", 4000);

      System.out.println(programmer.getSalary());

      System.out.println(programmer);

      programmer.fire();
      
      System.out.println(programmer);
      
      System.out.println(programmer.isAvailable());
      
      System.out.println(designer.isAvailable());
      
      designer.hire(person2);
      
      System.out.println(designer.isAvailable());
      
      System.out.println(programmer.equals(designer));
   }
}