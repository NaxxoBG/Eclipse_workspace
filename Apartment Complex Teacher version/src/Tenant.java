
public class Tenant
{
   private String name;
   private MyDate rentedFrom;
   
   public Tenant(String name)
   {
      this.name = name;
      rentedFrom = MyDate.now();
   }

   public String getName()
   {
      return name;
   }

   public MyDate getRentedFrom()
   {
      return rentedFrom.copy();
   }
   
   public void setRentedFrom(MyDate rentedFrom)
   {
      this.rentedFrom = rentedFrom.copy();
   }
   
}
