import java.util.ArrayList;

public class Student
{
   private String name;
   private int studentNumber;
   private int numberOfExams;
   private ArrayList<Exam> exams;

   public Student(String name, int studentNumber, int numberOfExams) {
      this.name = name;
      this.studentNumber = studentNumber;
      this.numberOfExams = numberOfExams;
      exams = new ArrayList<Exam>(numberOfExams);
   }

   public String getName() {
      return name;
   }

   public int getStudentNumber() {
      return studentNumber;
   }

   public void addExam(Exam exam) {
      exams.add(exam);
   }

   public int getTotalEcts() {
      int total = 0;
      for (Exam exam : exams) {
         if (exam.isPassed() == true) {
            total += exam.getEctsPoints();
         }
      }
      return total;
   }

   public double getAverageGrade() {
      double total = 0;
      for (Exam exam : exams) {
         if (exam instanceof GradedExam) {
            total += ((GradedExam) exam).getGrade();
         }
      }
      return total / numberOfExams;
   }
}