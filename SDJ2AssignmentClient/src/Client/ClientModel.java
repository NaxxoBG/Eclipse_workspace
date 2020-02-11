package Client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Room.Room;
import SharedInterface.SharedInterface;

public class ClientModel
{
   private ArrayList<Room> availableRooms;
   private ArrayList<Room> bookedRooms;
   private SharedInterface<Room> inter;
   private Scanner scanner;   
   
   @SuppressWarnings("unchecked")
   public ClientModel() throws RemoteException, MalformedURLException, NotBoundException{
      String name = "//10.52.224.93:42559/Server";
      inter = (SharedInterface<Room>) Naming.lookup(name);
      scanner = new Scanner(System.in);
   }
   
   public void updateAvailable(Date startDate, Date endDate) throws RemoteException {
      availableRooms = inter.getAvailableRooms(startDate, endDate);
   }
   
   public void updateBooked(Date startDate, Date endDate) throws RemoteException {
      bookedRooms= inter.getBookedRooms(startDate, endDate);
   }
   
   public ArrayList<Room> getAvailableRooms() {
      return availableRooms;
   }
   
   public ArrayList<Room> getBookedRooms() {
      return bookedRooms;
   }

   public String stringInput(){
      return scanner.nextLine();
   }
}