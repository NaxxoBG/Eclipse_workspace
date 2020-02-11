
public class NameTest
{

   public static void main(String[] args)
   {
      
      Name name = new Name(null, null);
      
      System.out.println("The first name is " + name.getFirstName());
      System.out.println("The last name is " + name.getlastName());
      System.out.println("The full name is " + name.getFullName());
      System.out.println("The formal name is " + name.getFormalName());
   
      Name name2 = new Name("Henry","Soap");
      System.out.println(name2.firstName);
      System.out.println(name2.getFullName());
      System.out.println(name2.getFormalName());
      name2.firstName = "Alan";
      System.out.println(name2.getFullName());
   }
}