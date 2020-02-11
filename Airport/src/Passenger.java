public class Passenger
{
   private String name;
   private String address;

   public Passenger(String name, String address) {
      this.name = name;
      this.address = address;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public boolean equals(Object obj) {
      if (!(obj instanceof Passenger)) {
         return false;
      } else {
         Passenger other = (Passenger) obj;
         return name == other.name && address == other.address;
      }
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   @Override
   public String toString()
   {
      return "Name: " + name + ", address: " + address;
   }
}