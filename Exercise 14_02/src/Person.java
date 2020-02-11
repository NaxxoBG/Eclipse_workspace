
public class Person
{
   //fields

   private String name;
   private MyDate birthday;

   //constructor

   public Person(String name, MyDate birthday) {
      this.name = name;
      this.birthday = birthday;

   }

   public Person(MyDate birthday) {
      name = "Jack Wilson";
      this.birthday = birthday;
   }

   // Methods

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {

      return name;
   }

   public MyDate getBirthday() {
      return birthday;
   }

   public int getAge() {

      return MyDate.now().yearsBetween(birthday);
   }

   public String toString() {
      //return name + birthday.toString();
      return name + "\nbirthday: " + birthday.toString();
   }

   public boolean equals(Object obj) {
      if (!(obj instanceof Person)) {
         return false;
      } else {

         Person other = (Person) obj;
         return name == other.getName() && getAge() == other.getAge() && birthday == other.getBirthday();
      }
   }
}