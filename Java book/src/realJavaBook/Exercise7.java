package realJavaBook;
import java.util.Scanner;
public class Exercise7 {
   public static void main(String[] args) {
      double earthMass;
      System.out.println("Enter mass: ");
      Scanner input = new Scanner(System.in);
      earthMass = input.nextInt();
      input.close();
      System.out.println("If you were on the moon, your weight would be equal to " + 0.17 * earthMass);
   }
}