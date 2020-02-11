package Chapter_5;

import java.util.Scanner;

public class Exercise_4
{
   public static void main(String[] args)
   {
      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);
      int a;
      System.out.println("Enter a number");
      a = in.nextInt();

      switch (a) {
         case 1:
            System.out.println("Едно");
            break;
         case 2:
            System.out.println("Две");
            break;
         case 3:
            System.out.println("Три");
            break;
         case 4:
            System.out.println("Четири");
            break;
         case 5:
            System.out.println("Пет");
            break;
         case 6:
            System.out.println("Шест");
            break;
         case 7:
            System.out.println("Седем");
            break;
         case 8:
            System.out.println("Осем");
            break;
         case 9:
            System.out.println("Девет");
            break;
         case 10:
            System.out.println("Десет");
            break;
         default:
            System.out.println("Please choose a number between 0-9.");
            break;
      }
   }
}