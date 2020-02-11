public abstract class Person
{
   private String name;
   private String address;
   private int telephone;

   public Person(String name, String address, int telephone) {
      this.name = name;
      this.address = address;
      this.telephone = telephone;
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

   public int getTelephone() {
      return telephone;
   }

   public void setTelephone(int telephone) {
      this.telephone = telephone;
   }

   public boolean equals(Object o) {
      if (!(o instanceof Person)) {
         return false;
      } else {
         Person other = (Person) o;
         return name.equals(other.name) && address.equals(other.address) && telephone == other.telephone;
      }
   }
}