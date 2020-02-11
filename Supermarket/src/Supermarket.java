import java.util.ArrayList;

public class Supermarket
{
   private String name;
   private String address;
   private Cashier[] cashier;
   private Manager manager;

   public Supermarket(String name, String address, Manager manager, Cashier[] cashiers) {
      this.name = name;
      this.address = address;
      this.manager = manager;
      this.cashier = cashiers;
      if (cashiers.length == 0) {
         cashier = null;
      }
      else {
         for (int i = 0; i < cashiers.length; i++) {
            cashier[i] = cashiers[i]; 
         }
      }
   }

   public void addCashier(Cashier cashier) {
      ArrayList<Cashier> list = new ArrayList<>();
      for (int i = 0; i < this.cashier.length; i++) {
         list.add(cashier);
      }
      list.toArray();
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public double getTotalSalary() {
      int total = 0;
      for (int i = 0; i < cashier.length; i++) {
         total += cashier[i].getSalary();
      }
      return total;
   }

   public Manager getManager() {
      return manager;
   }

   public Cashier[] getCashiers() {
      return cashier;
   }

   public String toString() {
      ArrayList<Cashier> list = new ArrayList<>();
      for (int i = 0; i < this.cashier.length; i++) {
         list.add(cashier[i]);
      }
      list.toString();
      return String.format("\nSupermarket name: %s\nAddress: %s\nManager: %s\nCashiers: %s", name, address, manager, list);
   }
}