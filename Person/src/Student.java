public class Student extends Teacher
{
   private String classes;

   public Student(String name, String work, int salary, String classes) {
      super(name, work, salary);
      this.classes = classes;
   }

   public String getClasses()
   {
      return classes;
   }

   public void setSalary(String classes)
   {
      this.classes = classes;
   }

   public boolean equals(Object arg) {
      if (!(arg instanceof Student)) {
         return false;
      } else {
         Student other = (Student) arg;
         return super.equals(other) && classes.equals(other.classes);
      }
   }

   public String toString() {
      return "\nStudent\nClasses: " + classes + " " + super.toString();
   }
}