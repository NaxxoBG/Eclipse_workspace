import java.util.ArrayList;

public class CarRental
{
   private String companyName;
   private String address;
   private ArrayList<Car> carsForRent;

   public CarRental(String companyName, String address) {
      this.companyName = companyName;
      this.address = address;
      carsForRent = new ArrayList<>();
   }

   public String getCompanyName()
   {
      return companyName;
   }

   public String getAddress()
   {
      return address;
   }

   public int getNumberOfCars() {
      return carsForRent.size();
   }

   public Car getCar(int index) {
      return carsForRent.get(index);
   }

   public void addCar(Car car) {
      carsForRent.add(car);
   }

   public Car getCarByLicense(String licenseNo) {
      for (Car car : carsForRent) {
         if (car.getLicenseNo().equals(licenseNo)) {
            return car;
         }
      }
      return null;
   }

   public SportsCar getAvailableSportsCar() {
      for (Car car : carsForRent) {
         if (car instanceof SportsCar && car.isAvailable()) {
            return (SportsCar) car;
         }
      }
      return null;
   }

   public Van getAvailableVan(int minCapacity) {
      for (Car car : carsForRent) {
         if (car instanceof Van && car.isAvailable() && ((Van) car).getCapacity() > minCapacity) {
            return (Van) car;
         }
      }
      return null;
   }
}