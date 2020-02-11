
public class Person_Test
{

   public static void main(String[] args)
   {
      Person student1 = new Student("John", "Studying", 400, "Maths");
      System.out.println(student1);
      
      Person student2 = new Student("Tim", "Reading", 500, "Literature");
      
      
      Person secretary = new Secretary("Jill", "answering calls", 2000, "0843924352");
      System.out.println(secretary);
      
      System.out.println(student1.equals(student2));
   }
}