public class Class_Test
{
   public static void main(String[] args)
   {
      TextBook book = new TextBook("Maths", " Svetoslav Georgiev", "Prosveta");

      Instructor instructor = new Instructor("Black", "John", "56");

      Course course = new Course("Maths", instructor, book);

      System.out.println(course);
   }
}