package Chapter_7;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise_10
{
   public static String randomMatrixAsString (int rowCount, int colCount) {
      int[][] matrix = new int[rowCount][colCount];
      StringBuffer buf = new StringBuffer();

      for (int i = 0; i < rowCount; i++) {
         for (int j = 0; j < colCount; j++) {
            matrix[i][j] = ThreadLocalRandom.current().nextInt(0, 101);
            buf.append(matrix[i][j]);
            buf.append('\t');
         }
         buf.append('\n');
      }
      return buf.toString();
   }

   public static void main(String[] args) {
      System.out.println(randomMatrixAsString(4, 4));
   }
}