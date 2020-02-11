package Task3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Sender extends Thread
{
   final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   final static int N = ALPHABET.length();
   Port port;
   Message message;
   int id;

   public Sender(Port port, int id) {
      this.port = port;
      this.id = id;
   }

   public void run() {
      while (true) {
         Message message = messageGen();
         String messageString = message.toString();
         boolean result = port.send(messageString);
         this.hasBeenSent(messageString, result);
      }
   }

   private static Message messageGen() {
      Random r = new Random();
      StringBuilder builder = new StringBuilder();
      for (int i = 0; i < 6; i++) {
         builder.append(ALPHABET.charAt(r.nextInt(N)));
      }
      Message message = new Message(builder.toString());
      return message;
   }

   private void hasBeenSent(String message, boolean status) {
      System.out.println("Sender " + id + " has sent the message " + message + " | STATUS: " + status);
      try {
         Thread.sleep(ThreadLocalRandom.current().nextLong(1001, 2001));
      } catch (InterruptedException e) {}
   }
}