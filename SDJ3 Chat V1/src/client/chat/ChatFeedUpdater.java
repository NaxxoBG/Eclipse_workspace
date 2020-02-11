package client.chat;

import java.rmi.RemoteException;

public class ChatFeedUpdater implements Runnable
{
   Chat chat;

   @Override
   public void run() {
      while (true) {
         try {
            updateFeed();
         } catch (RemoteException e) {
            e.printStackTrace();
         }
      }
   }

   private void updateFeed() throws RemoteException {
      chat.printChatFeed();
   }
}
