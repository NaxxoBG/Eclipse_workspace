// ***************************************************
// File name  : MatrixIntOp.java
// Start date : 
// Programmer : Hans So.
// Java       : Java 1.7 
// Description: 
// ***************************************************

package MatrixIntOpCryptography;

import java.util.Arrays;

public class MatrixIntOp
{
   private MatrixIntOp() { }

   // Addition: A + B
   // Precondition: A and B have the same dimensions (m-by-n)
   public static int[][] add (int[][] A, int[][] B) {
      int m = A.length;
      int n = A[0].length;
      int[][] C = new int[m][n];

      for (int i = 0; i < m; i++)
         for (int j = 0; j < n; j++)
            C[i][j] = A[i][j] + B[i][j];
      return C;
   }

   // Subtraction: A - B
   public static int[][] subtract (int[][] A, int[][] B) {
      int m = A.length;
      int n = A[0].length;
      int[][] C = new int[m][n];

      for (int i = 0; i < m; i++)
         for (int j = 0; j < n; j++)
            C[i][j] = A[i][j] - B[i][j];
      return C;
   }

   // Scalar multiplication: cA
   public static int[][] multiply (int c, int[][] A) {
      int m = A.length;
      int n = A[0].length;
      int[][] C = new int[m][n];

      for (int i = 0; i < m; i++)
         for (int j = 0; j < n; j++)
            C[i][j] = A[i][j] * c;
      return C;
   }

   // Matrix multiplication: AB
   // Precondition: A (m-by-n), B (n-by-p)
   // Postcondition: AB (m-by-p)
   public static int[][] multiply (int[][] A, int[][] B) {
      int m = A.length;
      int n = B[0].length;
      int[][] C = new int[m][n];

      for (int i = 0; i < m; i++) {
         for (int j = 0; j < n; j++) {
            C[i][j] = dotProduct(getRow(i,A),getCol(j,B));
         }
      }
      return C;

      /* Another way of matrix multiplication
      int [][] result = new int[A.length][B[0].length];

      //Loop through each and get product, then sum up and store the value
      for (int i = 0; i < A.length; i++) { 
          for (int j = 0; j < B[0].length; j++) { 
              for (int k = 0; k < A[0].length; k++) { 
                  result[i][j] += A[i][k] * B[k][j];
              }
          }
      }
      return result;
       */
   }

   // Get row number i of matrix A
   public static int[] getRow (int i, int[][] A) {
      return A[i];
   }

   // Get column number j of matrix A
   public static int[] getCol (int j, int[][] A) {
      int[] val = new int[A.length];
      for (int i = 0; i < val.length; i++) {
         val[i] = A[i][j];
      }
      return val;
   }

   // Scalar product or dot product of to vectors a and b
   // Precondition: a and b has the same length
   public static int dotProduct (int[] a, int[] b) {
      int sum = 0;
      for (int i = 0; i < a.length; i++) {
         sum += a[i] * b[i];
      }
      return sum;
   }

   /**
    * asString can be called in this way:
    *   System.out.println (MatrixIntOp.asString(A));
    */
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


   public static void main (String[] args) {
      int[][] A = { { 1, 0, 2},
            {-1, 3, 1}
      };

      int[][] B = { {3, 1},
            {2, 1},
            {1, 0}
      };

      int[][] C = { {3,5,4},
            {-2,6,12}
      };

      System.out.println(MatrixIntOp.asString(A));
      System.out.println(MatrixIntOp.asString(B));
      System.out.println(MatrixIntOp.asString(C));
      System.out.println(MatrixIntOp.asString(add(A,C)));
      System.out.println(Arrays.toString(getCol(1,B)));
      System.out.println();
      System.out.println(MatrixIntOp.asString(subtract(A,C)));
      System.out.println(MatrixIntOp.asString(multiply(B,C)));
   }
}