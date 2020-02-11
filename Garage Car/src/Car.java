public class Car
{
   private String colour;
   private String owner;
   private String registrationNumber;

   public Car(String colour, String owner, String registrationNumber) {

      this.colour = colour;
      this.owner = owner;
      this.registrationNumber = registrationNumber;
   }

   public String getColour() {
      return colour;
   }

   public void setColour(String colour) {
      this.colour = colour;
   }

   public String getOwner() {
      return owner;
   }

   public void setOwner(String owner) {
      this.owner = owner;
   }

   public String getRegistrationNumber() {
      return registrationNumber;
   }

   public void setRegistrationNumber(String registrationNumber) {
      this.registrationNumber = registrationNumber;
   }


   public String toString() {
      return "Car [colour=" + colour + ", owner=" + owner
            + ", registrationNumber=" + registrationNumber + "]";
   }
}