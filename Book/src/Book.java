public abstract class Book
{
   private String title;
   private String isbn;

   public Book(String title, String isbn) {
      this.title = title;
      this.isbn = isbn;
   }

   public String getTitle() {
      return title;
   }

   public String getIsbn() {
      return isbn;
   }
   
   public boolean equals(Object o) {
      if (!(o instanceof Book)) {
         return false;
      } else {
         Book other = (Book) o;
         return title.equals(other.title) && isbn.equals(other.isbn);
      }
   }

   public abstract String getBookType();
}