package Task3January2016;

public class Cashier implements Runnable
{
   private String name;
   private SuperMarket market; 

   public Cashier(String name, SuperMarket market) {
      this.name = name;
      this.market = market;
   }

   public void run() {
      while (true) {
         market.startNextServing();
         market.serviceFinished();
      }
   }

   public String getName() {
      return name;
   }
}