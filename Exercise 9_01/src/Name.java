import java.util.Scanner;
public class Name
{
    public String firstName;
    public String lastName;
    Scanner input = new Scanner(System.in);
    
    public Name(String firstName,String lastName) 
    {
       this.firstName = firstName;
       this.lastName = lastName;
    }
    
    public String getFirstName() 
    {
       System.out.println("Enter first name:");
       firstName = input.nextLine();
       return firstName;
    }
    public String getlastName()
    {
       System.out.println("Enter last name:");
       lastName = input.nextLine();
       return lastName;
    }
    public String getFullName()
    {
       String fullName = firstName + " " + lastName;
       return fullName; 
    } 
    public String getFormalName() 
    {
       return lastName + " " + firstName;
    }
}