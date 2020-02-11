package Task3June2011;

public class CustomerRunnable implements Runnable
{
   BarberShop shop;
   Customer customer;

   public CustomerRunnable(BarberShop shop, int num) {
      this.shop = shop;
      this.customer = new Customer(num);
   }

   public void run() {
      shop.wantsToBeCut(customer);
      this.sittingOnAChair(customer);
   }

   private void sittingOnAChair(Customer c) {
      System.out.println("Customer " + c.getNumber() + " has sat on a chair.");
   }
}