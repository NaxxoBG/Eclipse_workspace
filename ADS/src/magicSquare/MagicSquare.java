package magicSquare;

import java.util.Arrays;

public class MagicSquare
{
   private int[][] square;
   private int magicSum;
   private int size;
   private int numOfSquares;
   private boolean[] avNums;
   private int solCounter = 0;

   public MagicSquare(int size) {
      this.create(size);
      this.generate(0);
   }

   private void create(int size) {
      this.size = size;
      this.square = new int[size][size];
      this.magicSum = (size * (size * size + 1)) / 2;
      this.numOfSquares = size * size;
      this.avNums = new boolean[numOfSquares + 1]; // from 1 to n^2
   }

   /**Once the state is updated, it recursively calls generate(step+1); 
    * if this method returns true, a solution has been found. Otherwise, 
    * it must undo the state change (both in used and square) before continuing the for loop. 
    * If this loop completes without having found a solution, 
    * the method returns false and backtracks to the previous step.
    * 1-2-5; 1-2-6; 1-2-7.... backtracks 1-2-5; 1-2-6; 1-2-7
    * @param pos
    * @return
    */
   private boolean generate(int pos) {
      if (pos == numOfSquares) { 
         return isValid(); 
      }

      for (int val = 1; val <= numOfSquares; val++) {
         if (avNums[val]) { 
            continue; 
         }

         avNums[val] = true;
         placeVal(pos, val);

         if (checkRowsAndCols(pos) && generate(pos + 1)) {
            return true;
         }

         undo(pos, val);
      }

      return false; //after for loop finishes execution, backtracks and changes previous number to try another set
   }

   private void undo(int pos, int val) {
      placeVal(pos, 0);
      avNums[val] = false;
   }

   private void placeVal(int step, int val) {
      square[step / square.length][step % square.length] = val;
   }

   public boolean isValid() {
      int sumDiag1 = 0;
      int sumDiag2 = 0;

      for (int j = square[0].length - 1, i = 0; j >= 0 && i < square.length; j--, i++) {
         sumDiag1 += square[i][i];
         sumDiag2 += square[j][i];
      }

      return (sumDiag1 == magicSum && sumDiag2 == magicSum);
   }

   public void printSols() {
      Arrays.fill(avNums, false);
      this.printSols(0);
      System.out.println("Number of solutions " + this.solCounter);
      this.solCounter = 0;
   }

   private void printSols(int pos) {
      if (pos == numOfSquares) { 
         if (isValid()) { 
            print(); 
            solCounter++; 
         }
         return;
      }

      for (int val = 1; val <= numOfSquares; val++) {
         if (avNums[val]) {
            continue; 
         }

         avNums[val] = true;
         placeVal(pos, val);

         if (checkRowsAndCols(pos)) {
            printSols(pos + 1);
         }

         undo(pos, val);
      }
   }

   private boolean checkRowsAndCols(int step) {
      int rowEnd, colEnd;
      for (int i = 0; i < size; i++) {
         rowEnd = (i + 1) * size - 1;
         if (step == rowEnd) { //are we ready to check the row
            int sum = 0;
            for (int j = 0; j < size; j++) {
               sum += square[i][j];
            }
            return sum == magicSum;
         }
      }

      for (int i = 0; i < size; i++) {
         colEnd = size * (size - 1) + i;
         if (step == colEnd) { // are we ready to check the column
            int sum = 0;
            for (int j = 0; j < size; j++) {
               sum += square[j][i];
            }
            return (sum == magicSum);
         }
      }
      return true;
   }

   private void print() {
      System.out.println();
      System.out.println("Magic sum: " + this.magicSum);
      System.out.println("Magic square of size: " + this.size + "x" + this.size);
      System.out.println();
      for (int i = 0; i < size; i++) {
         for (int j = 0; j < size; j++) {
            alignNum(i, j);
         }
         System.out.println();
      }
   }

   public void printSolution() {
      this.generate(0);
      System.out.println();
      System.out.println("Magic sum: " + this.magicSum);
      System.out.println("Magic square of size: " + this.size + "x" + this.size);
      System.out.println();
      for (int i = 0; i < size; i++) {
         for (int j = 0; j < size; j++) {
            alignNum(i, j);
         }
         System.out.println();
      }
   }

   private void alignNum(int row, int col) {
      if (square[row][col] < 10) {
         System.out.print(" ");
      }
      if (square[row][col] < 100){
         System.out.print(" ");
      }
      System.out.print(square[row][col] + "   ");
   }

   public int[][] getSquare() {
      return square;
   }

   public int getMagicSum() {
      System.out.println("Magic sum " + this.magicSum);
      return magicSum;
   }
}