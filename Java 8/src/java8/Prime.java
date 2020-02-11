package java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prime
{

   public static boolean isPrime(int num) {
      int candidateRoot = (int) Math.sqrt((double) num);
      return IntStream.rangeClosed(2, candidateRoot).noneMatch(i -> num % i == 0);
   }

   public static Map<Boolean, List<Integer>> partitionPrimes(int n) {
      return IntStream.rangeClosed(2, n).boxed().collect(Collectors.partitioningBy(num -> isPrime(num)));
   }

   public static Map<Boolean, List<Integer>> partitionPrimesWithCustomCollector(int n) {
      return IntStream.rangeClosed(2, n).boxed().collect(new PrimeNumbersCollector());
   }
   
   public static void main(String[] args) {
      System.out.println(partitionPrimesWithCustomCollector(1000));
      System.out.println(partitionPrimes(1000));
   }
}