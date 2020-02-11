public class Student
{
   private String firstName;
   private String lastName;
   private String country;

   public Student(String firstName, String lastName, String country) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.country = country;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public String getCountry() {
      return country;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public void setLastname(String lastName) {
      this.lastName = lastName;
   }

   public void setCountry(String country) {
      this.country = country;
   }

   public String toString() {
      return "First name: " + firstName + "\nLast name: " + lastName
            + "\nCountry: " + country;
   }

   public boolean equals(Object obj) {
      if (!(obj instanceof Student)) {
         return false;
      } else {
         Student other = (Student) obj;
         return firstName.equals(other.firstName) && lastName.equals(other.lastName) && country.equals(other.country);
      }
   }
}