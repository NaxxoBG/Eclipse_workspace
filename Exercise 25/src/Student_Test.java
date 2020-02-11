public class Student_Test
{
   public static void main(String[] args)
   {
      Student student1 = new Student("John", "Cena", "USA");
      Student student2 = new Student("Kech", "Maniq", "Canada");
      Student student3 = new Student("Bill", "Davidson", "Mexico");

      StudentList students = new StudentList();
      students.add(student1);
      students.add(student2);
      students.add(student3);

      System.out.println(students);
      System.out.println(students.size());

      System.out.println(students.getIndex("Bill", "Davidson"));
   }
}