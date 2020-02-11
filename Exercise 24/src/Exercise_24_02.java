import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise_24_02
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File file = new File("friends.txt");
      Scanner input = new Scanner(file);
      while (input.hasNext()) {
         System.out.println(input.nextLine());
      }
      input.close();
   }
}