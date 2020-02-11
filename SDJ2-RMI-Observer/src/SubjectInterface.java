import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SubjectInterface extends Remote
{
   public String getMessage() throws RemoteException;
   public String getMessageV2() throws RemoteException;
   public void attach(Observer observer) throws RemoteException;
}