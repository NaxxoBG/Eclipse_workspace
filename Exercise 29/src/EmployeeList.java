import java.util.ArrayList;

public class EmployeeList
{
   private int size;
   private ArrayList<Employee> list;

   public EmployeeList(int maxNumberOfEmployees) {
      size = maxNumberOfEmployees;
      list = new ArrayList<>(size);
   }

   public void addEmployee(Employee employee) {
      list.add(employee);
   }

   public void removeEmployee(Employee employee) {
      list.remove(employee);
   }

   public int getNumberOfEmployees() {
      return list.size();
   }

   public Employee[] getAllEmployees() {
      return (Employee[]) list.toArray();
   }

   public double getTotalEarningsPerWeek() {
      double total = 0;
      for (Employee employee : list) {
         total += employee.earningsPerWeek();
      }
      return total;
   }

   public String toString() {
      return "EmployeeList [size=" + size + ", list=" + list + "]";
   }

   public boolean equals(Object o) {
      if (!(o instanceof EmployeeList)) {
         return false;
      } else {
         EmployeeList other = (EmployeeList) o;
         return size == other.size && list.equals(other.list);
      }
   }
}