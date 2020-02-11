package realJavaBook;
import java.util.Scanner;

public class Exercise2 {
   public static void main(String[] args) {
      int num;
      System.out.println("Enter a  number:");
      Scanner input = new Scanner(System.in);
      num = input.nextInt();
      input.close();
      if (num % 5 == 0 && num % 7 == 0) {
         System.out.println(true);
      } else{
         System.out.println(false);
      }
   }
}