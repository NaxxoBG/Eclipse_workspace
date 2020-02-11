package Server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import Client.CalculatorInterface;

@SuppressWarnings("serial")
public class Server extends UnicastRemoteObject
{
   protected Server() throws RemoteException {
      super();
   }

   public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
      Calculator obj = new Calculator();
      CalculatorInterface inter = (CalculatorInterface) UnicastRemoteObject.exportObject(obj, 0);

      LocateRegistry.createRegistry(1099);
      Naming.bind("//localhost/Server", inter);

      //System.out.println(inter.multiply(4, 2));
      //if (System.getSecurityManager() == null) {
      //   System.setSecurityManager(new SecurityManager());
      //}
   }
}