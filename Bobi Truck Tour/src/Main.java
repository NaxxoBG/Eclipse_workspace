import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int counter = 0, minDex = -1;
      int currentFuel = 0;
      ArrayList<PetrolPump> pumps = new ArrayList<>();

      System.out.println("Please enter the number of petrol stations");
      int numOfStations = in.nextInt();
      in.nextLine();
      while (numOfStations > counter) {
         System.out.println("Please enter details about petrol station No. " + ++counter + " in the format (\"petrol amount to give\", \"distance to next pump\")");
         String tuples = in.nextLine();
         pumps.add(new PetrolPump(Integer.parseInt(tuples.split(", ")[0]), Integer.parseInt(tuples.split(", ")[1])));
      }
      System.out.println(pumps);
      in.close();

      counter = 0;

      main:
         for (int i = 0; i < pumps.size(); i++) {
            for (int j = i; j < pumps.size() + i; j++) {
               currentFuel += pumps.get(j % pumps.size()).getPetrolAmount() - pumps.get(j % pumps.size()).getDistanceToNext();
               counter++;  
               if (currentFuel <= 0) {
                  currentFuel = 0;
                  counter = 0;
                  continue;
               } else if (counter == pumps.size()) {
                  minDex = j;
                  break main;
               }
            }
         }
      if (minDex == -1) {
         System.out.println("Not possible to complete a circle");
      } else {
         System.out.println("Min index: " + minDex);
      }
   }
}