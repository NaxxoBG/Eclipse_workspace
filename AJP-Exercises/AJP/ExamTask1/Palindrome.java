package ExamTask1;

public class Palindrome
{
   /**Checks iteratively whether an array of chars is a palindrome.
    * @param A
    */
   public static boolean isPalindrome(char[] A) {
      int left = 0;
      int right = A.length - 1;
      while (left < right) {
         if (!(A[left] == A[right])) {
            return false;
         }
         left++;
         right--;
      }
      return true;
   }

   /**Checks recursively whether an array of chars is a palindrome.
    * @param A
    * @param left
    * @param right
    * @author Naxxo
    */
   public static boolean isRecPalindrome(char[] A, int left, int right) {
      if (left >= right) {
         return true;
      }
      if (A[left] != A[right]) {
         return false;
      }
      return isRecPalindrome(A, ++left,--right);
   }
}