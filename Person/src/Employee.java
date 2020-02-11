public class Employee extends Person
{
   private int salary;

   public Employee(String name, String work, int salary) {
      super(name, work);
      this.salary = salary;
   }

   public int getSalary()
   {
      return salary;
   }

   public void setSalary(int salary)
   {
      this.salary = salary;
   }


   public String toString() {
      return String.format("%s\nSalary: %s", super.toString(), salary);
   }

   public boolean equals(Object arg) {
      if (!(arg instanceof Employee)) {
         return false;
      } else {
         Employee other = (Employee) arg;
         return super.equals(other) && salary == other.salary;
      }
   }
}