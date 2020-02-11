package Task2June2015;

import java.util.Arrays;

public class MatrixSearch
{
   public static int[] linearSearch(int[][] matrix, int key) {
      int rows = matrix.length;
      int columns = matrix[0].length;
      int[] position = new int[2];

      /*loop:*/
      for (int i = 0; i < rows; i++) {
         Arrays.sort(matrix[i]);
         for (int j = 0; j < columns; j++) {
            if (matrix[i][j] == key) {
               position[0] = i;
               position[1] = j;
               return position;
               /*break loop;*/
            }
         }
      }
      return null;
   }

   public static int[] binarySearch(int[][] matrix, int key) {
      int[] position = new int[2];

      for (int i = 0; i < matrix.length; i++) {
         Arrays.sort(matrix[i]);
         int result = Arrays.binarySearch(matrix[i], key);
         if (result >= 0) {
            position[0] = i;
            position[1] = result;
            return position;
         }
      }
      return null;
   }

   public static int[] binarySearchTreePattern(int[][] matrix, int key) {
      int rows = matrix.length;
      int cols = matrix[0].length;

      for (int i = 0; i < rows; i++) {
         Arrays.sort(matrix[i]);
      }

      int[] leftmost = {matrix.length - 1, 0};
      int[] position = new int[2];
      int row = leftmost[0];
      int col = 0;
      while (row >= 0 && col < cols ) {
         if (matrix[row][col] == key) {
            position[0] = row;
            position[1] = col;
            return position;
         } else if (key < matrix[row][col]) {
            row--;
         } else {
            col++;
         }
      }
      return position;

   }

   public static void main(String[] args) {
      int[][] testMatrix = {
            {8, 13, 6},
            {21, 14, 19},
            {23, 15, 22}};

      System.out.println(Arrays.toString(linearSearch(testMatrix, 14)));
      System.out.println(Arrays.toString(binarySearch(testMatrix, 14)));
      System.out.println(Arrays.toString(binarySearchTreePattern(testMatrix, 14)));
   }
}
