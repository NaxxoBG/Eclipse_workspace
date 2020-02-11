package Client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client
{
   public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
      String name = "//localhost/Server";
      VehicleMakerInterface inter = (VehicleMakerInterface) Naming.lookup(name);
      inter.makeCar();
      inter.makeBoat();
      inter.makeTruck();
   }
}
