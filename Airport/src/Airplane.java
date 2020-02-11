import java.util.ArrayList;
import java.util.Arrays;

public class Airplane
{
   private String model;
   private int amountOfSeats;
   private ArrayList<Passenger> passengers;

   public Airplane(String model, int amountOfSeats) {
      this.model = model;
      this.amountOfSeats = amountOfSeats;
      passengers = null;
   }

   public String getModel() {
      return model;
   }

   public int getAmountOfSeats() {
      return amountOfSeats;
   }

   public boolean equals(Object obj) {
      if (!(obj instanceof Airplane)) {
         return false;
      } else {
         Airplane other = (Airplane) obj;
         return model == other.model && amountOfSeats == other.amountOfSeats;
      }
   }

   public boolean isFull() {
      if (passengers.size() == amountOfSeats) {
         return true;
      } else {
         return false;
      }
   }

   public void BoardPlane(Passenger[] passengers) {
      ArrayList<Passenger> passList = new ArrayList<Passenger>(Arrays.asList(passengers));
      this.passengers = passList;
   }

   public String toString() {
      return String.format("\nModel: %s\nSeats: %s\nPassengers: %s", model, amountOfSeats, passengers);
   }

   public boolean equals(Airplane airplane) {
      return model == airplane.model && amountOfSeats == airplane.amountOfSeats && passengers.equals(airplane.passengers);
   }
}