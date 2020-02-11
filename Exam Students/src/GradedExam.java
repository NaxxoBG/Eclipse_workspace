public class GradedExam extends Exam
{
   private int grade;
   private static final int[] graded = {-3, 0, 2, 4, 7, 10, 12};

   public GradedExam(String courseName, int ectsPoints, int grade) {
      super(courseName, ectsPoints);
      this.grade = grade;
   }

   public boolean isPassed() {
      if (grade == graded[0] || grade == graded[1]) {
         return false;
      } else {
         return true;
      }
   }

   public int getGrade() {
      return grade;
   }

   public String toString() {
      return super.toString() + "\ngrade: " + grade;
   }
}