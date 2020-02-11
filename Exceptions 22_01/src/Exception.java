import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      ArrayList<Integer> nums = new ArrayList<>();
      int[] numbers = new int[5];

      System.out.println("Enter a number:");

      for (int i = 0; i < numbers.length; i++) {
         try
         {
            int num = input.nextInt();
            if (num < 10 || num > 99) {
               System.out.println("The input is not an integer in the range 10-99, try again");
               i--;
            }
            else nums.add(num);
         }
         catch (InputMismatchException e)
         {
            System.out.println("This is not an ineger you dumb prick");
            input.nextLine();
            i--;
         }
      }
      System.out.println(nums);
      input.close();
   }
}