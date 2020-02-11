import java.util.ArrayList;

public class EmployeeList
{
   //EmployeeList ----> Employee (Association)

   private Employee[] employee;

   public EmployeeList(Employee[] employee) {
      this.employee = employee;
   }

   public Employee[] getAllEmployees() {
      ArrayList<Employee> list = new ArrayList<>();
      for (int i = 0; i < employee.length; i++) {
         list.add(employee[i]);
      }
      return (Employee[])list.toArray();
   }

   public double getTotalSalary() {
      double totalSalary = 0;
      for (int i = 0; i < employee.length; i++) {
         totalSalary += employee[i].getSalary();
      }
      return totalSalary;
   }

   public void changeSalary(String employeeName, double newSalary) {
      for (int i = 0; i < employee.length; i++) {
         if (employee[i].getName().equals(employeeName)) {
            employee[i].setSalary(newSalary);
         } 
      }
   }

   public String toString() {
      String liner = "";
      for (int i = 0; i < employee.length; i++) {
         liner = liner + employee.length + "\n" + employee[i];
      }
      return "Number of employees: " + liner;
   }
}