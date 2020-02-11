import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Exercise_24_03
{
   public static void main(String[] args) throws IOException
   {
      Scanner input = new Scanner(System.in);
      ObjectOutputStream objectStream = null;
      String name = null;

      try {
         System.out.println("Enter a name for the new file:");

         File file = new File(input.nextLine() + ".txt");

         FileOutputStream fileStream = new FileOutputStream(file);

         objectStream = new ObjectOutputStream(fileStream);
         for (int i = 0; i < 11; i++) {
            objectStream.writeChars( " 7 * " + i + " = " + 7 * i + ";");
         }
      }

      catch (IOException e) {
         System.out.println("Exception: " + name);
      }

      finally {
         try {
            objectStream.close();
         }
         catch (IOException e) {
            e.printStackTrace();
         }
      }
      input.close();
   }
}