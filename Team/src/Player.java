public class Player
{
   private String name;
   private int score;
   private String email;
   
   public Player(String name, int score, String email) {
      this.name = name;
      this.score = score;
      this.email = email;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public int getScore() {
      return score;
   }
   
   public void increaseScore(int increaseBy) {
      score += increaseBy;
   }
   
   public void decreaseScore(int decreaseBy) {
      score -= decreaseBy;
   }
   
   public boolean equals(Player player) {
      return name.equals(player.name) && score == player.score && email.equals(player.email);
   }
   
   public String toString() {
      return String.format("\nPlayer name: %s\nScore: %s\nEmail: %s", name, score, email);
   }
}