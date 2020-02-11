public abstract class ClubMember
{
   private String name;
   private int age;

   public ClubMember(String name, int age) {
      this.name = name;
      this.age = age;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public String toString() {
      return "Name: " + name + ", Age: " + age;
   }

   public abstract double getMembershipFee();
}