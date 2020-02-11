import java.util.ArrayList;

public class ApartmentComplex
{
   private String address;
   private ArrayList<Apartment> apartments;

   public ApartmentComplex(String address) {
      this.address = address;
      apartments = new ArrayList<Apartment>();
   }

   public int getNumberOfApartments() {
      return apartments.size();
   }

   public void add(Apartment apartment) {
      apartments.add(apartment);
   }

   public Apartment getApartment(int index) {
      return apartments.get(index - 1);
   }

   public Apartment getApartmentByNumber(int number) {
      for (Apartment apartment : apartments) {
         if(apartment.getNumber() == number) {
            return apartment;
         }
      }
      return null;
   }

   public Apartment getApartmentByTenant(Tenant tenant) {
      for (Apartment apartment : apartments) {
         if (!(apartment.isAvailable()) && apartment.getTenant().equals(tenant)) {
            return apartment;
         }
      }
      return null;
   }

   public Apartment getFirstAvailableApartment() {
      ArrayList<Apartment> list = new ArrayList<>();
      for (Apartment apartment : apartments) {
         if (apartment.getTenant() == null) {
            list.add(apartment);
            return list.get(0);
         }
      }
      return null;
   }

   public String toString() {
      return "The address of the complex is " + address + ". The apartments in this complex are " + apartments;
   }
}
