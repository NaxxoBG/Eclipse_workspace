import java.util.ArrayList;

public class Server
{
   private String name;
   private ArrayList<Client> clients;

   public Server(String name) {
      this.name = name;
      this.clients = new ArrayList<>();
   }

   public String getName() {
      return name;
   }

   public Client[] getClients() {
      Client[] clientsList = new Client[clients.size()];
      clients.toArray(clientsList);
      return clientsList;
   }

   public void addClient(Client client) {
      clients.add(client);
   }

   public Client removeClient(Client client) {
      for (int i = 0; i < clients.size(); i++) {
         if (clients.get(i).equals(client))
            clients.remove(client);
      } return null;
   }

   public void increaseAllScores(int amount) {
      for (Client client : clients) {
         client.increaseScore(amount);
      }
   }

   public int getTotalScore() {
      int total = 0;
      for (Client client : clients) {
         total += client.getScore();
      }
      return total;
   }

   public int getHighestScore() {
      int highest = clients.get(0).getScore();
      for (int i = 0; i < clients.size(); i++) {
         if (highest < clients.get(i).getScore()) {
            highest = clients.get(i).getScore();
         }
      }
      return highest;
   }

   public int getLowestScore() {
      int lowest = clients.get(0).getScore();
      for (int i = 0; i < clients.size(); i++) {
         if (lowest > clients.get(i).getScore()) {
            lowest = clients.get(i).getScore();
         }
      }
      return lowest;
   }

   public int getAverageScore() {
      int average = 0;
      int totals = 0;
      for (int i = 0; i < clients.size(); i ++) {
         totals += clients.get(i).getScore();
      }
      average += totals / clients.size();
      return average;

   }


   public String toString() {
      return "\n*****Server*****:\n Name:" + name + "\nClients:\n" + clients;
   }
}