import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class Exercise_24_04
{
   public static void main(String[] args)
   {
      String filename = "seven";
      ObjectInputStream in = null;
      int c;

      try {
         File file = new File(filename);
         FileInputStream stream = new FileInputStream(file);
         FileOutputStream out = new FileOutputStream(filename);
         in = new ObjectInputStream(stream);

         while (( c = in.read()) != -1) {
            out.write(c);
         }
      }
      catch (Exception e)
      {

      }
   }

}
