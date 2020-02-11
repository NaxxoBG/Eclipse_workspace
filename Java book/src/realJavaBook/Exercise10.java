package realJavaBook;
import java.util.Scanner;
public class Exercise10
{
   public static void main(String[] args) {
      int a, b;
      System.out.println("Enter a value for a: ");
      System.out.println("Enter a value for b: ");
      Scanner input = new Scanner(System.in);
      a = input.nextInt();
      b = input.nextInt();
      System.out.println( a > b  ? "a is bigger than b." : "b is bigger than a.");
      input.close();
   }
}