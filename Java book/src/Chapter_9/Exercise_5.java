package Chapter_9;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class Exercise_5
{
   private static void printMessage(String message, Integer pos, Integer[] numbers) {
      Optional<Integer[]> opt = Optional.ofNullable(numbers);
      switch (message) {
         case "s":
            System.out.println(String.format("The element at position %d is smaller than the surrounding elements", pos));
            if (opt.isPresent()) {
               System.out.println("The part of the array with those numbers: " + Arrays.toString(Arrays.copyOfRange(opt.get(), pos - 1, pos + 2)));
            }
            break;
         case "b":
            System.out.println(String.format("The element at position %d is bigger/equal to the surrounding elements", pos));
            if (opt.isPresent()) {
               System.out.println("The part of the array with those numbers: " + Arrays.toString(Arrays.copyOfRange(opt.get(), pos - 1, pos + 2)));
            }
            break;
         case "bl":
            System.out.println(String.format("The element at position %d (%d) is smaller than the left element and greater/equal to the right element", pos, numbers[pos]));
            System.out.println("The part of the array with those numbers: " + Arrays.toString(Arrays.copyOfRange(numbers, pos - 1, pos + 2)));
            break;
         case "br":
            System.out.println(String.format("The element at position %d (%d) is smaller than the right element and greater/equal to the left element", pos, numbers[pos]));
            System.out.println("The part of the array with those numbers: " + Arrays.toString(Arrays.copyOfRange(numbers, pos - 1, pos + 2)));
            break;
         case "e":
            System.out.println(String.format("The element at position %d (%d) is equal to the right and left element", pos, numbers[pos]));
            System.out.println("The part of the array with those numbers: " + Arrays.toString(Arrays.copyOfRange(numbers, pos - 1, pos + 2)));
            break;
         default:
            break;
      }
   }

   private static void defineElementFromNeighbors(Integer pos, Integer... numbers) {
      if (pos < 0 || pos >= numbers.length) {
         System.out.println("The position is invalid");
      } else if (pos == 0) {
         if (numbers[pos] < numbers[pos + 1]) {
            printMessage("s", pos, null);
         } else {
            printMessage("b", pos, null);
         }
      } else if (pos == numbers.length - 1) {
         if (numbers[pos] < numbers[pos - 1]) {
            printMessage("s", pos, null);
         } else {
            printMessage("b", pos, null);
         }
      } else {
         BiPredicate<Integer, Integer[]> bigger = (p, n) -> (n[p - 1] > n[p] && n[p + 1] > n[p]); // el. on both sides are bigger
         BiPredicate<Integer, Integer[]> smaller = (p, n) -> (n[p - 1] < n[p] && n[p + 1] < n[p]); // el. on both sides are smaller
         BiPredicate<Integer, Integer[]> biggerOnTheLeft = (p, n) -> (n[p - 1] > n[p] && n[p + 1] <= n[p]); //el on the left is bigger
         BiPredicate<Integer, Integer[]> equal = (p, n) -> (n[p - 1] == n[p] && n[p + 1] == n[p]); // equal to both elements
         int isBigger = bigger.test(pos, numbers) ? 1 : (biggerOnTheLeft.test(pos, numbers) ? 2 : (equal.test(pos, numbers)) ? 3 : smaller.test(pos, numbers) ? 5 : 4);

         if (isBigger == 1) {
            printMessage("s", pos, numbers);
         } else if (isBigger == 2){
            printMessage("bl", pos, numbers);
         } else if (isBigger == 3) {
            printMessage("e", pos, numbers);
         } else if (isBigger == 4) {
            printMessage("br", pos, numbers);
         } else if (isBigger == 5) {
            printMessage("b", pos, numbers);
         }
      }
   }

   public static void main(String[] args) {
      Integer[] numbers = new Integer[] {2, 2, 2, 4, 5, 6, 5, 7, 8, 6, 9};
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = in.nextInt();

      defineElementFromNeighbors(num, numbers);

      System.out.println(Arrays.toString(numbers));
      in.close();
   }
}