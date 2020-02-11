import java.util.ArrayList;
import java.util.Scanner;


public class Team_picker
{

   public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      ArrayList<String> a = new ArrayList<String>();
      int x = 0;
      // read names
      for (int i = 0; i < 10; i++) {
         System.out.println("Name of " + "player " +  (i + 1) + ".");
         a.add(input.nextLine());
      }  
      System.out.println("\nFirst team:");

      for (int i = 0; i < 10; i++) {
         x = (int) (Math.random() * (a.size())) ;
         System.out.println(a.get(x)); 
         a.remove(x);   
         if (i == 4) {
            System.out.println("\nSecond team:"); 
         }
      }
      input.close();
   }
}