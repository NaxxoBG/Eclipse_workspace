import java.util.ArrayList;
import java.util.Scanner;

public class MainPlants
{
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.println("Enter the number of plants");
      int numOfPlants = in.nextInt();
      in.nextLine();

      System.out.println("Enter the pesticide levels for each plant");
      String[] amountPest = in.nextLine().split(", ");

      in.close();

      ArrayList<Plant> plants = new ArrayList<>();

      for (int i = 0; i < numOfPlants; i++) {
         plants.add(new Plant(Integer.parseInt(amountPest[i]), i + 1));
      }
      System.out.println(plants);

      //If a plant has a higher pesticide amount than the one on its left, it dies. This happens each day. Program
      //stops execution when no plants die.


      System.out.println("Plants: " + plants);
   }

   private static class Plant
   {
      public int pestAmount;
      public int number;

      public Plant(int pestAmount, int number) {
         this.pestAmount = pestAmount;
         this.number = number;
      }

      public String toString() {
         return "Plant [pestAmount=" + pestAmount + ", number=" + number + "]";
      }
   }
}