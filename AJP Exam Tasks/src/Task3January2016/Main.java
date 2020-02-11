package Task3January2016;

public class Main
{
   public static void main(String[] args) throws InterruptedException {
      SuperMarket market = new SuperMarket("KOME");

      Thread cashier = new Thread(new Cashier("John", market));
      cashier.start();

      for (int i = 0; i < 100; i++) {
         Thread customer = new Thread(new Customer(market.getID(), market));
         customer.start();
         Thread.sleep(1500);
      }
      
   }
}