package SharedInterface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

public interface  SharedInterface <T> extends Remote
{
   public ArrayList<T> getAvailableRooms(Date startDate, Date endDate) throws RemoteException;
   public ArrayList<T> getBookedRooms(Date startDate, Date endDate) throws RemoteException;
}
