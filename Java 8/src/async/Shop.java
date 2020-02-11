package async;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class Shop
{
   private Random random;
   private String name;

   public Shop(String name) {
      random = new Random();
      this.setName(name);
   }

   public String getPrice(String product) {
      double price = calculatePrice(product);
      Discount.Code code = Discount.Code.values()[random.nextInt(Discount.Code.values().length)];
      return String.format("%s:%.2f:%s", name, price, code);
   }

   public Future<Double> getPriceAsync(String product) {
      CompletableFuture<Double> futurePrice = new CompletableFuture<>();
      new Thread(() -> {
         try {
            double price = calculatePrice(product);
            futurePrice.complete(price);
         }
         catch (Exception ex) {
            futurePrice.completeExceptionally(ex);
         }

      }).start();
      return futurePrice;
   }

   private double calculatePrice(String product) {
      delay();
      return random.nextDouble() * product.charAt(0) + product.charAt(1);
   }

   public static void delay() {
      try {
         Thread.sleep(1000);
      }
      catch (InterruptedException e) {
         e.printStackTrace();
      }
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}