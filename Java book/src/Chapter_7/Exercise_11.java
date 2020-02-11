package Chapter_7;

import java.util.Scanner;

public class Exercise_11
{
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.println("Enter the number of rows for the matrix");
      int rows = in.nextInt();
      System.out.println("Enter the number of cols for the matrix");
      int cols = in.nextInt();
      int[][] matrix = new int[rows][cols];
      StringBuffer buf = new StringBuffer();
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            matrix[i][j] = in.nextInt();
            buf.append(matrix[i][j]);
            buf.append("\t");
         }
         buf.append("\n");
      }
      System.out.println(buf.toString());
      in.close();

      int bestSum = Integer.MIN_VALUE;
      int bestRow = 0;
      int bestCol = 0;
      for (int row = 0; row < matrix.length - 2; row++) {
         for (int col = 0; col < matrix[0].length - 2; col++) {
            int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                  + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
            + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
            if (sum > bestSum) {
               bestSum = sum;
               bestRow = row;
               bestCol = col;
            }
         }
      }
      // Print the result
      System.out.println("The best platform is:");
      System.out.printf(" %d %d %d%n",
            matrix[bestRow][bestCol],
            matrix[bestRow][bestCol + 1],
            matrix[bestRow][bestCol + 2]);
      System.out.printf(" %d %d %d%n",
            matrix[bestRow + 1][bestCol],
            matrix[bestRow + 1][bestCol + 1],
            matrix[bestRow + 1][bestCol + 2]);
      System.out.printf(" %d %d %d%n",
            matrix[bestRow + 2][bestCol],
            matrix[bestRow + 2][bestCol + 1],
            matrix[bestRow + 2][bestCol + 2]);
      System.out.printf("The maximal sum is: %d%n", bestSum);
   }
}