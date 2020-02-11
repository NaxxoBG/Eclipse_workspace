import java.util.ArrayList;


public class Team_Test
{

   public static void main(String[] args)
   {
      Player player1 = new Player("Jack", 30, "abv");
      Player player2 = new Player("Dave", 50, "gmail");
      Player player3 = new Player("John", 70, "yahoo");
      Player player4 = new Player("Jill", 90, "mail");
      Player player5 = new Player("Trevor", 110, "mail");

      ArrayList<Player> players = new ArrayList<>();
      players.add(player1);
      players.add(player2);
      players.add(player3);

      Team team1 = new Team("Good", players);

      System.out.println(team1);

      System.out.println(team1.getTotalScore());
      System.out.println(team1.getLeadingPlayer());
      System.out.println(team1.getTeamSize());
      team1.removeMember(player4);
      System.out.println(team1);
      team1.addMember(player4);
      team1.addMember(player5);
      System.out.println(team1);
      team1.removeMember(player3);
      System.out.println(team1);
      System.out.println(team1.getTeamSize());
   }
}