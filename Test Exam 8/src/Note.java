public abstract class Note
{
   private String note;

   public Note(String note) {
      this.note = note;
   }

   public String getNote() {
      return note;
   }

   public abstract Note copy();

   public String toString() {
      return "Note [note=" + note + "]";
   }
}