import java.util.ArrayList;

public class GradeList_Test
{
   public static void main(String[] args)
   {
      Grade grade1 = new Grade("Maths", 4);
      Grade grade2 = new Grade("History", 5);
      Grade grade3 = new Grade("Art", 2);
      Grade grade4 = new Grade("English", 6);

      ArrayList<Grade> allGrades = new ArrayList<>();

      GradeList list = new GradeList(allGrades);
      list.addGrade(grade1);
      list.addGrade(grade2);
      list.addGrade(grade3);
      list.addGrade(grade4);

      System.out.println(list);
      System.out.println(list.getAverage());

      System.out.println(list.getAllGrades());
      System.out.println(list.getGrade(3));
      System.out.println(Grade.isLegalGrade(-3));
   }
}