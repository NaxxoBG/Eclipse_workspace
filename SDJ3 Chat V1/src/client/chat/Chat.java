package client.chat;

import java.rmi.RemoteException;

public class Chat implements ChatHandlerInterface
{
   private ChatUser user;
   private String user2;
   private boolean chatStatus;
   private boolean chatFeed;

   public Chat(ChatUser user, String user2, ChatRemoteInterface inter) {
      this.user = user;
      this.user2 = user2;
      this.chatStatus = true;
      chatFeed = false;
   }

   public synchronized void processChat() throws RemoteException {
      while (!endChat(chatStatus)) {
         chatUser();
         printChatFeed();
      }
   }

   private synchronized void chatUser() throws RemoteException {
      this.user.sendMessagetoClient(user2);
   }

   public synchronized boolean endChat(boolean endIt) {
      notifyAll();
      return chatStatus = endIt;
   }
   
   public String getUsername() {
      return user.getName();
   }
   
   public String getUsername2() {
      return this.user2;
   }
   
   public synchronized void printChatFeed() throws RemoteException {
      while (!chatFeed) {
         try {
            wait();
         } catch (InterruptedException e) {}
      }
      chatFeed = false;
      user.printChatFeed();
      notifyAll();
   }
}