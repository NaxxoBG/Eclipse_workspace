package sudoku;

public class Sudoku
{
   private int[][] board;
   private static final int SIZE = 9;

   public Sudoku(int[][] sudokuToSolve) {
      this.board = sudokuToSolve;
   }

   public int[][] getSudoku() {
      return board;
   }

   public void solve() {
      this.solve(0, 0);
   }

   private boolean solve(int row, int column) {
      if (column >= Sudoku.SIZE) {
         column = 0;
         row++;
         if (row >= Sudoku.SIZE) {
            return true;
         }
      }
      if (board[row][column] != 0) {
         return solve(row, column + 1);
      } else {
         for (int i = 1; i <= Sudoku.SIZE; i++) {
            if (isValid(row, column, i)) {
               board[row][column] = i;
               if (solve(row, column + 1)) {
                  return true;
               } else {
                  board[row][column] = 0;
               }
            }
         }
         return false;
      }
   }

   private boolean isValid(int row, int col, int num) {
      int cellRow = (row / 3) * 3;
      int cellCol = (col / 3) * 3;

      for (int i = 0; i < board.length; i++) {
         if (board[row][i] == num || board[i][col] == num) {
            return false;
         }
      }

      for (int i = cellRow; i <= cellRow + 2; i++) {
         for (int j = cellCol; j < cellCol + 2; j++) {
            if (board[i][j] == num) {
               return false;
            }
         }
      }
      return true;
   }

   public void print() {
      System.out.println();
      for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board[0].length; j++) {
            if (j == 2 || j == 5) {
               System.out.print(board[i][j] + " | ");
            } else {
               System.out.print(board[i][j] + " ");
            }
         }
         if (i == 2 || i == 5) {
            System.out.println("\n---------------------");
         } else {
            System.out.println();
         }
      }
      System.out.println();
   }

   public void printUnsolvedAndSolved() {
      System.out.println("Before solution: ");
      print();
      this.solve();
      System.out.println("After solution: ");
      print();
   }
}