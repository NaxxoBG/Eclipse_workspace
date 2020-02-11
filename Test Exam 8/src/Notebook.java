import java.util.ArrayList;

public class Notebook
{
   private int numberOfNotes;
   private ArrayList<Note> notes;

   public Notebook(int maxNumberOfNotes) {
      notes = new ArrayList<>(maxNumberOfNotes);
   }

   public void addNote(Note note) {
      notes.add(note);
   }

   public void setNote(Note note, int index) {
      notes.set(index, note);
   }

   public void removeNote(Note note) {
      notes.remove(note);
   }

   public Note getNote(int index) {
      return notes.get(index);
   }

   public String toString() {
      return "Notebook [numberOfNotes=" + numberOfNotes + ", notes=" + notes
            + "]";
   }

   public int getNumberOfPriorityNotes() {
      int counter = 0;

      for (Note note : notes) {
         if (note instanceof PriorityNote == true) {
            counter++;
         }
      }
      return counter;
   }

   public PriorityNote[] getPriorityNotes() {
      ArrayList<Note> pnotes = new ArrayList<>();
      
      for (Note note : pnotes) {
         if (note instanceof PriorityNote == true) {
            pnotes.add(note);
         }
      }
      int largest = ((PriorityNote) pnotes.get(0)).getPriority();
      
      for (Note note : pnotes)
      {
         if (((PriorityNote) note).getPriority() > largest) {
            largest = ((PriorityNote) note).getPriority();
            pnotes.set(0, note);
         }
      }
      
      return (PriorityNote[]) pnotes.toArray();
   }
}