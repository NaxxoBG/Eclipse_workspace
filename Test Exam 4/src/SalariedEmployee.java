public class SalariedEmployee extends Employee
{
   private double weeklySalary;

   public SalariedEmployee(String name, Date birthday, double weeklySalary) {
      super(name, birthday);
      this.weeklySalary = weeklySalary;
   }

   public void setWeeklySalary(double weeklySalary) {
      this.weeklySalary = weeklySalary;
   }

   public double getWeeklySalary() {
      return weeklySalary;
   }

   public double earningsPerWeek() {
      return weeklySalary;

   }

   public String toString() {
      return "Salaried Employee \nweeklySalary: " + weeklySalary + "\n" + super.toString();
   }

   public boolean equals(Object o) {
      if(!(o instanceof SalariedEmployee)) {
         return false;
      } else {
         SalariedEmployee other = (SalariedEmployee) o;
         return super.equals(other) && weeklySalary == other.weeklySalary;
      }
   }
}