public class StudentFileAdapter
{
   private String fileName;
   private MyFileIO myFileIO;

   public StudentFileAdapter(String fileName)
   {
      this.fileName = fileName;
      myFileIO = new MyFileIO();
   }

   public StudentList getAllStudents()
   {
      //return (StudentList) myFileIO.readObjectFromFile(fileName); //This method can be used if Student and StudentList are Serializable
      StudentList result = new StudentList();
      Object[] strings = myFileIO.readArrayFromFile(fileName);
      for(int i = 0; i < strings.length/3; i++)
      {
         Student student = new Student((String) strings[i*3], (String) strings[i*3+1], (String) strings[i*3+2]);
         result.add(student);
      }
      return result;
   }

   public void saveStudents(StudentList students)
   {
      //myFileIO.writeToFile(fileName, students); //This method can be used if Student and StudentList are Serializable
      String[] strings = new String[students.size()*3];
      for(int i = 0; i < students.size(); i++)
      {
         strings[i*3+0] = students.get(i).getFirstName();
         strings[i*3+1] = students.get(i).getLastName();
         strings[i*3+2] = students.get(i).getCountry();
      }
      myFileIO.writeToFile(fileName, strings);
   }

   public StudentList getStudentsFromCountry(String country)
   {

      StudentList students = getAllStudents();
      StudentList result = new StudentList();
      for(int i = 0; i < students.size(); i++)
      {
         Student tempStudent = students.get(i);
         if(tempStudent.getCountry().equals(country))
         {
            result.add(tempStudent);
         }
      }
      return result;

   }

   public void changeCountryCode(String firstName, String lastName, String country)
   {
      StudentList students = getAllStudents();
      students.get(firstName, lastName).setCountry(country);
      saveStudents(students);
   }
}