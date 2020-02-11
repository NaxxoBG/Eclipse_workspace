import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class Client_Subscriber2 extends UnicastRemoteObject implements Observer
{
   public static SubjectInterface subject;
   private String message;

   protected Client_Subscriber2(SubjectInterface subject) throws RemoteException {
      super();
      Client_Subscriber.subject = subject;
      subject.attach(this);
   }

   public void update() throws RemoteException {
      message = subject.getMessageV2();
      System.out.println(message);
   }

   public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
      subject = (SubjectInterface) Naming.lookup("//localhost/Server");
      @SuppressWarnings("unused")
      Client_Subscriber2 sub = new Client_Subscriber2(subject);
      subject.getMessageV2();
   }
}