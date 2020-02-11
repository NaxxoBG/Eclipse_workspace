public class Cashier
{
   private String name;
   private double salary;

   public Cashier(String name, double salary) {
      this.name = name;
      this.salary = salary;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   public String toString() {
      return String.format("\nCashier name: %s\nCashier salary: %s", name, salary);
   }

   public boolean equals(Cashier cashier) {
      return name == cashier.name && salary == cashier.salary;
   }
}