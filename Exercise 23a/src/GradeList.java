import java.util.ArrayList;

public class GradeList{

   private int indexOfNextAvailableElement;
   private ArrayList<Grade> grades;

   public GradeList(ArrayList<Grade> grade) {
      grades = grade;
   }

   public int getSize() {
      return grades.size();
   }

   public Grade getGrade(int index) {
      return grades.get(index);
   }

   public void addGrade(Grade grade) {
      grades.add(grade);
   }

   public Grade[] getAllGrades() {
      Grade[] all = new Grade[grades.size()];
      for (int i = 0; i < grades.size(); i++) {
         all[i] = grades.get(i);
      }
      return all;
   }

   public double getAverage() {
      double average;
      double sum = 0;
      for (int i = 0; i < grades.size(); i++) {
         sum += grades.get(i).getGrade();
      }
      average = sum / grades.size();
      System.out.println("\nThe average grade is: ");
      return average;
   }

   public String toString() {
      return "indexOfNextAvailableElement: "
            + indexOfNextAvailableElement + "\nGrades: "
            + grades;
   }
}