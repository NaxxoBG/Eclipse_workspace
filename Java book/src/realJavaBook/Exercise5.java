package realJavaBook;
import java.util.Scanner;
public class Exercise5 {
   public static void main(String[] args) {
      int height;
      int length;
      System.out.println("Enter height: ");
      System.out.println("Enter length: ");
      Scanner input = new Scanner(System.in);
      height = input.nextInt();
      length = input.nextInt();
      input.close();
      int area = height * length;
      int perimeter = (2 * height) + (2 * length);
      System.out.println("The area of the rectangle is " + area + " and the perimeter is " + perimeter + ".");
   }
}