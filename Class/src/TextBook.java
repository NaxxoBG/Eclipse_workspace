public class TextBook
{
   private String title;
   private String author;
   private String publisher;
   
   public TextBook(String textTitle, String auth, String pub) {
      title = textTitle;
      author = auth;
      publisher = pub;
   }

   public TextBook (TextBook object2) {
      title = object2.title;
      author = object2.author;
      publisher = object2.publisher;
   }

   public void set(String textTitle, String auth, String pub) {
      title = textTitle;
      author = auth;
      publisher = pub;
   }

   public String toString()
   {
      return String.format("\n Title is: %s\n Author is: %s\n Publisher is: %s", title, author, publisher);
   }
}