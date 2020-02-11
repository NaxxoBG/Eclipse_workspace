package ClassExercises;

public class Exercise2_9
{
   public static void main(String[] args)
   {
      String city = "San Francisco";
      int stringLength = city.length();
      char oneChar = city.charAt(0);
      String uppercity = city.toUpperCase();
      String lowercity = city.toLowerCase();
      System.out.print(city + "\n" + oneChar + "\n" + uppercity +  
            "\n" + lowercity + "\n" + stringLength);
   }
}