public class HourlyEmployee extends Employee
{
   private double wagePerHour;
   private double hoursWorkedPerWeek;

   public HourlyEmployee(String name, Date birthday, double wagePerHour, double hoursWorkedPerWeek) {
      super(name, birthday);
      this.wagePerHour = wagePerHour;
      this.hoursWorkedPerWeek = hoursWorkedPerWeek;
   }

   public double earningsPerWeek() {
      return wagePerHour * hoursWorkedPerWeek;
   }

   public double getWagePerHour() {
      return wagePerHour;
   }

   public void setWagePerHour(double wagePerHour) {
      this.wagePerHour = wagePerHour;
   }

   public double getHoursWorkedPerWeek() {
      return hoursWorkedPerWeek;
   }

   public void setHoursWorkedPerWeek(double hoursWorkedPerWeek) {
      this.hoursWorkedPerWeek = hoursWorkedPerWeek;
   }


   public String toString() {
      return "HourlyEmployee \nWage per hour=" + wagePerHour
            + "\nHours worked per week=" + hoursWorkedPerWeek + "\n" + super.toString();
   }

   public boolean equals(Object o) {
      if (!(o instanceof HourlyEmployee)) {
         return false;
      } else {
         HourlyEmployee other = (HourlyEmployee) o;
         return super.equals(other) && wagePerHour == other.wagePerHour && hoursWorkedPerWeek == other.hoursWorkedPerWeek;
      }
   }
}