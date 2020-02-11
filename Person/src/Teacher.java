public class Teacher extends Person
{
   private int salary;

   public Teacher(String name, String work, int salary) {
      super(name, work);
      this.salary = salary;
   }

   public int getSalary() {
      return salary;
   }

   public void setSalary(int salary) {
      this.salary = salary;
   }

   public boolean equals(Object arg) {
      if (!(arg instanceof Teacher)) {
         return false;
      } else {
         Teacher other = (Teacher) arg;
         return super.equals(other) && salary == other.salary;
      }
   }

   public String toString() {
      return super.toString() + "\nSalary: " + salary;
   }
}