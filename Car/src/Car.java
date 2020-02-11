public class Car
{
   private String registrationNumber;
   private int mileage;
   private ServiceBook serviceBook;

   public Car(String registrationNumber, int mileage) {
      this.registrationNumber = registrationNumber;
      this.mileage = mileage;
      serviceBook = null;
   }

   public String getRegistrationNumber() {
      return registrationNumber;
   }

   public int getMileage() {
      return mileage;
   }

   public ServiceBook getServiceBook() {
      return serviceBook;
   }

   public void setRegistrationNumber(String registrationNumber) {
      this.registrationNumber = registrationNumber;
   }

   public void drive(int mileage) {
      this.mileage += mileage;
   }

   public void service(ServiceBook book) {
     serviceBook = book;
   }

   public boolean equals(Object obj) {
      if (!(obj instanceof Car)) {
         return false;
      } else {
         Car other = (Car) obj;
         return registrationNumber == other.registrationNumber && mileage == other.mileage && serviceBook.equals(other.serviceBook);
      }
   }

   public String toString() {
      return String.format("\nCar: %s\nMileage: %s\nServiceBook: %s", registrationNumber, mileage, serviceBook);
   }
}