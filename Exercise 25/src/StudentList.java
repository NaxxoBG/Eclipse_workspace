import java.util.ArrayList;

public class StudentList
{
   private ArrayList<Student> list;

   public StudentList() {
      list = new ArrayList<Student>();
   }

   public void add(Student student) {
      list.add(student);
   }

   public void set(Student student, int index) {
      list.set(index, student);
   }

   public Student get(int index) {
      return list.get(index);
   }

   public Student get(String firstName, String lastName) {
      for (Student student : list) {
         if (firstName.equals(student.getFirstName()) && lastName.equals(student.getLastName())) {
            return student;
         }
      }
      return null;
   }

   public int getIndex(String firstName, String lastName) {
      for (Student student : list) {
         if (firstName.equals(student.getFirstName()) && lastName.equals(student.getLastName())) {
            return list.indexOf(student) + 1;
         }
      }
      return 0;
   }

   public int size() {
      return list.size();
   }

   public String toString() {
      return "StudentList\n" + list;
   }
}