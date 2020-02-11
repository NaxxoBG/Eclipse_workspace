public class Board
{
   private Field[][] fields;

   public Board(int rows, int cols) {
      fields = new Field[rows][cols];
   }

   public void setPiece(int row, int col, Piece piece) {
      fields[row][col].setPiece(piece);
   }

   public void removePiece(int row, int col) {
      fields[row][col].removePiece();

   }

   public void movePiece(int fromRow, int fromCol, int toRow, int toCol) {
      if (fields[toRow][toCol] != null) {
         return;
      } else {
         fields[toRow][toCol] = fields[fromRow][fromCol];
         fields[fromRow][toCol].removePiece();
      }
   }

   public Piece show(int row, int col) {
      return fields[row][col].getPiece();

   }

   public boolean isEmpty(int row, int col) {

      return fields[row][col] == null;
   }

   public String toString() {
      String out = "";
      for (int i = 0; i < fields.length; i++) {
         for (int j = 0; j < fields[0].length; j++) {
            out += fields[i][j];
            if (j == fields[0].length - 1) {
               out += "\n";
            }
         }
      }
      return out;
   }
}