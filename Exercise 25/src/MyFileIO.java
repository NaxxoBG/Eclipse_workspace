import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyFileIO
{
   public void writeToFile(String fileName, Object obj) {
      ObjectOutputStream out = null;
      try{
         out = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
         out.writeObject(obj);
      }
      catch (FileNotFoundException e) {
         e.printStackTrace();
      }
      catch (IOException e) {
         e.printStackTrace();
      }
      finally {
         try {
            out.close();
         }
         catch (IOException e) {
            e.printStackTrace();
         }
      }
   }

   public void writeToFile(String fileName, Object[] objs) {
      ObjectOutputStream out = null;
      try
      {
         out = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
         out.writeInt(objs.length);
         for(Object obj : objs)
         {
            out.writeObject(obj);
         }
      }
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
      finally
      {
         try
         {
            out.close();
         }
         catch (IOException e)
         {
            e.printStackTrace();
         }
      }
   }

   public Object readObjectFromFile(String fileName) {
      Object result = null;
      ObjectInputStream in = null;
      try
      {
         in = new ObjectInputStream(new FileInputStream(new File(fileName)));
         result = in.readObject();
      }
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
      catch (ClassNotFoundException e)
      {
         e.printStackTrace();
      }
      finally
      {
         try
         {
            in.close();
         }
         catch (IOException e)
         {
            e.printStackTrace();
         }
      }
      return result;
   }

   public Object[] readArrayFromFile(String fileName) {
      Object[] result = null;
      ObjectInputStream in = null;
      try
      {
         in = new ObjectInputStream(new FileInputStream(new File(fileName)));
         result = new Object[in.readInt()];
         for(int i = 0; i < result.length; i++)
         {
            result[i] = in.readObject();
         }
      }
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
      catch (ClassNotFoundException e)
      {
         e.printStackTrace();
      }
      finally
      {
         try
         {
            in.close();
         }
         catch (IOException e)
         {
            e.printStackTrace();
         }
      }
      return result;
   }
}