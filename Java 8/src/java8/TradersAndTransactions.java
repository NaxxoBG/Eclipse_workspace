package java8;

import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class TradersAndTransactions
{
   public static void main(String[] args) {
      Trader raoul = new Trader("Raoul", "Cambridge");
      Trader mario = new Trader("Mario", "Milan");
      Trader alan = new Trader("Alan", "Cambridge");
      Trader brian = new Trader("Brian", "Cambridge");

      List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
            );

      System.out.println("All transactions in 2011 sorted by value from small to high");
      transactions.stream().filter(t->t.getYear()==2011).sorted(comparing(Transaction::getValue)).forEach(System.out::println);

      System.out.println();

      System.out.println("All unique cities where the traders work");
      transactions.stream().map(c -> c.getTrader().getCity()).distinct().forEach(System.out::println);

      System.out.println();

      System.out.println("All traders from Cambridge sorted by name");
      transactions.stream()
      .map(t -> t.getTrader())
      .filter(t -> t.getCity().equals("Cambridge"))
      .map(Trader::getName)
      .distinct()
      .sorted()
      .forEach(System.out::println);

      System.out.println();

      System.out.println("String of all traders' names sorted alphabetically");
      Optional<String> sortedNames = transactions.stream().map(t -> t.getTrader().getName()).sorted().distinct().reduce((a, b) -> (a + ", " + b));
      sortedNames.ifPresent(System.out::println);

      System.out.println();

      System.out.println("Are there any traders based in Milan");
      System.out.println(transactions.stream().anyMatch(e -> e.getTrader().getCity().equals("Milan")));

      System.out.println();

      System.out.println("All transactions' values from the traders living in Cambridge");
      transactions.stream()
      .filter(t -> t.getTrader().getCity().equals("Cambridge"))
      .map(Transaction::getValue)
      .forEach(System.out::println);

      System.out.println();

      System.out.println("Highest value from all transactions");
      System.out.println(transactions.stream().mapToInt(Transaction::getValue).max().orElse(0));
      System.out.println(transactions.stream().map(Transaction::getValue).reduce(Integer::max).orElse(0));

      System.out.println();

      System.out.println("Transaction with the smallest value");
      OptionalInt min = transactions.stream().mapToInt(Transaction::getValue).min();
      System.out.println(min.orElse(0));
      System.out.println(transactions.stream().min(comparing(Transaction::getValue)));
   }
}