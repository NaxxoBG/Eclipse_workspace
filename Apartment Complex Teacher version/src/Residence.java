
public abstract class Residence 
{
   private int number;
   private double size;
   private String type;
   private Tenant rentedTo;
   
   public Residence(int number, double size, String type)
   {
      this.number = number;
      this.size = size;
      this.type = type;
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
   
   public boolean isAvailable()
   {
      if(rentedTo == null)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public void rentTo(Tenant tenant, MyDate rentedFrom)
   {
      rentedTo = tenant;
      tenant.setRentedFrom(rentedFrom);
   }
   
   public Tenant getTenant()
   {
      return rentedTo;
   }
   
   public abstract int getNumberOfRooms();
   
}
