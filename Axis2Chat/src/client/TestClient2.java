package client;

import org.apache.axis2.AxisFault;

public class TestClient2
{
   public static void main(String[] args) throws AxisFault {
      Client client = new Client("Francis");
      client.start();
   }
}