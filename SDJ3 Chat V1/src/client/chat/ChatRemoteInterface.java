package client.chat;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ChatRemoteInterface extends Remote
{
   public void sendMessage(String message, String client, String addressee) throws RemoteException;
   public void registerUser(ChatUser user) throws RemoteException;
   public ArrayList<ChatUser> getAllUsers() throws RemoteException;
   public void getRegisteredUsers() throws RemoteException;
}