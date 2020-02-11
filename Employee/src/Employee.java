public class Employee
{
   //EmployeeList ----> Employee (Association)

   private String name;
   private int age;
   private double salary;

   public Employee(String name, int age, double salary) {
      this.name = name;
      this.age = age;
      this.salary = salary;
   }

   public Employee(String name, double salary) {
      this.name = name;
      this.age = 0;
      this.salary = salary;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public double getSalary() {
      return salary; 
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   public String toString() {
      return String.format("----------\nName: %s\nAge: %s\nSalary: %s", name, age, salary);
   }

   public boolean equals(Object o) {
      if (!(o instanceof Employee)) {
         return false;
      } else {
         Employee other = (Employee) o;
         return name.equals(other.name) && age == other.age && salary == other.salary;
      }
   }
}