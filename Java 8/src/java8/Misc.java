package java8;

import java.awt.Button;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.util.stream.Collectors.toList;


public class Misc
{
   public static String decToHex(int dec) {
      String hex = "";
      for (; dec > 0; dec /= 16)
         hex = "0123456789ABCDEF".charAt(dec % 16) + hex;
      return hex;
   }

   public static void main(String[] args) {
      // Threads with lambda
      Thread thread = new Thread(() -> System.out.println("Hello World"));
      thread.start();

      // Gui behaviour
      Button button = new Button("Ok");
      button.addActionListener((event) -> System.out.println("Hello World"));

      // Avoids boxing and operates in primitive instead (Predicate<Integer>
      // will box).
      IntPredicate pr = i -> i < 10;
      pr.test(10);

      System.out.println();
      System.out.println("A stream of even numbers");
      IntStream even = IntStream.rangeClosed(1, 100).filter(e -> e % 2 == 0);
      System.out.println(even.count());

      int[] numbers = {1, 25, 52, 63, 10, 6};
      int sum = Arrays.stream(numbers).sum();
      System.out.println(sum);

      System.out.println("Getting unique words from a file");
      long uniqueWords = 0;

      try (Stream<String> lines = Files.lines(Paths.get("C:/Users/Naxxo/Desktop/data.txt"), Charset.defaultCharset())) {
         uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" "))).distinct().count();
      }
      catch (Exception e2) {
         System.out.println(e2);
      }
      System.out.println(uniqueWords);

      System.out.println();
      System.out.println("Even numbers");
      Stream.iterate(0,  n -> n + 2).limit(10).forEach(System.out::println);

      System.out.println();
      System.out.println("Fibonacci");
      Stream.iterate(new long[] {0, 1}, e -> new long[] {e[1], e[0] + e[1]}).limit(15)
      //      .forEach(t->System.out.printf("(%d, %d)", t[0], t[1]));
      //      .forEach(t->System.out.print(Arrays.stream(t).sum() + ", "));
      .map(t -> t[0]).forEach(e-> System.out.print(e + ", "));

      System.out.println();
      System.out.println();
      System.out.println("Generate random values");
      Stream.generate(Math::random).limit(20).forEach(out::println);

      System.out.println("Generate Fibonacci numbers using generate()");
      IntSupplier fib = new IntSupplier() {
         private int previous = 0;
         private int current = 1;

         @Override
         public int getAsInt() {
            int oldPrevious = this.previous;
            int nextValue = this.previous + this.current;
            this.previous = this.current;
            this.current = nextValue;
            return oldPrevious;
         }
      };

      IntStream.generate(fib).limit(10).forEach(out::println);

      List<String> words = Arrays.asList("Hello", "World");
      List<String> uniqueChars = words.stream()
            .map(w -> w.split(""))
            .flatMap(Arrays::stream)
            .distinct()
            .collect(toList());
      System.out.println(uniqueChars);

      List<Integer> rNumbers = Arrays.asList(1, 2, 3, 4, 5);
      List<Integer> squaredNums = rNumbers.stream()
            .map(e -> e * e)
            .collect(toList());
      System.out.println(squaredNums);

      List<Integer> numbers1 = Arrays.asList(1, 2, 3);
      List<Integer> numbers2 = Arrays.asList(3, 4);

      List<int[]> pairs = numbers1.stream()
            .flatMap((Integer i) -> numbers2.stream().map((Integer j) -> new int[] {i, j}))
            .collect(toList());
      pairs.parallelStream().map(Arrays::toString).forEach(System.out::println);
   }
}