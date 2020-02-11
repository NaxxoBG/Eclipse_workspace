public class Instructor
{
   private String lastName;
   private String firstName;
   private String officeNumber;

   public Instructor(String lname, String fname, String office) {
      lastName = lname;
      firstName = fname;
      officeNumber = office;
   }

   public Instructor (Instructor object2) {
      lastName = object2.lastName;
      firstName = object2.firstName;
      officeNumber = object2.officeNumber;
   }

   public void set(String lname, String fname, String office) {
      lastName = lname;
      firstName = fname;
      officeNumber = office;
   }

   public String toString() {
      return String.format("Instructor:\n Last Name: %s\n First name: %s\n Office number: %s", lastName, firstName, officeNumber);
   }
}