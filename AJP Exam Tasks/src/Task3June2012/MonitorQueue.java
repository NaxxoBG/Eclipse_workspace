package Task3June2012;

public class MonitorQueue
{
   private CircularArray<Character> queue;
   String name;

   public MonitorQueue(int queueSize, String name) {
      this.queue = new CircularArray<Character>(queueSize);
      this.name = name;
   }

   public synchronized void put(char c) {
      if (queue.isFull()) {
         c = Character.MIN_VALUE;
      } else {
         queue.put(c);
         puttingChar(c);
         notifyAll();
      }
   }

   public synchronized char take() {
      while (queue.isEmpty()) {
         try {
            wait();
         } catch (InterruptedException e) {}
      }
      char character = queue.take();
      takingChar(character);
      notifyAll();
      return character;
   }

   public synchronized void putAll(String str) {
      char[] stringChar = str.toCharArray();
      for (int i = 0; i < stringChar.length; i++) {
         put(stringChar[i]);
      }
   }

   private void puttingChar(char c) {
      System.out.println("Character " + c + " has been put in the queue!");
   }

   private void takingChar(char c) {
      System.out.println("Character " + c + " has been taken from the queue");
   }
}