import java.util.ArrayList;

public class StudentList
{
   public int size;
   public ArrayList<Student> list;

   public StudentList() {
      this.list = new ArrayList<>(size);
   }

   public void addStudent(Student student) {
      list.add(student);
   }

   public Student getStudent(int index) {
      return list.get(index);
   }

   public void removeStudent (Student student) {
      list.remove(student);
   }

   public int getNumberOfStudents() {
      return list.size();
   }

   public int getNumberOfStudentsByEducation(Education education) {
      int counter = 0;
      for (Student student : list) {
         if (student.getEducation().equals(education)) {
            counter++;
         }
      }
      return counter;
   }

   public Student[] getStudentsByEducation(Education education) {
      ArrayList<Student> students = new ArrayList<>();
      for (Student student : list) {
         if (student.getEducation().equals(education)) {
            students.add(student);
         }
      }
      return (Student[]) students.toArray();
   }

   public int getNumberOfHighSchoolStudents() {
      int counter = 0;
      ArrayList<Education> educations = new ArrayList<>();

      for (int i = 0; i < list.size(); i++) {
         educations.add(list.get(i).getEducation());
      }

      for (Education school : educations) {
         if (((School) school).getSchoolType().equals("High school"));
         counter++;
      }
      return counter;
   }
}