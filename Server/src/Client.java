public class Client
{
   private String name;
   private int score;

   public Client(String name) {
      this.name = name;
      this.score = 0;
   }

   public String getName() {
      return name;
   }

   public void changeName(String name) {
      this.name = name;
   }

   public int getScore() {
      return score;
   }

   public void increaseScore(int amount) {
      score += amount;
   }

   public boolean equals(Object obj) {
      if (!(obj instanceof Client)) {
         return false;
      } else {
         Client other = (Client) obj;
         return name == other.name && score == other.score;
      }
   }

   public Client copy() {
      return new Client(name);
   }

   public String toString() {
      return String.format("\n-----Client-----\n Name: %s\n Score: %s", name, score);
   }
}