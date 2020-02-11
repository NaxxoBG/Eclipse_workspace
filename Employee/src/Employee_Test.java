public class Employee_Test
{
   public static void main(String[] args)
   {
      Employee one = new Employee("Jack", 45, 6500);
      Employee two = new Employee("John", 25, 7500);

      Employee[] work = {one, two};

      EmployeeList list1 = new EmployeeList(work);

      System.out.println("************************");
      System.out.println(list1);
      System.out.println("************************");
      System.out.println(one);
      System.out.println(two);
      System.out.println(list1.getTotalSalary());
      list1.changeSalary("Jack", 11000);
      System.out.println(one);
      System.out.println(one.equals(two));
   }
}