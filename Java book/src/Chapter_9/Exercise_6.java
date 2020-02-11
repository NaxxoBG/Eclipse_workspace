package Chapter_9;

public class Exercise_6
{
   private static int positionOfDominantElement(int... numbers) {
      for (int i = 1; i < numbers.length - 1; i++) {
         if (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]) {
            return i;
         }
      }
      return -1;
   }

   public static void main(String[] args) {
      System.out.println(positionOfDominantElement(1,2,3,4,5,6,7,8,9,8,10));
   }
}