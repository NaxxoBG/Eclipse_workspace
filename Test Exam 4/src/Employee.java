public abstract class Employee
{
   private String name;
   private Date date;

   public Employee(String name, Date birthday) {
      this.name = name;
      this.date = birthday;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Date getBirthday() {
      return date;
   }

   public String toString() {
      return "Employee [name=" + name + ", date=" + date + "]";
   }

   public boolean equals(Object o) {
      if(!(o instanceof Employee)) {
         return false;
      } else {
         Employee other = (Employee) o;
         return super.equals(other) && other.date == date;
      }
   }

   public abstract double earningsPerWeek();
}