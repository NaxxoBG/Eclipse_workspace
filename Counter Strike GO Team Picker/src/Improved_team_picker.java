import java.util.ArrayList;
import java.util.Scanner;

public class Improved_team_picker {
   static int x = 0, players = 0, teams = 0, teamcounter = 1;
   static ArrayList<String> a = new ArrayList<String>();
   static Scanner input = new Scanner(System.in);
   static boolean ok = false;
   static String name;

   public static void main(String[] args) {
      //setup
      while (!ok){
         System.out.println("How many players will be playing?");
         players = input.nextInt();
         System.out.println("How many teams do you want?");
         teams = input.nextInt();
         input.nextLine();

         if ((players % teams) == 0) {
            ok = true;
         } else {
            System.out.println("It is not possible to split " + players + " players into " + teams + " teams! Please choose again.");
         }
      }
      ok = false;
      //read players
      for (int i = 0; i < players; i++) {
         System.out.println("Name of " + (i + 1) + ". player!");
         a.add(input.nextLine());
      }
      //Calling randomizer
      for (int p = 0; p < teams; p++) {
         Randomizer();
      }
      input.close();
   }
   // Randomizer method
   private static void Randomizer() {
      System.out.println("\n" + teamcounter + ". Team!");
      teamcounter++;
      for (int i = 0; i < (players / teams); i++) {
         x= (int) (Math.random() * a.size());
         System.out.println(a.get(x)); 
         a.remove(x);
      }
   }
}