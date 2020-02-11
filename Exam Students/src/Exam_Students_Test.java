public class Exam_Students_Test
{
   public static void main(String[] args)
   {
      Student student1 = new Student("Mike", 468123, 5);

      Exam exam1 = new PassFailExam("Art", 5, false);
      Exam exam2 = new PassFailExam("Java", 15, true);
      Exam exam3 = new PassFailExam("Algorithms", 20, true);
      Exam exam4 = new GradedExam("C#", 15, 10);
      Exam exam5 = new GradedExam("Python", 15, 12);

      student1.addExam(exam1);
      student1.addExam(exam2);
      student1.addExam(exam3);
      student1.addExam(exam4);
      student1.addExam(exam5);

      System.out.println(student1.getTotalEcts());
      System.out.println(student1.getAverageGrade());
   }
}