package client;

import org.apache.axis2.AxisFault;

public class TestClient1
{
   public static void main(String[] args) throws AxisFault {
      Client client = new Client("Louis");
      client.start();
   }
}