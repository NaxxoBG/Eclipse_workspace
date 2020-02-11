import java.util.Scanner;

public class Exception_2
{
   public static void main(String[] args)
   {
      String s;
      int sum = 0;
      Scanner input = new Scanner(System.in);

      while (true) {
         s = input.nextLine();
         if (s.equals("end")) {
            break;
         } 

         try {
            sum += Integer.parseInt(s);
            System.out.println(sum);
         }
         catch (NumberFormatException e) {
            System.out.println("Wrong input!");
            input.nextLine();
         }
      }
      System.out.println("The end");
      input.close();
   }
}