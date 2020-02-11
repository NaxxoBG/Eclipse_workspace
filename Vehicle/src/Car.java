public class Car extends Vehicle
{
   private String regNo;

   public Car(String owner, double price, String regNo) {
      super(owner, price);
      this.regNo = regNo;
   }

   public String getRegistrationNumber() {
      return regNo;
   }

   public void setRegistrationNumberNo(String registrationNumber) {
      regNo = registrationNumber;
   }

   public boolean equals(Object arg) {
      if(!(arg instanceof Car)) {
         return false;
      } else {
         Car other = (Car) arg;
         return super.equals(other) && regNo.equals(other.regNo);
      }
   }

   public String toString() {
      return "\n" + this.getClass().getName()+"\n" + super.toString() + "\nregName: " + regNo;
   }
}