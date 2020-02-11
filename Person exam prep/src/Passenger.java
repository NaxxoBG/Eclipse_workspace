public class Passenger extends Person
{
   private boolean sittingSpot;
   private boolean hasTicket;

   public Passenger(String name, String address, int telephone,
         boolean sittingSpot, boolean hasTicket) {
      super(name, address, telephone);
      this.sittingSpot = sittingSpot;
      this.hasTicket = hasTicket;
   }

   public boolean hasSittingSpot() {
      return sittingSpot;
   }

   public boolean hasTicket() {
      return hasTicket;
   }

   public boolean equals(Object o) {
      if (!(o instanceof Passenger)) {
         return false;
      } else {
         Passenger other = (Passenger) o;
         return super.equals(other) && sittingSpot == other.sittingSpot && hasTicket == other.hasTicket;
      }
   }
}