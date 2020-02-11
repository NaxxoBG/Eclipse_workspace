public class PassFailExam extends Exam
{
   public boolean passed;

   public PassFailExam(String courseName, int ectsPoints, boolean passed) {
      super(courseName, ectsPoints);
      this.passed = passed;
   }

   public boolean isPassed() {
      if (passed == true) {
         return true;
      }
      else {
         return false;
      }
   }

   public String toString() {
      return super.toString() + "\npassed: " + passed;
   }
}