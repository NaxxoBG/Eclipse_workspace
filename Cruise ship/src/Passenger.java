public class Passenger
{
   private String name;
   private String address;

   public Passenger(String name, String address) {
      this.name = name;
      this.address = address;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String toString() {
      return "Passenger [name=" + name + ", address=" + address + "]";
   }

   public boolean equals(Object o) {
      if (!(o instanceof Passenger)) {
         return false;
      } else {
         Passenger other = (Passenger) o;
         return name.equals(other.name) && address.equals(other.name);
      }
   }
}