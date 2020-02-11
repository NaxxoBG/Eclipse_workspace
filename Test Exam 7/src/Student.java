public class Student
{
   private String name;
   private Education education;

   public Student(String name, Education education) {
      this.name = name;
      this.education = education;
   }

   public String getName() {
      return name;
   }

   public Education getEducation() {
      return education;
   }

   public void changeEducation (Education education) {
      this.education = education;
   }

   public boolean equals (Object o) {
      if (!(o instanceof Student)) {
         return false;
      } else {
         Student other = (Student) o;
         return other.name.equals(name) && other.education.equals(education);
      }
   }

   public String toString() {
      return "Student [name=" + name + ", education=" + education + "]";
   }
}