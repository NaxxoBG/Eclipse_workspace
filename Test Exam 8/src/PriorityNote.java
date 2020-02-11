public class PriorityNote extends Note
{
   private int priority;

   public PriorityNote(String note, int priority) {
      super(note);
      this.priority = priority;
   }

   public int getPriority() {
      return priority;
   }

   public Note copy() {
      return new PriorityNote(getNote(), priority);
   }

   public String toString() {
      return "PriorityNote [priority=" + priority + "]";
   }
}