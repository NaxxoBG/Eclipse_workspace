package Client;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client
{
   public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
      //String name = "//10.52.229.242/calculatorServer";
      String name = "//localhost/Server";
      CalculatorInterface inter = (CalculatorInterface) Naming.lookup(name);
      System.out.println(inter.subtract(3.6, 2.6));
      System.out.println(inter.multiply(4, 7));
   }
}