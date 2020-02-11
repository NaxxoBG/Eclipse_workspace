package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_12
{
   public static void main(String[] args) {
      char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z'};
      Scanner in = new Scanner(System.in);
      char[] wordArr = in.nextLine().toCharArray();
      int[] indexOfChars = new int[wordArr.length];

      for (int i = 0; i < wordArr.length; i++) {
         for (int j = 0; j < alphabet.length; j++) {
            if (wordArr[i] == alphabet[j]) {
               indexOfChars[i] = ++j;
            }
         }
      }
      System.out.println(Arrays.toString(indexOfChars));
      in.close();
   }
}