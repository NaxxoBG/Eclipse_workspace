import java.util.ArrayList;

public class Team
{
   private String name;
   private ArrayList<Player> players;

   public Team(String name, ArrayList<Player> members) {
      this.name = name;
      players = members;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getTotalScore() {
      int total = 0;
      for (int i = 0; i < players.size(); i++) {
         total += players.get(i).getScore();
      }
      return total;
   }

   public Player getLeadingPlayer() {
      int highest = players.get(0).getScore();
      for (int i = 0; i < players.size(); i++) {
         if (highest < players.get(i).getScore()) {
            highest = players.get(i).getScore();
         }
      }
      for (int i = 0; i < players.size(); i++) {
         if (players.get(i).getScore() == highest) {
            return players.get(i);
         }
      }
      return null;
   }

   public int getTeamSize() {
      return players.size();
   }

   public void addMember(Player player) {
      players.add(player);
   }

   public void removeMember(Player player) {
      players.remove(player);
   }

   public boolean equals(Player player) {
      return name.equals(name);
   }

   public String toString() {
      return String.format("\nTeam\nName: %s\nPlayers: %s", name, players);
   }
}