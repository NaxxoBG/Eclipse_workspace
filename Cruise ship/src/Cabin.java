public class Cabin
{
   private int cabinNo;
   private double price;
   private Passenger passenger;

   public Cabin(int cabinNo, double price) {
      this.cabinNo = cabinNo;
      this.price = price;
      passenger = null;
   }

   public Cabin(int cabinNo, double price, Passenger passenger) {
      this.cabinNo = cabinNo;
      this.price = price;
      this.passenger = passenger;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public int getCabinNo() {
      return cabinNo;
   }

   public boolean hasPassenger() {
      return passenger != null;
   }

   public Passenger getPassenger() {
      return passenger;
   }

   public void setPassenger(Passenger passenger) {
      this.passenger = passenger;
   }

   public String toString() {
      return "Cabin [cabinNo=" + cabinNo + ", price=" + price + ", passenger="
            + passenger + "]";
   }
}