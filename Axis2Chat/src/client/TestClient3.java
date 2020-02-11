package client;

import org.apache.axis2.AxisFault;

public class TestClient3
{
   public static void main(String[] args) throws AxisFault {
      Client client = new Client("Bill");
      client.start();
   }
}