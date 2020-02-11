public class Field
{
   private Piece piece;

   public Field() {
      this.piece = null;
   }

   public Field(Piece piece) {
      this.piece = piece;
   }

   public void setPiece(Piece piece) {
      this.piece = piece;
   }

   public void removePiece() {
      piece = null;
   }

   public Piece getPiece() {
      return piece;
   }

   public String toString() {
      return "Field []";
   }
}