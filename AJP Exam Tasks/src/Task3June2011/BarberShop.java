package Task3June2011;

public class BarberShop
{
   CircularArray chairs;

   public BarberShop(CircularArray chairs) {
      this.chairs = chairs;
   }

   public synchronized void wantsToBeCut(Customer c) {
      while (chairs.isFull()) {
         try {
            wait();
         } catch (InterruptedException e) {}
      }
      chairs.put(c);
      notifyAll();
   }

   public synchronized Customer cuttingTheNext() {
      while (chairs.isEmpty()) {
         try {
            wait();
         } catch (InterruptedException e) {}
      }
      Customer customer = chairs.take();
      notifyAll();
      return customer;
   }
}