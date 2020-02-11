package Proxy;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AccessLogIn implements Authentication
{
   public String userName;
   public String password;

   public AccessLogIn() {
      loadFromDisk();
   }

   private void loadFromDisk() {
      File file = new File("C:/Users/Naxxo/Desktop/Folders/SDJ2 Exercises/login.txt");
      if (file.exists()) {
         try {            
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(file);
            userName= scanner.nextLine();
            password = scanner.nextLine();
         } catch (IOException e) {
            System.out.println("Loading failed");
         }
      } else {
         System.out.println("Cannot load a file");
      }  
   }

   public boolean checkPassword(String userName, String password) {
      return this.userName.equals(userName) && this.password.equals(password);
   }
}