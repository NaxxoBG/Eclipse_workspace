// ***************************************************
// File name  : Cryptography.java
// Start date : 
// Programmer : Hans So.
// Java       : Java 1.7
// Description: Application to Cryptography
//              http://aix1.uottawa.ca/~jkhoury/cryptography.htm
// ***************************************************

package MatrixIntOpCryptography;

import java.util.Arrays;

@SuppressWarnings("unused")
public final class Cryptography
{
   private static final String[] LETTERS = {"", "A", "B", "C", "D", "E", "F",  "G", "H", "I", "J", "K", "L", "M", "N", 
      "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

   private Cryptography() { }

   public static int[] stringToArray(String message) {
      String[] splitMessage = message.split("");
      int[] arrReturn = new int[splitMessage.length];

      for (int i = 0; i < splitMessage.length; i++) {
         for (int j = 0; j < LETTERS.length; j++) {
            if (splitMessage[i].equalsIgnoreCase(LETTERS[j])) {
               arrReturn[i] = j;
            }
         }
      }
      return arrReturn;
   }

   // size means number of rows im matrix
   public static int[][] arrayToUncodedMatrix (int[] arr, int size) {
      int rows = size;
      int cols = (int)Math.ceil(arr.length/(double)size);

      int[][] A = new int[rows][cols];

      for (int i = 0; i < cols; i++) {
         for (int j = 0; j < rows; j++) {
            try {
               A[j][i] = arr[i * rows + j]; 
            }
            catch (Exception e) {
               A[j][i] = 0;
            }
         }
      }
      return A;
   }

   public static int[][] encodeMatrix (int[][] encodingMatrix, int[][] uncodedMatrix) {
      int[][] encodedMatrix = MatrixIntOp.multiply(encodingMatrix, uncodedMatrix);
      return encodedMatrix;
   }

   public static int[][] decodeMatrix (int[][] decodingMatrix, int[][] codedMatrix) {
      int[][] decodedMatrix = MatrixIntOp.multiply(decodingMatrix, codedMatrix);
      return decodedMatrix;
   }

   public static int[] matrixToArray (int[][] matrix) {
      int[] array = new int[matrix.length * matrix[0].length];
      int index = 0;

      for (int i = 0; i < matrix[0].length; i++) {
         for (int j = 0; j < matrix.length; j++) {
            array[index++] = matrix[j][i];
         }
      }
      return array;
   }

   public static String numsToString (int[] arr) {
      String string = "\n[";
      for (int i = 0; i < arr.length-1; i++) {
         string += arr[i] + ", ";
      }
      string += arr[arr.length-1]+"]";
      return string;
   }

   public static String arrayToString(int[] arr) {
      String str = "\n";
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == 0) {
            str += " ";
         } else {
            str += LETTERS[arr[i]] + "";
         }
      }
      return str;
   }

   public static void main (String[] args) {
      int[][] A = {{ -3, -3, -4},
            {  0,  1,  1},
            {  4,  3,  4}
      };

      int[][] inverseA = {{  1,  0,  1},
            {  4,  4,  3},
            { -4, -3, -3}
      };

      int[][] B = {{ 3, 5},
            { 1, 2}
      };

      int[][] inverseB = {{  2, -5},
            { -1,  3}
      };

      // Show that A and inverseA really are inverse to each other.
      // The same for B and inverseB.

      // Use both A and B as examples of encoding matrices

      // Some messages:
      String message1 = "AABBCCC";
      String message2 = "Help me";
      String message3 = "PREPARE TO NEGOTIATE";

      System.out.println("Is inverseA really inverse to A?");
      int[][] C = MatrixIntOp.multiply(A,inverseA);      
      System.out.println(MatrixIntOp.asString(C));        
      System.out.println();

      System.out.println("Is inverseB really inverse to B?");
      int[][] D = MatrixIntOp.multiply(B,inverseB);
      System.out.println(MatrixIntOp.asString(D));
      System.out.println();

      System.out.println("------------------------------------TEST--1----------------------------------");
      int[] arr = stringToArray(message1);
      System.out.println(message1);
      System.out.println(numsToString(arr));
      System.out.println();
      int[][] unencoded = arrayToUncodedMatrix(arr,2);
      System.out.println(MatrixIntOp.asString(unencoded));
      int[][] encoded = encodeMatrix(B, unencoded); //encoding with matrix B
      int[][] decoded = decodeMatrix(inverseB, encoded);
      System.out.println(MatrixIntOp.asString(encoded));
      System.out.println(MatrixIntOp.asString(decoded));
      int[] decodedArr = matrixToArray(decoded);
      System.out.println(Arrays.toString(decodedArr));
      System.out.println(arrayToString(decodedArr));
      System.out.println("-------------------------------END--OF--TEST--1------------------------------");
      System.out.println();
      System.out.println("------------------------------------TEST--2----------------------------------");
      int[] arr2 = stringToArray(message3);
      System.out.println(message3);
      System.out.println(numsToString(arr2));
      System.out.println();
      int[][] unencoded2 = arrayToUncodedMatrix(arr2,3);
      System.out.println(MatrixIntOp.asString(unencoded2));
      int[][] encoded2 = encodeMatrix(A, unencoded2); //encoding with matrix B
      int[][] decoded2 = decodeMatrix(inverseA, encoded2);
      System.out.println(MatrixIntOp.asString(encoded2));
      System.out.println(MatrixIntOp.asString(decoded2));
      int[] decodedArr2 = matrixToArray(decoded2);
      System.out.println(Arrays.toString(decodedArr2));
      System.out.println(arrayToString(decodedArr2));
      System.out.println("-------------------------------END--OF--TEST--2------------------------------");
   }
}