package ClassExercises;
import java.util.Scanner;
public class Exercise4_04
{

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String a, b, c, d, e, f;
      
      
      System.out.println("Enter strings:\nstring1:\nstring2:\nstring3:\n"
            + "string4:\nstring5:\nstring6:\n");
      
      a = input.nextLine();
      b = input.nextLine();
      c = input.nextLine();
      d = input.nextLine();
      e = input.nextLine();
      f = input.nextLine();
      
      input.close();
      
      int charnum1 = a.length();
      int charnum2 = b.length();
      int charnum3 = c.length();
      int charnum4 = d.length();
      int charnum5 = e.length();
      int charnum6 = f.length();
      
      
      System.out.println(charnum1 + charnum2 + charnum3 + charnum4 + charnum5 + charnum6);
   
   }

}
