package JUnitTests;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;

import org.junit.Test;

import Server.Server;

public class SingletonPattern
{

   @Test
   public void test() throws RemoteException, ClassNotFoundException, MalformedURLException, AlreadyBoundException
   {
      Server server1 = Server.getInstance();
      Server server2 = Server.getInstance();
      assertEquals(server1.hashCode(), server2.hashCode());
      assertEquals(server1, server2);
   }

}
