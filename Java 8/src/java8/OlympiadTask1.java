package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.collections4.ListUtils;
import org.apache.commons.collections4.iterators.PermutationIterator;

public class OlympiadTask1
{
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();

      System.out.println("The numbers are: " + getNumbersAsList(a, b, c));

      System.out.println(isSumEqualToValue(13, a, b, c));
      in.close();
   }

   private static List<Integer> getNumbersAsList(int a, int b, int c) {
      return (List<Integer>) IntStream.of(a, b, c).boxed().collect(Collectors.toList());
   }

   @SuppressWarnings("unused")
   private static void testIsSum13Recursive( int n, int a, int b, int c) {
      System.out.println("-----Test--1--");
      isSum13Recursive(n, -a, -b, -c);
      System.out.println("-----Test--2--");
      isSum13Recursive(n, -a, -b, c);
      System.out.println("-----Test--3--");
      isSum13Recursive(n, -a, b, c);
      System.out.println("-----Test--4--");
      isSum13Recursive(n, -a, b, -c);
      System.out.println("-----Test--5--");
      isSum13Recursive(n, a, b, -c);
      System.out.println("-----Test--6--");
      isSum13Recursive(n, a, -b, -c);
      System.out.println("-----Test--7--");
      isSum13Recursive(n, a, -b, c);
      System.out.println("-----Test--8--");
      isSum13Recursive(n, a, b, c);
   }

   public static void isSum13Iterative(List<Integer> numbers) {
      int sum = numbers.stream().peek(Math::abs).reduce(0, Integer::sum);
      if (sum == 13) {
         System.out.println("Solved");
         return;
      } else {
         for (int i = 0; i < 3; i++) {
            numbers.set(i, - numbers.get(i));
            for (int j = 0; j < 3; j++) {
               numbers.set(j, - numbers.get(j));
               for (int j2 = 0; j2 < 3; j2++) {
                  numbers.set(j2, - numbers.get(j2));
                  sum = numbers.parallelStream().reduce((a, b) -> a + b).get();
                  if (sum == 13) {
                     System.out.println("Numbers " + numbers.get(0) + " " + numbers.get(1) + " " + numbers.get(2));
                     System.out.println("Solved");
                     return;
                  }
                  System.out.println("Numbers " + numbers.get(0) + " " + numbers.get(1) + " " + numbers.get(2));
               }
            }
         }
         System.out.println("Not Solved");
      }
   }

   public static void isSum13Recursive(int a, int b, int c) {
      isSum13Recursive(2, a, b, c);
   }

   public static void isSum13Recursive(int n, int a, int b, int c) {
      if (n == 1) {
         if (IntStream.of(a, b, c).sum() == 13) {
            System.out.println("Solved");
            System.out.println(IntStream.of(a, b, c).mapToObj(Integer::toString).reduce((e, f) -> e + ", " + f).get());
            return;
         }
      } else {
         isSum13Recursive(n - 1, -a, -b, -c);
         isSum13Recursive(n - 1, -a, -b, c);
         isSum13Recursive(n - 1, -a, b, c);
         isSum13Recursive(n - 1, -a, b, -c);
         isSum13Recursive(n - 1, a, b, -c);
         isSum13Recursive(n - 1, a, -b, -c);
         isSum13Recursive(n - 1, a, -b, c);
         isSum13Recursive(n - 1, a, b, c);

         /*For the recursive method isSumCorrect with n = 3
         isSumCorrect(n-1, a, b, c);
         isSumCorrect(n-1, -a, -b, -c);
         isSumCorrect(n-1, -a, b, c);
         isSumCorrect(n-1, a, -b, c);
         isSumCorrect(n-1, -a, b, -c);*/
      }
   }

   public static boolean isSumEqualToValue(int sum, Integer... nums) {
      PermutationIterator<Integer> prms = new PermutationIterator<>(ListUtils.union(new ArrayList<>(Arrays.asList(nums)), new ArrayList<>(Arrays.asList(nums)).stream().map(e -> e *= -1).collect(Collectors.toList())));
      while (prms.hasNext())
         for (List<Integer> list : ListUtils.partition(prms.next(), nums.length)) {
            if (list.stream().reduce(0, Integer::sum) == sum) {System.out.println("Numbers are: " + list); return true;}}
      return false;
   }
}