public class PrintedBook extends Book
{
   private boolean isPaperback;

   public PrintedBook(String title, String isbn, boolean isPaperback) {
      super(title, isbn);
      this.isPaperback = isPaperback;
   }

   public boolean isPaperback() {
      if (isPaperback == true) {
         return true;
      } else {
         return false;
      }
   }

   public String getBookType() {
      if (isPaperback()) {
         return "Paperback";
      } else { 
         return "Hard cover";
      }
   }

   public boolean equals(Object o) {
      if (!(o instanceof PrintedBook)) {
         return false;
      } else {
         PrintedBook other = (PrintedBook) o;
         return super.equals(other) && isPaperback == other.isPaperback;
      }
   }

   public String toString() {
      return "PrintedBook " + super.toString() + " isPaperback=" + isPaperback;
   }
}