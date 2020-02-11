package Chapter_6;

public class Exercise_4_b
{
   public static void main(String[] args)
   {
      String[] numCards = {"2", "3", "4", "5",
            "6", "7", "8", "9", "10", "J", "K",
            "Q", "A"};

      String[] paint = {"Спатия", "Каро", "Купа",
      "Пика"};

      for (String num : numCards) {
         for (String colour : paint) {
            System.out.println(num + "-"+ colour);
         }
      }
   }
}