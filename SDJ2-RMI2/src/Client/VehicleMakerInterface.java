package Client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface VehicleMakerInterface extends Remote
{
   public void makeCar() throws RemoteException;
   public void makeTruck() throws RemoteException;
   public void makeBoat() throws RemoteException;
}