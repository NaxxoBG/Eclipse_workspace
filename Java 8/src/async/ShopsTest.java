package async;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShopsTest
{
   private static List<Shop> shops = Arrays.asList(new Shop("BestPrice"),
         new Shop("LetsSaveBig"), new Shop("MyFavouriteShop"), new Shop(
               "BuyItAll"));

   private final static Executor executor = Executors.newFixedThreadPool(
         Math.min(shops.size(), 100), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
               Thread t = new Thread(r);
               t.setDaemon(true);
               return t;
            }
         });

   public static List<String> findPrices(String product, List<Shop> shops) {
      List<CompletableFuture<String>> priceFutures = shops
            .stream()
            .map(shop -> CompletableFuture.supplyAsync(
                  () -> String.format("%s price is %s", shop.getName(),
                        shop.getPrice(product)), executor))
                        .collect(Collectors.toList());

      return priceFutures.stream().map(CompletableFuture::join)
            .collect(Collectors.toList());
   }

   public static List<Object> findPrices(String product) {
      List<CompletableFuture<Object>> priceFutures = shops.stream()
            .map(shop -> CompletableFuture.supplyAsync(() -> shop.getPrice(product), executor))
            .map(future -> future.thenApply(Quote::parse))
            .map(future -> future.thenCompose(quote -> CompletableFuture.supplyAsync(() -> Discount.applyDiscount(quote), executor)))
            .collect(Collectors.toList());
      return priceFutures.stream().map(CompletableFuture::join)
            .collect(Collectors.toList());
   }

   public static Stream<CompletableFuture<String>> findPricesStream(String product) {
      return shops.stream()
            .map(shop -> CompletableFuture.supplyAsync(
                  () -> shop.getPrice(product), executor))
                  .map(future -> future.thenApply(Quote::parse))
                  .map(future -> future.thenCompose(quote ->
                  CompletableFuture.supplyAsync(
                        () -> Discount.applyDiscount(quote), executor)));
   }

   //combine two completablefutures
   //   Future<Double> futurePriceInUSD =
   //         CompletableFuture.supplyAsync(() -> shop.getPrice(product))
   //         .thenCombine(
   //         CompletableFuture.supplyAsync(
   //         () -> exchangeService.getRate(Money.EUR, Money.USD)),
   //         (price, rate) -> price * rate
   //         ));

   @SuppressWarnings("rawtypes")
   public static void main(String[] args) {
      System.out.println(findPrices("Chips", shops));
      System.out.println(findPrices("Chips"));

      long start = System.nanoTime();
      CompletableFuture[] futures = findPricesStream("myPhone27S")
            .map(f -> f.thenAccept(s -> System.out.println(s + " (done in " +((System.nanoTime() - start) / 1_000_000) + " msecs)")))
            .toArray(size -> new CompletableFuture[size]);
      CompletableFuture.allOf(futures).join();
      System.out.println("All shops have now responded in "
            + ((System.nanoTime() - start) / 1_000_000) + " msecs");
   }
}