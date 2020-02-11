public class Car
{
   private String name = "Audi";
   private String make;
   private int price;

   public Car(String name, String make, int price) {
      this.name = name;
      this.make = make;
      this.price = price;
   }

   public String getName() {
      return name;
   }

   public String getMake() {
      return make;
   }

   public int getPrice() {
      return price;
   }
}