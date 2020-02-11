package ClassExercises;
import java.util.Scanner;

public class Exercise_MyNameAndAge
{

   public static void main(String[] args)
   {
      String name;
      String address;
      int age;
      
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter your name:\n" + "Enter your age:\n" + "Enter your address:");
      name = input.nextLine();
      age = input.nextInt();
      
      // The next line fixes the problem with the program not reading your address.
      input.nextLine();
      
      address = input.nextLine();
      if (address.length() == 0) {
         System.err.println("You have not entered a valid address!");
      }
         
         
      //Output
      System.out.println("Hi, your name is " + name + ", your age is " + age + " and your address is " + address + ".");
      input.close();
      
      

   }

}
