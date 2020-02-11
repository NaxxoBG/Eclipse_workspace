package Threads.Airport;

public class Passenger
{
   private String nationality;
   private long passportNumber;

   public Passenger(String nationality, long passportNumber) {
      this.nationality = nationality;
      this.passportNumber = passportNumber;
   }

   public String getNationality() {
      return nationality;
   }

   public long getPassportNumber() {
      return passportNumber;
   }
}