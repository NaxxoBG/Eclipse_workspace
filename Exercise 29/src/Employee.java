public abstract class Employee
{
   private String name;
   private Date birthday;

   public Employee(String name, Date birthday) {
      this.name = name;
      this.birthday = birthday.copy();
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Date getBirthday() {
      return birthday.copy();
   }

   public String toString() {
      return "Employee [name=" + name + ", birthday=" + birthday + "]";
   }

   public boolean equals(Object o) {
      if (!(o instanceof Employee)) {
         return false;
      } else {
         Employee other = (Employee) o;
         return name.equals(other.name) && birthday.equals(other.birthday);
      }
   }

   public abstract double earningsPerWeek();
}