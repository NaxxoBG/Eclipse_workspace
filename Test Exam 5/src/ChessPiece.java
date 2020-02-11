public class ChessPiece extends Piece
{
   private boolean isWhite;

   public ChessPiece(String name, boolean isWhite) {
      super(name);
      this.isWhite = isWhite;
   }

   public String getInfo() {
      return super.getName() + isWhite;
   }
}
