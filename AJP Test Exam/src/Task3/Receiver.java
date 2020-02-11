package Task3;

public class Receiver extends Thread
{
   int id;
   Port port;

   public Receiver(int id, Port port) {
      this.id = id;
      this.port = port;
   }

   public void run() {
      while (true) {
         String message = port.receive();
         this.hasBeenReceived(message);
      }
   }

   private void hasBeenReceived(String message) {
      System.out.println("The message: " + message + " has been received by: Receiver #" + id);
   }
}