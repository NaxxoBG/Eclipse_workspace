package Task2June2011;

import java.util.Arrays;

public class MatrixZeroes
{
   public static int getNumberOfNonZeros(int[][] matrix) {
      int rows = matrix.length; //number of rows, horizontal lines
      int columns = matrix[0].length; // number of columns, vertical lines
      int counter = 0;
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            if (matrix[i][j] != 0) {
               counter++;
            }
         }
      }
      return counter;
   }

   public static int[] getArrayRepr(int[][] matrix) {
      int rows = matrix.length; //number of rows, horizontal lines
      int columns = matrix[0].length; // number of columns, vertical lines
      int[] array = new int[getNumberOfNonZeros(matrix)];
      int index = 0;

      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            if (matrix[i][j] != 0) {
               array[index] = matrix[i][j];
               index++;
            }
         }
      }
      return array;
   }

   public static int[][] getMatrixFromArr(int[] array, int size) {
      int rows = size;
      int cols = (int) Math.ceil(array.length / (double) size);
      int[][] matrix = new int[rows][cols];

      for (int i = 0; i < cols; i++) {
         for (int j = 0; j < rows; j++) {
            try {
               matrix[j][i] = array[i * rows + j]; 
            }
            catch (Exception e) {
               matrix[j][i] = 0;
            }
         }
      }
      return matrix;

   }

   public static String asString (int[][] A) {
      int m = A.length;
      int n = A[0].length;

      StringBuffer buf = new StringBuffer ();

      for (int i = 0; i < m; i++)
      {
         for (int j = 0; j < n; j++)
         {
            buf.append(A[i][j]);
            buf.append('\t');
         }
         buf.append('\n');
      }

      return buf.toString();
   }

   public static void main(String[] args) {
      int[][] A = { { 0, 6, 2},
            {-1, 0, 1}};

      System.out.println(getNumberOfNonZeros(A));
      System.out.println(Arrays.toString(getArrayRepr(A)));
      int[][] result = getMatrixFromArr(getArrayRepr(A), 2);
      System.out.println(asString(result));
   }
}