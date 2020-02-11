import java.util.Scanner;
import java.util.Stack;

public class Main
{
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String[] nums = in.nextLine().split(", ");
      in.close();

      Stack<Integer> revNums = new Stack<>();

      for (int i = 0; i < nums.length; i++) {
         revNums.add(Integer.parseInt(nums[i]));
      }

      System.out.println(revNums.toString());

      System.out.println("Reversed:");

      for (int i = 0; i < nums.length; i++) {
         System.out.print(revNums.pop() + ", ");
      }
   }
}