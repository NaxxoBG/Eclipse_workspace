public class Person
{
   private String name;
   private int age;

   public Person(String name, int age) {
      this.name = name;
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public int getAge() {
      return age;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getStatus() {
      if (age < 0)
      {
         return "Illegal age";
      }
      else if (age < 18)
      {
         return "Child";
      }
      else if (age < 65) {
         return "Adult";
      }
      else if (age < 65) {
         return "Adult";
      }
      return "Senior Citizen";
   }

   public String toString() {
      return "NAME: " + name + " ;AGE: " + age + " ;STATUS: " + getStatus();
   }
}