package ClassExercises;

import java.util.Scanner;

public class Exercise3_12
{
   public static void main(String[] args)
   {
      int grade;
      String eqgrade;
      Scanner input = new Scanner(System.in);

      System.out.println("Enter grade:");
      grade = input.nextInt();

      switch (grade) {
         case -3 : eqgrade = "F" ;
         break;
         case 0 : eqgrade = "Fx" ;
         break;
         case 2 : eqgrade = "E";
         break;
         case 4 : eqgrade = "D" ;
         break;
         case 7 : eqgrade = "C";
         break;
         case 10 : eqgrade = "B";
         break;
         case 12 : eqgrade = "A";
         break;
         default: eqgrade = "Invalid grade";
         break;
      }

      System.out.println("The equivalent grade is: " + eqgrade);
      input.close();
   }
}