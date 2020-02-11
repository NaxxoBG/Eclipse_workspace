
public class PersonTest
{
   public static void main(String[] args)
      {
         //object guy - calling for user input if values are not set
         Person guy = new Person(null, null);
         //object guy2 - using setters and directly giving name and birthday values
         Person guy2 = new Person("Mike","3/7/1980");
         
         System.out.println("Your name is " + guy.getName() + " and your birthday is on the " + guy.getBirthday() + ".");
         System.out.println("Your name is " + guy2.name + " and your birthday is on the " + guy2.birthday + ".");
      }
}