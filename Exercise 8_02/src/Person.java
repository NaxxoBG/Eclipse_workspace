import java.util.Scanner;

public class Person
{
   Scanner input = new Scanner(System.in);
   
   //fields
   
   public String name;
   public String birthday;
   
   //constructor
   
   public Person(String name, String birthday) 
   {
   this.name = name;
   this.birthday = birthday;
   }
   
   // Methods
   
   public void setName(String name) 
   {
      name = input.nextLine();
   } 
   public void setBirthday(String birthday)
   {
      birthday = input.nextLine();
   }
   
   public String getName() 
   {
      System.out.println("What is your name?");
      String name = input.nextLine();
      return name;
   }
   public String getBirthday() 
   {
      System.out.println("When is your birthday?");
      String birthday = input.nextLine();
      return birthday;
   }
}