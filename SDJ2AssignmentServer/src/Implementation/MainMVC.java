package Implementation;

import java.io.IOException;
import java.net.Inet4Address;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import Room.Room;
import SharedInterface.SharedInterface;

public class MainMVC
{

   @SuppressWarnings({ "unchecked", "unused" })
   public static void main(String[] args) throws ClassNotFoundException, AlreadyBoundException, IOException {

      //Runtime.getRuntime().exec("rmiregistry 1099");

      //  System.setProperty("java.security.policy","file:///C:/Users/Daniel/workspace2-32bit/RMId/server.policy");

      /*	if(System.getSecurityManager() == null){
			System.setSecurityManager(new SecurityManager());
		}
       */

      Implementation impl = Implementation.getInstance();
      System.out.println(Inet4Address.getLocalHost());

      SharedInterface<Room> inter = (SharedInterface<Room>) UnicastRemoteObject.exportObject(impl, 0);
      LocateRegistry.createRegistry(1099);
      //Naming.rebind("rmi://localhost:1099/Server", inter);
      Naming.rebind("rmi://localhost:1099/Server", inter);
      System.out.println("Server is running");

      Model model = new Model();
      View view = new View();
      Controller controller = new Controller(view, model);
   }
}