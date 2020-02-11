public abstract class Piece
{
   private String name;

   public Piece(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public abstract String getInfo();
}