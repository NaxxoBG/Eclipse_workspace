package ExamTask1;

public class PalindromeTest
{
   public static void main(String[] args) {
      System.out.println("------------------Iterative--palindrome--method-------------");
      char[] test1 = "level".toCharArray();
      System.out.println("Is level a palindrome? -> " + Palindrome.isPalindrome(test1));
      char[] test2 = "deed".toCharArray();
      System.out.println("Is deed a palindrome? -> " + Palindrome.isPalindrome(test2));
      char[] test3 = "fof".toCharArray();
      System.out.println("Is fof a palindrome? -> " + Palindrome.isPalindrome(test3));
      char[] test4 = "bb".toCharArray();
      System.out.println("Is bb a palindrome? -> " + Palindrome.isPalindrome(test4));
      char[] test5 = "i".toCharArray();
      System.out.println("Is i a palindrome? -> " + Palindrome.isPalindrome(test5));
      char[] test7 = "truck".toCharArray();
      System.out.println("Is truck a palindrome? -> " + Palindrome.isPalindrome(test7));
      System.out.println("---------------End--of--iterative--test-----------------------------\n");
      System.out.println("---------------Recursive--palindrome--method--------------------------");
      char[] test8 = "racecar".toCharArray();
      System.out.println("Is racecar a palindrome? -> " + Palindrome.isRecPalindrome(test8, 0, test8.length - 1));
      char[] test9 = "gaag".toCharArray();
      System.out.println("Is gaag a palindrome? -> " + Palindrome.isRecPalindrome(test9, 0, test9.length - 1));
      char[] test10 = "j".toCharArray();
      System.out.println("Is j a palindrome? -> " + Palindrome.isRecPalindrome(test10, 0, test10.length - 1));
      char[] test11 = "panamanap".toCharArray();
      System.out.println("Is panamanap a palindrome? -> " + Palindrome.isRecPalindrome(test11, 0, test11.length - 1));
      char[] test12 = "motorbike".toCharArray();
      System.out.println("Is motorbike a palindrome? -> " + Palindrome.isRecPalindrome(test12, 0, test12.length - 1));
      char[] test13 = "bob".toCharArray();
      System.out.println("Is bob a palindrome? -> " + Palindrome.isRecPalindrome(test13, 0, test13.length - 1));
      char[] test14 = "rab".toCharArray();
      System.out.println("Is rab a palindrome? -> " + Palindrome.isRecPalindrome(test14, 0, test14.length - 1));
      System.out.println("---------------End--of--recursive--test-----------------------------");
   }
}