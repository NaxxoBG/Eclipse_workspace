package client.chat;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import address.server.AddressServer;

public class ChatUser implements Serializable
{
   private static final long serialVersionUID = 1L;
   private String name;
   private ChatRemoteInterface inter;
   private Scanner scanner;
   private HashMap<String, String> messages;

   public ChatUser(String name) throws MalformedURLException, RemoteException, NotBoundException, java.net.ConnectException {
      this.name = name;
      this.messages = new HashMap<>();
      try {
         inter = (ChatRemoteInterface) Naming.lookup(AddressServer.SERVER_NAME);
      } catch (java.rmi.ConnectException e) {
         System.out.println("Could not connect to object!\n" + e.getMessage());
      }
      inter.registerUser(this);
      System.out.println("Stub received");
      scanner = new Scanner(System.in);
   }

   public void sendMessagetoClient(String addressee) throws RemoteException {
      System.out.println("Please enter your message to user: " + addressee);
      String message = scanner.nextLine();
      try {
         inter.sendMessage(message, this.name, addressee);
      } catch (java.util.NoSuchElementException e) {
         System.out.println("Message not sent");
         System.out.println("User with ID: \"" + addressee + "\" is not registered in the system!\n" + e.toString());
         System.out.println(Arrays.asList(inter.getAllUsers()));
      }
   }

   public void printChatFeed() throws RemoteException {
      System.out.println("Press enter to check chat feed");
      scanner.nextLine();
      messages = inter.getAllUsers().get(0).getMessages();
      if (messages.isEmpty()) {
         System.out.println("No messages");
      } else {
         messages.entrySet().stream()
         .map(a -> LocalDateTime.now().toString().split("T")[1] + " | From " + a.getKey() + " : " + a.getValue())
         .forEach(System.out::println);
         messages.clear();
      }
   }

   public void printAllUsers() throws RemoteException {
      System.out.println(inter.getAllUsers());
   }

   public void checkOnlineUsers() throws RemoteException {
      inter.getRegisteredUsers();
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public HashMap<String, String> getMessages() {
      return messages;
   }

   public ChatRemoteInterface getSharedObject() {
      return this.inter;
   }

   public Scanner getInput() {
      return this.scanner;
   }

   @Override
   public String toString() {
      return "ChatUser Name: " + name + ", Messages: " + messages;
   }
}