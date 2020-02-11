package ClassExercises;
import java.util.Scanner;
public class Exercise4_21
{
   public static void main(String[] args)
   {
      String name1, name2;

      Scanner input = new Scanner(System.in);

      System.out.println("Enter first name:");
      name1 = input.nextLine();

      System.out.println("Enter second name:");
      name2 = input.nextLine();

      if (name1.compareTo(name2) < 0) {
         System.out.println(name1 + '\n' +name2);
      } else if (name1.compareTo(name2) > 0) 

      {
         System.out.println(name2 + "\n" + name1);
      } 
      input.close();
   }
}