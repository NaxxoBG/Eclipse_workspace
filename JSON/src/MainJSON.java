import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainJSON
{
   @SafeVarargs
   public static <T extends Object> void writeObjectsToFileJSON(T... objects) throws SecurityException, JSONException, IOException, IllegalArgumentException, IllegalAccessException {
      File file = new File("C:/Users/Naxxo/Desktop/JSONtest.txt");
      FileWriter writer = new FileWriter(file);

      for (T object : objects) {
         JSONObject objectToWrite = new JSONObject(object);
         writer.write(objectToWrite.toString());
      }
      writer.close();
   }
   
   @SafeVarargs
   public static <T extends Object> void writeObjectsToFileGSON(T... objects) throws SecurityException, JSONException, IOException, IllegalArgumentException, IllegalAccessException {
      File file = new File("C:/Users/Naxxo/Desktop/GSONtest.txt");
      FileWriter writer = new FileWriter(file);
      GsonBuilder gsonBuilder = new GsonBuilder();
      gsonBuilder.setPrettyPrinting();
      Gson gson = gsonBuilder.create();
      
      for (T object : objects) {
         writer.write(gson.toJson(object));
      }
      writer.close();
   }

   @SafeVarargs
   public static <T extends Object> void sendObjectsToPort(T... objects) throws IOException {
      Socket socket = null;
      OutputStreamWriter osw;
      StringBuilder builder = new StringBuilder();

      for (T object : objects) {
         JSONObject jsonObj = new JSONObject(object);
         builder.append(jsonObj.toString() + "\n");
      }

      try {
         socket = new Socket("127.0.0.1", 5403);
         osw = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
         osw.write(builder.toString(), 0, builder.length());
         System.out.println("Length of sent string: " + builder.length());

         new Thread(new ReaderThread(socket)).start();

         osw.flush();
      } catch (IOException e) {
         System.err.print(e);
      }
   }

   public static class ReaderThread implements Runnable {
      public Socket socket;

      public ReaderThread(Socket socket) {
         this.socket = socket;
      }

      @Override
      public void run() {
         try {
            int red = -1;
            byte[] buffer = new byte[5 * 1024]; // a read buffer of 5KB
            byte[] redData;
            StringBuilder clientData = new StringBuilder();
            String redDataText;
            while ((red = socket.getInputStream().read(buffer)) > -1) {
               redData = new byte[red];
               System.arraycopy(buffer, 0, redData, 0, red);
               redDataText = new String(redData, "UTF-8");
               System.out.println("Message sent from C# Server: " + redDataText); 
               clientData.append(redDataText);
            }
            System.out.println("Data From Client :" + clientData.toString());
            if (null != socket){
               socket.close();
            }
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }

   public static void main(String[] args) throws SecurityException, JSONException, IOException, IllegalArgumentException, IllegalAccessException {
      Car car = new Car("Audi", "A7", 100000);
      Person person = new Person("Atanas Latinov", 250000000, 99);

      /*writeObjectsToFileJSON(car, person);
      writeObjectsToFileGSON(car, person);*/
      sendObjectsToPort(car, person);
      
   }
}