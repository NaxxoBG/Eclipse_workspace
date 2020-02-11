import java.util.ArrayList;

public class EmployeeList
{
   private int size;
   private ArrayList<Employee> employees;

   public EmployeeList(int maxNumberOfEmployees) {
      employees = new ArrayList<>(maxNumberOfEmployees);
   }

   public void addEmployeeList(Employee employee) {
      employees.add(employee);
   }

   public void removeEmployee(Employee employee) {
      employees.remove(employee);
   }

   public int getNumberOfEmployees() {
      return employees.size();
   }

   public Employee[] getAllEmployees() {
      return (Employee[])employees.toArray();
   }

   public double getTotalEarningsPerWeek() {
      double total = 0;
      for (Employee employee : employees) {
         total += employee.earningsPerWeek();
      }
      return total;
   }


   public String toString() {
      return "EmployeeList \nsize:" + size + "\nemployees: " + employees;
   }

   public boolean equals(Object o) {
      if (!(o instanceof EmployeeList)) {
         return false;
      } else {
         EmployeeList other = (EmployeeList) o;
         return size == other.size && employees.equals(other.employees);
      }
   }
}