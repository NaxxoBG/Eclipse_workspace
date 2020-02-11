package client.chat;

import java.rmi.RemoteException;

public interface ChatHandlerInterface
{
   public void processChat() throws RemoteException;
   public void printChatFeed() throws RemoteException;
}