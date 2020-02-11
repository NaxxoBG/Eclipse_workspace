package ClassExercises;
import java.util.Scanner;
public class Exercise7_02
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int month, day;
      
      
      System.out.println("Please type a month (1-12): ");
      month = input.nextInt();
      
      while (month < 1 || month > 12) {
        System.out.println("Please type a month in the range (1-12):");
        month = input.nextInt();
      }
      
      System.out.println("Please type a day (1-31): ");
      day = input.nextInt();
      
      while (day < 1 || day > 31) {
         System.out.println("Please type a day in the range (1-31):");
         day = input.nextInt();
       }
        
      if       (day >= 21 && month == 3 || day <= 19 && month == 4) {
        System.out.println("If your birthday is " + day + "/" + month + " then your star sign is Aries");
      } 
       else if (day >= 20 && month == 4 || day <= 20 && month == 5) {
        System.out.println("If your birthday is " + day + "/" + month + " then your star sign is Taurus");
      } 
       else if (day >= 21 && month == 5 || day <= 20 && month == 6) {
        System.out.println("If your birthday is " + day + "/" + month + " then your star sign is Gemini");
      } 
       else if (day >= 21 && month == 6 || day <= 22 && month == 7) {
        System.out.println("If your birthday is " + day + "/" + month + " then your star sign is Cancer");
      }  
       else if (day >= 23 && month == 7 || day <= 22 && month == 8) {
        System.out.println("If your birthday is " + day + "/" + month + " then your star sign is Leo");     
      } 
       else if (day >= 23 && month == 8 || day <= 22 && month == 9) {
        System.out.println("If your birthday is " + day + "/" + month + " then your star sign is Virgo");
      }
       else if (day >= 23 && month == 9 || day <= 22 && month == 10) {
        System.out.println("If your birthday is " + day + "/" + month + " then your star sign is Libra");
      }
       else if (day >= 23 && month == 10 || day <= 21 && month == 11) {
        System.out.println("If your birthday is " + day + "/" + month + " then your star sign is Scorpio");
      }
       else if (day >= 22  && month == 11 || day <= 21 && month == 12) {
          System.out.println("If your birthday is " + day + "/" + month + " then your star sign is Sagittarius");
      }
       else if (day >= 22 && month == 12 || day <= 19 && month == 1) {
          System.out.println("If your birthday is " + day + "/" + month + " then your star sign is Capricorn");
      } 
       else if (day >= 20 && month == 1 || day <= 18 && month == 2) {
         System.out.println("If your birthday is " + day + "/" + month + " then your star sign is Aquarius");
      } 
       else if (day >= 19 && month == 2 || day <= 20 && month == 3) {
         System.out.println("If your birthday is " + day + "/" + month + " then your star sign is Pisces");
      }
      input.close();
   }
}