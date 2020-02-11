import java.util.ArrayList;

public class BookList
{
   private ArrayList<Book> books;

   public BookList() {
      books = new ArrayList<Book>();
   }

   public int getNumberOfBooks() {
      return books.size();
   }

   public void addBook(Book book) {
      books.add(book);
   }

   public Book getBook(int index) {
      return books.get(index);
   }

   public Book getBook(String isbn) {
      for (Book book : books) {
         if (book.getIsbn().equals(isbn)) {
            return book;
         }
      }
      return null;
   }

   public Book removeBook(int index) {
      return books.remove(index);
   }

   public int getIndexOfFirstPrintedBook() {
      int index = 0;
      for (Book book : books) {
         if (book instanceof PrintedBook ) {
            index = books.indexOf(book);
         }
         break;
      }
      return index;
   }

   public int getNumberOfBooksByType(String bookType) {
      ArrayList<Book> type = new ArrayList<>();
      for (Book book : books) {
         if (book.getBookType().equals(bookType)) {
            type.add(book);
         }
      }
      return type.size();
   }

   public Book[] getBooksByType(String bookType) {
      ArrayList<Book> types = new ArrayList<>();
      for (Book book : books) {
         if (book.getBookType().equals(bookType)) {
            types.add(book);
         }
      }
      return (Book[]) types.toArray();
   }

   public EBook[] getAllEBooks() {
      ArrayList<Book> ebooks = new ArrayList<>();
      for (Book book : books) {
         if (book instanceof EBook) {
            ebooks.add(book);
         }
      }
      return (EBook[]) ebooks.toArray();
   }

   public String toString() {
      return "BookList [books=" + books + "]";
   }

   public boolean equals(Object o) {
      if (!(o instanceof BookList)) {
         return false;
      } else {
         BookList other = (BookList) o;
         return books.equals(other.books);
      }
   }
}