package Server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import Client.VehicleMakerInterface;

@SuppressWarnings("serial")
public class Server extends UnicastRemoteObject
{
   protected Server() throws RemoteException {}

   public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
      VehicleMaker obj = new VehicleMaker();
      VehicleMakerInterface inter = (VehicleMakerInterface) UnicastRemoteObject.exportObject(obj, 0);
      LocateRegistry.createRegistry(1099);
      Naming.bind("//localhost/Server", inter);
   }
}