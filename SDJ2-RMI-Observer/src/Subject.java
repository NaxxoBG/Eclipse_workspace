import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Subject implements SubjectInterface
{
   private ArrayList<Observer> observers;
   private String message;
   private String messageV2;

   public Subject() {
      this.observers = new ArrayList<Observer>();
   }

   public String getMessage() {
      return message;
   }

   public void attach(Observer observer) {
      observers.add(observer);
   }

   public void notifyAllObservers() throws RemoteException {
      for (Observer observer : observers) {
         observer.update();
      }
   }

   public void setMessage(String message) throws RemoteException {
      this.message = message;
      notifyAllObservers();
   }

   public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException, InterruptedException, UnknownHostException {
      Subject sub = new Subject();
      System.out.println(InetAddress.getLocalHost());
      SubjectInterface inter = (SubjectInterface) UnicastRemoteObject.exportObject(sub, 0);
      LocateRegistry.createRegistry(1099);
      Naming.bind("//localhost/Server", inter);

      for (int i = 0; i < 10; i++) {
         sub.setMessage(i + "");
         Thread.sleep(3000);
         sub.setMessageV2(i * 5 + "");
         Thread.sleep(4000);
      }
   }

   public String getMessageV2() throws RemoteException {
      return messageV2;
   }

   public void setMessageV2(String message) throws RemoteException {
      messageV2 = message;
   }
}