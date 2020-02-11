public class DatedNote extends Note
{
   private MyDate date;

   public DatedNote(String note, MyDate date) {
      super(note);
      this.date = date;
   }

   public MyDate getDate() {
      return date;
   }

   public Note copy() {
      return new DatedNote(getNote(), date);
   }

   public String toString() {
      return "DatedNote [date=" + date + "]";
   }
}