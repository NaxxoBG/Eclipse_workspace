
public class Job
{
   private String title;
   private double salary;
   private Person employee;

   public Job(String title, double salary, Person employee)
   {
      this.title = title;
      this.salary = salary;
      this.employee = employee;
   }

   public Job(String title, double salary) {

      this.title = title;
      this.salary = salary;
      employee = null;
   }

   public double getSalary()
   {
      return salary;
   }
   public void setSalary(double salary)
   {
      this.salary = salary;
   }
   public String getTitle()
   {
      return title;
   }

   public Person getEmployee() {
      return employee;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Job)) {
         return false;
      } else {

         Job other = (Job) obj;
         return title.equals(other.title) && salary == other.salary;

      }

   }

   public boolean isAvailable() {
      if (employee != null) {
         return false;
      } else {
         return true;
      }
   }

   public void hire(Person employee) {
      if(isAvailable()) {
         this.employee = employee;
      } else {
         System.out.println("The position is taken!");
      }

   }

   public void fire() {
      employee = null;

   }

   public String toString() {

      return "name: " + employee + "\ntitle: " + title + "\nsalary: " + salary;
   }
}