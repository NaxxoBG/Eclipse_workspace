public class Grade {

   private String courseName;
   private int grade;

   public Grade(String courseName, int grade) {
      this.courseName = courseName;
      this.grade = grade;
   }

   public int getGrade() {
      return grade;
   }

   public void setGrade(int grade) {
      this.grade = grade;
   }

   public String getCourseName() {
      return courseName;
   }

   public String toString() {
      return "\nCourse name: " + courseName + "\nGrade: " + grade;
   }

   public static boolean isLegalGrade(int grade) {
      switch (grade) {
         case -3:
         case 0:
         case 2:
         case 4:
         case 7:
         case 10:
         case 12: 
            return true;

         default: 
            return false;
      }
   }
}