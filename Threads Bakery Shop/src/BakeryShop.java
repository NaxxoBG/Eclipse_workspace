public class BakeryShop
{
   public static void main(String[] args) throws InterruptedException {
      ItakeANumber shop = new NumberDispenser();
      
      BakeryClerk clerk1 = new BakeryClerk(shop, 1);
      BakeryClerk clerk2 = new BakeryClerk(shop, 2);
      
      clerk1.start();
      clerk2.start();
      
      for (int i = 0; i < 11; i++) {
         new BakeryCustomer(shop).start();
         Thread.sleep(1000);
      }
   }
}