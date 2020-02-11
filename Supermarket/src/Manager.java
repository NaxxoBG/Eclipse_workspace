public class Manager {
   private String name;
   private double salary;

   public Manager(String name, double salary) {
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

   public boolean equals(Manager manager) {
      return name == manager.name && salary == manager.salary;
   }

   public String toString() {
      return "Manager\nName: " + name + "\nSalary: " + salary;
   }
}