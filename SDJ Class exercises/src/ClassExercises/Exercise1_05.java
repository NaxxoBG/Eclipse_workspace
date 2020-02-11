package ClassExercises;

public class Exercise1_05
{
   public static void main(String[] args)
   {
      int item1 = 80;
      int item2 = 140;
      int item3 = 230;

      int sum = item1 + item2 + item3;

      double sumWithTax = sum * 0.25 + sum;

      System.out.println("The price of the items is " + sumWithTax + " krones.");
   }
}