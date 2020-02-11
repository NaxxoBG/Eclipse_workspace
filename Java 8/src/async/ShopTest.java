package async;

import java.util.concurrent.Future;

public class ShopTest
{
   public static void main(String[] args) {
      Shop shop = new Shop("BestShop");
      long start = System.nanoTime();
      Future<Double> futurePrice = shop.getPriceAsync("my favourite product");
      long invocationTime = ((System.nanoTime() - start) / 1_000_000);
      System.out.println("Invocation returned after " + invocationTime + " msecs");

      doSomethingElse();

      try {
         double price = futurePrice.get();
         System.out.printf("Price is %.2f%n", price);
      }
      catch (Exception e) {}

      long retrievalTime = ((System.nanoTime() - start) / 1_000_000);
      System.out.println("Price returned after " + retrievalTime + " msecs");
   }


   private static void doSomethingElse() {
      System.out.println("Doing something else");
   }
}