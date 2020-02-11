public class Secretary extends Employee
{
   private String number;

   public Secretary(String name, String work, int salary, String number)
   {
      super(name, work, salary);
      this.number = number;
   }

   public String getNumber() {
      return number;
   }

   public void setSalary(String salary) {
      this.number = salary;
   }

   public boolean equals(Object arg) {
      if (!(arg instanceof Secretary)) {
         return false;
      } else {
         Secretary other = (Secretary) arg;
         return super.equals(other) && number == other.number;
      }
   }

   public String toString()
   {
      return "\nSecretary\nNumber: " + number + super.toString();
   }
}