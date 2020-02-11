package client;

import java.rmi.RemoteException;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.apache.axis2.AxisFault;

import naxxo.stub.ChatStub;
import naxxo.stub.ChatStub.SendMessage;

public class Client
{
   private ChatStub stub;
   private String name;

   public Client(String name) throws AxisFault {
      this.stub = new ChatStub();
      this.name = name;
   }

   public void start() {
      System.out.println("Welcome to the chat room, " + name + ".\nType \"quit\" to exit the program.");
      this.sendingMessages();
      this.receivingMessages();
   }

   private void sendingMessages() {
      SendMessage send = new ChatStub.SendMessage();
      Scanner in = new Scanner(System.in);
      new Thread(new Runnable() {
         String time = "";
         @Override
         public void run() {
            String message = in.nextLine();
            while (!message.equalsIgnoreCase("quit")) {
               time = LocalDateTime.now().toString().split("T")[1];
               message = time + " | " + name + ": " + message;
               send.setArgs0(message);
               try {
                  stub.sendMessage(send);
               } catch (RemoteException e) {
                  e.printStackTrace();
               }
               message = in.nextLine();
            }
            in.close();
            System.out.println("Program shut down");
            System.exit(0);
         }}).start();
   }

   private void receivingMessages() {
      new Thread(new Runnable() {
         String message = "";
         @Override
         public void run() {
            for (;;) {
               try {
                  ChatStub.ReceiveMessageResponse received = stub.receiveMessage(new ChatStub.ReceiveMessage());
                  if (message.equals(received.get_return())) {
                     continue;
                  } else {
                     message = received.get_return();
                     System.out.println(message);
                  }
               } catch (RemoteException e) {
                  e.printStackTrace();
               }
            }
         }}).start();
   }
}