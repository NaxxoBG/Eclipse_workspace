package Task3January2016;

public class Customer implements Runnable
{
   private int id;
   private SuperMarket market;

   public Customer(int id, SuperMarket market) {
      this.id = id;
      this.market = market;
   }

   public void run() {
      market.enterWaitingLine();
   }

   public int getID() {
      return id;
   }
}