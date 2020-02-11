import java.util.Scanner;

public class ChoHan
{
   public static void main(String[] args)
   {
      final int MAX_ROUNDS = 5;
      String player1Name;
      String player2Name;

      Scanner input =new Scanner(System.in);

      System.out.println("Enter the name of Player 1:");
      player1Name = input.nextLine();

      System.out.println("Enter the name of Player 2:");
      player2Name = input.nextLine();

      Dealer dealer =  new Dealer();

      Player player1 = new Player(player1Name);
      Player player2 = new Player(player2Name);

      for (int i = 0; i < MAX_ROUNDS; i++)
      {
         System.out.println("------------------");
         System.out.println(String.format("Now playing round %s\n", i + 1));
         dealer.rollDice();

         player1.makeGuess();
         player2.makeGuess();

         roundResults(dealer, player1, player2);

         displayGrandWinner(player1, player2);
      }
      input.close();
   }
   public static void roundResults(Dealer dealer, Player player1, Player player2) {
      System.out.printf("The dealer rolled %d and %d.\n", dealer.getDie1Value(), dealer.getDie2Value());
      System.out.printf("Result: %s\n", dealer.getChoOrHan());

      checkGuess(player1, dealer);
      checkGuess(player2, dealer);
   }

   public static void checkGuess(Player player, Dealer dealer) {
      final int POINTS_TO_ADD = 1;
      String guess = player.getGuess();
      String ChoHanResult = dealer.getChoOrHan();

      System.out.printf("The player %s guessed %s.\n", player.getName(), player.getGuess());

      if (guess.equalsIgnoreCase(ChoHanResult)) {
         player.addPoints(POINTS_TO_ADD);
         System.out.printf("Awarding %d point(s) to %s.\n", POINTS_TO_ADD, player.getName());
      }
   }

   public static void displayGrandWinner(Player player1, Player player2) {
      System.out.println("------------------");
      System.out.println("Game over. Here are the results:");
      System.out.printf("%s: %d points.\n", player1.getName(), player1.getPoints());
      System.out.printf("%s: %d points.\n", player2.getName(), player2.getPoints());

      if (player1.getPoints() > player2.getPoints()) {
         System.out.println(player1.getName() + " is the grand winner!");
      } else if (player2.getPoints() > player1.getPoints()) {
         System.out.println(player2.getName() + " is the grand winner!");
      } else {
         System.out.println("Both players are tied!");
      }
   }
}