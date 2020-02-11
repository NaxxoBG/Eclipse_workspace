public class TicTacToePiece extends Piece
{
   private boolean isX;

   public TicTacToePiece(String name, boolean isX) {
      super(name);
      this.isX = isX;
   }

   public String getInfo() {
      return super.toString() + isX;
   }
}