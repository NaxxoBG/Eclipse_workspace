import java.util.ArrayList;

public class Airport 
{
   private String address;
   private ArrayList<Airplane> airplanes;

   public Airport(String address) {
      this.address = address;
      this.airplanes = new ArrayList<>();
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public void landAirplane(Airplane airplane) {
      airplanes.add(airplane);
   }

   public void takeOffAirplane(Airplane airplane) {
      airplanes.remove(airplane);
   }

   public int amountOfAirplanes() {
      return airplanes.size();
   }

   public Airplane largestAirplane() {
      int largest = airplanes.get(0).getAmountOfSeats();
      for (Airplane airplane : airplanes) {
         if (largest < airplane.getAmountOfSeats()) {
            largest = airplane.getAmountOfSeats();
         }
      } 
      for (Airplane airplane : airplanes) {
         if (airplane.getAmountOfSeats() == largest)
            return airplane;
      }
      return null;
   }

   public String toString() {
      return String.format("*****Airport*****\nAddress: %s\nAirplanes: %s", address, airplanes);
   } 
}