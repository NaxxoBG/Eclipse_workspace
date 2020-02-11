
import java.util.ArrayList;

public class ApartmentComplex
{
   private String address;
   private ArrayList<Residence> residences;

   public ApartmentComplex(String address) {
      this.address = address;
      residences = new ArrayList<Residence>();
   }

   public int getNumberOfResidences() {
      return residences.size();
   }

   public void add(Residence residence) {
      residences.add(residence);
   }

   public Residence getResidence(int index) {
      return residences.get(index);
   }

   public Residence getResidenceByNumber(int number) {
      for (Residence residence : residences) {
         if(residence.getNumber() == number) {
            return residence;
         }
      }
      return null;
   }



   public Residence getFirstAvailableRoom() {

      for (Residence residence : residences) {
         if (residence.isAvailable() && residence instanceof Room ) {
            return residence;
         }
      } return null;
   }


   public Apartment getFirstAvailableApartment(int minNoOfRooms) {
      for (Residence residence : residences) {
         if (residence.isAvailable() && residence instanceof Room && residence.getNumberOfRooms() >= minNoOfRooms) {
            return (Apartment) residence;
         }
      }
      return null;
   }

   public String toString() {
      return "The address of the complex is " + address + ". The apartments in this complex are " + residences;
   }
}