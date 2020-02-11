public class Junior extends ClubMember
{
   private char gender;

   public Junior(String name, int age, char gender) {
      super(name, age);
      this.gender = gender;
   }

   public char getGender() {
      return gender;
   }

   public String toString() {
      return "Junior Gender: " + gender + ", "+ super.toString() + ", Membership Fee: " + getMembershipFee();
   }

   public double getMembershipFee() {
      if (gender == 'm') {
         return 400;
      } else if (gender == 'f') {
         return 300;
      }
      return 0;
   }
}