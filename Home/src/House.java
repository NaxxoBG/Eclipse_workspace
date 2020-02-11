public class House extends Home
{
   private double price;

   public House(String address, double price) {
      super(address);
      this.price = price;
   }

   public String getInfo() {
      return "a house with an address: " + getAddress() + "\nPrice: " + price;
   }
}