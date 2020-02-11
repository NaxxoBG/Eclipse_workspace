public class Brain
{
   private MyList memories;

   public Brain() {
      memories = new MyList();
   }

   public Brain(MyList memories) {
      this.memories = memories;
   }

   public void addMemory(String memory) {
      memories.addItem(memory);
   }

   public String forget(String memory) {
      memories.removeItem(memory);
      return memory + " was removed.";
   }

   public boolean remember(String memory) {
      if (memories.contains(memory)) {
         return true;
      }
      return false;
   }

   public String toString() {
      return "Brain [memories=" + memories + "]";
   }
}