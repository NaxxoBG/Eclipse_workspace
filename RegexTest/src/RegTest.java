import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTest
{
   public static void main(String[] args) {
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      String regex = "^(\\D*?)(?:(?:0?)[1-9]|[123][01]|[12][1-9])\\D+(?:(?:(?:0?)[1-9])|(?:[1][012]))\\D+(:?[2][0][12](?:(?:0)|(?:[6-9])))$";
      Pattern pattern = Pattern.compile(regex);
      String date = in.nextLine();
      Matcher matcher = pattern.matcher(date);
      while (true) {
         if (!matcher.matches()) {
            System.out.println("Wrong date");
            System.out.println("\nEnter a date to test the regex");
            date = in.nextLine();
            matcher = pattern.matcher(date);
         } else {
            System.out.println("Date is correct");
            System.out.println("\nEnter a date to test the regex");
            date = in.nextLine();
            matcher = pattern.matcher(date);
         }
      }
   }
}