package address.server;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import client.chat.ChatRemoteInterface;
import client.chat.ChatUser;

public class AddressServer implements ChatRemoteInterface, Serializable
{
   private static final long serialVersionUID = 1L;
   public static final String SERVER_NAME = "//localhost/Server";
   private ArrayList<ChatUser> users;

   public AddressServer() throws RemoteException {
      users = new ArrayList<>();
   }

   public void registerUser(ChatUser user) {
      users.add(user);
   }

   @Override
   public void sendMessage(String message, String client, String addressee) throws RemoteException {
      users
      .stream()
      .filter(e -> e.getName().equals(addressee))
      .findAny()
      .get()
      .getMessages()
      .put(client, message);
   }

   public ArrayList<ChatUser> getAllUsers() throws RemoteException {
      return users;
   }

   @Override
   public void getRegisteredUsers() throws RemoteException {
      users.stream().map(ChatUser::getName).reduce((e, f) -> e + ", " + f).ifPresent(System.out::println);
   }

   public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
      try {
         ChatRemoteInterface server = new AddressServer();
         ChatRemoteInterface shared = (ChatRemoteInterface) UnicastRemoteObject.exportObject(server, 0);

         LocateRegistry.createRegistry(1099);
         Naming.bind(SERVER_NAME, shared);

         System.out.println("Remote object is bound");
      } catch (Exception e) {
         System.out.println("Failed to bind remote object!\n" + e.getLocalizedMessage());
      }
   }
}