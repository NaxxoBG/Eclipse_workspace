public class Book extends Item
{
   private String author;
   private String publisher;
   private int edition;

   public Book(String name, String author, String publisher, int edition) {
      super(name);
      this.author = author;
      this.publisher = publisher;
      this.edition = edition;
   }

   public String getAuthor() {
      return author;
   }

   public String getPublisher() {
      return publisher;
   }

   public int getEdition() {
      return edition;
   }

   public String toString() {
      return "Book [author=" + author + ", publisher=" + publisher
            + ", edition=" + edition + "]";
   }

   public boolean equals(Object o) {
      if (!(o instanceof Book)) {
         return false;
      } else {
         Book other = (Book) o;
         return getName().equals(other.getName()) && author.equals(other.author) && publisher.equals(other.publisher) && edition == other.edition;
      }
   }
}