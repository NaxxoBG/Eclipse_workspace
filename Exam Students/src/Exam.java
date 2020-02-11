public abstract class Exam
{
   private String courseName;
   private int ectsPoints;

   public Exam(String courseName, int ectsPoints) {
      this.courseName = courseName;
      this.ectsPoints = ectsPoints;
   }

   public String getCourseName() {
      return courseName;
   }

   public int getEctsPoints() {
      return ectsPoints;
   }

   public abstract boolean isPassed();

   public String toString() {
      return "Exam courseName: " + courseName + "\nEctsPoints: " + ectsPoints;
   }
}