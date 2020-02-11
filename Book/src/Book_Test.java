public class Book_Test
{
   public static void main(String[] args)
   {
      Book print = new PrintedBook("Greatness", "23514GD46", true);
      Book hard = new PrintedBook("Road", "41678HA93", false);
      Book ebook = new EBook("Traveller", "53756VZ28", "www.gdfhdh.com");

      System.out.println(print.getBookType());
      System.out.println(hard.getBookType());
      System.out.println(ebook.getBookType());
      System.out.println(print.equals(hard));
   }
}