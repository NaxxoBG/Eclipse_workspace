import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrangeNumbers
{
   public static void main(String[] args) {
      System.out.println("Enter a number/stream of numbers for the timetest of the method");
      long start = System.currentTimeMillis();
      compareDigitsByName();
      long end = System.currentTimeMillis();
      System.out.println("Runtime -> " + (end - start) + " ms");

      do {
         System.out.println("\nEnter a number/stream of numbers");
         compareDigitsByName();
      } while(true);
   }

   /**This method takes digits separated by a comma and a space, sorts the digits depending on their name and <br>
    * returns the sorted digits. It also prints out the process during the different stages and iterations, providing <br> 
    * the observer with the chance to follow the direction of the exectuion.
    * @param none
    * @return none
    * @version 1.0
    * @author Naxxo
    * @since 04/04/16
    * @see 
    */
   protected static final synchronized strictfp void compareDigitsByName() {
      final String[] numberName = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
      final ArrayList<String> NUMBERS = new ArrayList<String>(Arrays.asList(numberName));
      ArrayList<String> result = new ArrayList<String>();
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      String numberInput = in.nextLine().trim(); // take the line of numbers and remove whitespaces
      try {
         String[] numbers = numberInput.split(", "); // split this line of numbers by "," and store the values in an array
         for (int i = 0; i < numbers.length; i++) { // first loop iterates through each number 
            String[] numberFromNumbers = numbers[i].split(""); //array that stores the number in an array
            for (int j = 0; j < numberFromNumbers.length; j++) { // second loop that iterates through each digit of the number
               switch (Integer.parseInt(numberFromNumbers[j])) { 
                  case 0:                                        //switch that compares the digit with digits - (0-9)
                     result.add(NUMBERS.get(0));                 // and adds the corresponding names to the arraylist, which 
                     break;                                      // stores the end result
                  case 1: 
                     result.add(NUMBERS.get(1));
                     break;
                  case 2: 
                     result.add(NUMBERS.get(2));
                     break;
                  case 3: 
                     result.add(NUMBERS.get(3));
                     break;
                  case 4: 
                     result.add(NUMBERS.get(4));
                     break;
                  case 5: 
                     result.add(NUMBERS.get(5));
                     break;
                  case 6: 
                     result.add(NUMBERS.get(6));
                     break;
                  case 7: 
                     result.add(NUMBERS.get(7));
                     break;
                  case 8: 
                     result.add(NUMBERS.get(8));
                     break;
                  case 9: 
                     result.add(NUMBERS.get(9));
                     break;
                  default:
                     break;
               }
            }
            System.out.println(result + " ----- Unsorted");
         }
         Collections.sort(result);
         String res = "";
         String resultNumbers = "";
         for (int i = 0; i < result.size() - 1; i++) {
            res += result.get(i) + "-";
            resultNumbers += NUMBERS.indexOf(result.get(i)) + "-";
         }
         res += result.get(result.size() - 1);
         resultNumbers += NUMBERS.indexOf(result.get(result.size() - 1));
         System.out.println(result + " ----- Sorted");
         System.out.println(res);
         System.out.println(resultNumbers);
      } catch (Exception e) {
         System.out.println(e.getClass() + " "+ e.getMessage() + " ,should be \", \"");
      }
   }

}