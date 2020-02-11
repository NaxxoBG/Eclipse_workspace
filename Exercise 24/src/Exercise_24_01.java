import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_24_01
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File file = new File("friends.txt");
      PrintWriter out = new PrintWriter(file);
      Scanner input = new Scanner(System.in);

      System.out.println("Please enter some names of your friends and type Quit.");
      String in = input.nextLine();

      while (!in.equalsIgnoreCase("Quit")) {
         out.println(in);
         System.out.println("Please enter some names of your friends and type Quit.");
         in = input.nextLine();
      }

      System.out.println("The path of the file is " + file.getAbsolutePath());
      out.close();
      input.close();
   }
}