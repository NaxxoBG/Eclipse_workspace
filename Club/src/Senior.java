public class Senior extends ClubMember
{
   public Senior (String name, int age, char gender) {
      super(name, age);
   }

   public String toString() {
      return "Senior " + super.toString() + ", Membership Fee: " + getMembershipFee();
   }

   public double getMembershipFee() {
      return 10*(100 - getAge());
   }
}