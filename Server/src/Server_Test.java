import java.util.Arrays;

public class Server_Test
{
   public static void main(String[] args)
   {
      Server server1 = new Server("Def");

      Client client1 = new Client("John");
      Client client2 = new Client("Kyle");
      Client client3 = new Client("Jake");
      Client client4 = new Client("Peter");

      client1.increaseScore(60);
      client2.increaseScore(50);
      client3.increaseScore(40);
      client4.increaseScore(30);

      server1.addClient(client1);
      server1.addClient(client2);
      server1.addClient(client3);
      server1.addClient(client4);

      System.out.println(client1);

      System.out.println(server1.getTotalScore());
      System.out.println(server1.getHighestScore());
      System.out.println(server1.getLowestScore());

      System.out.println(server1);

      server1.removeClient(client4);
      System.out.println(server1);
      server1.addClient(client4);
      System.out.println(server1);
      
      System.out.println(server1.getAverageScore());
      System.out.println(Arrays.toString(server1.getClients()));
   }
}