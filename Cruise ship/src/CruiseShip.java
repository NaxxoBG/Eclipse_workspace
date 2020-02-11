import java.util.ArrayList;

public class CruiseShip
{
   private String name;
   private String model;
   private String company;
   private ArrayList<Cabin> cabins;

   public CruiseShip(String name, String model, String company) {
      this.name = name;
      this.model = model;
      this.company = company;
      cabins = new ArrayList<Cabin>();
   }

   public String getCompany() {
      return company;
   }

   public void setCompany(String company) {
      this.company = company;
   }

   public String getModel() {
      return model;
   }

   public Cabin getCabin(int cabinNo) {
      for (Cabin cabin : cabins) {
         if (cabin.getCabinNo() == cabinNo) {
            return cabin;
         }
      }
      return null;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String toString() {
      return "CruiseShip [name=" + name + ", model=" + model + ", company="
            + company + ", cabins=" + cabins + "]";
   }

   public int getAmountOfCabins() {
      return cabins.size();
   }

   public Cabin getNextAvailableCabin() {
      for (Cabin cabin : cabins) {
         if (cabin.hasPassenger() == false) {
            return cabin;
         }
      }
      return null;
   }

   public void addCabin(Cabin cabin) {
      cabins.add(cabin);
   }

   public Cabin getCheapestCabin() {
      double cheapest = 0;
      for (Cabin cabin : cabins) {
         if (cheapest > cabin.getPrice()) {
            cheapest = cabin.getPrice();
         }
      }

      for (Cabin Cabin : cabins) {
         if (cheapest == Cabin.getPrice()) {
            return Cabin;
         }
      }
      return null;
   }
}