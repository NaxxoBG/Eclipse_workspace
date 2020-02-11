package naxxo;

import java.util.ArrayDeque;

public interface Chat
{
   static ArrayDeque<String> messages = new ArrayDeque<>();
   void sendMessage(String message);
   String receiveMessage();
}