public class EBook extends Book
{
   private String url;

   public EBook(String title, String isbn, String url) {
      super(title, isbn);
      this.url = url;
   }

   public String getUrl() {
      return url;
   }

   public String getBookType() {
      return "E-book";
   }

   public boolean equals(Object o) {
      if (!(o instanceof EBook)) {
         return false;
      } else {
         EBook other = (EBook) o;
         return super.equals(other) && url.equals(other.url);
      }
   }

   public String toString() {
      return super.toString() + " EBook [url=" + url + "]";
   }
}