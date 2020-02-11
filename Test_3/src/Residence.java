public abstract class Residence
{
   private int number;
   private double size;
   private String type;
   private Tenant rentedTo;
   private static final String TYPES[] = {"Room", "Apartment"};

   public Residence(int number, double size, String type) {
      this.number = number;
      this.size = size;
      if (type.equalsIgnoreCase(TYPES[0])) {
         this.type = type;
      } else {
         this.type = TYPES[1];
      }
      rentedTo = null;
   }

   public int getNumber()
   {
      return number;
   }

   public double getSize()
   {
      return size;
   }

   public String getType()
   {
      return type;
   }

   public boolean isAvailable() {
      if (rentedTo.equals(null)) {
         return true;
      } return false;
   }

   public void rentTo(Tenant tenant, MyDate rentedFrom) {
      rentedTo = tenant;
      rentedTo.setRentedFrom(rentedFrom);

   }

   public Tenant getTenant() {
      return rentedTo;
   }

   public abstract int getNumberOfRooms();
}