package Chapter_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_9_Num_String
{
   public static void main(String[] args)
   {
      //@SuppressWarnings("resource")

      int a, b, c, num;

      do {
         try {
            @SuppressWarnings("resource")
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number from this range (0-999)");
            num = in.nextInt();


            while (num <= -1 || num > 999) {
               System.out.println("Enter a number from this range (0-999)");
               num = in.nextInt();
            }

            // a is hundreds, b is tens, c is ones(in 147, a = 1, b = 4, c = 7)
            a = (num / 100) % 10;
            b = (num % 100) / 10;
            c = num % 10;

            // stringify the integer(the number) so it could be split
            String number = Integer.toString(num); 
            // array that holds the digit of the number(number is 479, array holds [4, 7, 9])
            String[] digits = number.split(""); 

            String[] elevenTwentyString = {"Единадесет", "Дванадесет", "Тринадесет", "Четиринадесет", "Петнадесет", "Шестнадесет",
                  "Седемнадесет", "Осемнадесет", "Деветнадесет", "Двадесет"};

            String[] onesString = {"Нула", "Едно", "Две","Три", "Четири", "Пет", "Шест", "Седем", "Осем", "Девет"};

            String[] tensString = {"Десет","Двадесет", "Тридесет", "Четиридесет", "Петдесет", "Шестдесет", "Седемдесет",
                  "Осемдесет", "Деветдесет"};

            String[] hundredsString = {"Сто", "Двеста", "Триста", "Четиристотин", "Петстотин", "Шестстотин", "Седемстотин", "Осемстотин",
            "Деветстотин"};

            ArrayList<String> hundredsIter = new ArrayList<>();
            ArrayList<String> tensIter = new ArrayList<>();
            ArrayList<String> onesIter = new ArrayList<>();
            ArrayList<String> elevenTwentyIter = new ArrayList<>();


            System.out.println("hundreds(a) = " + a);
            System.out.println("tens(b) = " + b);
            System.out.println("ones(c) = " + c);
            System.out.println("number of digits = " + digits.length + "\n");

            if (digits.length == 2) {
               a = 0;
            }
            //a
            switch (a) {
               case 0:  switch (num) {
                  case 10: elevenTwentyIter.add(tensString[0]);
                  case 11: elevenTwentyIter.add(elevenTwentyString[0]);
                  case 12: elevenTwentyIter.add(elevenTwentyString[1]);            
                  case 13: elevenTwentyIter.add(elevenTwentyString[2]);         
                  case 14: elevenTwentyIter.add(elevenTwentyString[3]);            
                  case 15: elevenTwentyIter.add(elevenTwentyString[4]);           
                  case 16: elevenTwentyIter.add(elevenTwentyString[5]);          
                  case 17: elevenTwentyIter.add(elevenTwentyString[6]);           
                  case 18: elevenTwentyIter.add(elevenTwentyString[7]);
                  case 19: elevenTwentyIter.add(elevenTwentyString[8]);
                  case 20: elevenTwentyIter.add(tensString[1]);           
                  case 30: elevenTwentyIter.add(tensString[2]);
                  case 40: elevenTwentyIter.add(tensString[3]);
                  case 50: elevenTwentyIter.add(tensString[4]);
                  case 60: elevenTwentyIter.add(tensString[5]);
                  case 70: elevenTwentyIter.add(tensString[6]);
                  case 80: elevenTwentyIter.add(tensString[7]);
                  case 90: elevenTwentyIter.add(tensString[8]);
               }
               case 1:  hundredsIter.add(hundredsString[0]);
               case 2:  hundredsIter.add(hundredsString[1]);
               case 3:  hundredsIter.add(hundredsString[2]);
               case 4:  hundredsIter.add(hundredsString[3]);
               case 5:  hundredsIter.add(hundredsString[4]);
               case 6:  hundredsIter.add(hundredsString[5]);
               case 7:  hundredsIter.add(hundredsString[6]);
               case 8:  hundredsIter.add(hundredsString[7]);
               case 9:  hundredsIter.add(hundredsString[8]);

               //b
               switch (b) {
                  case 0:  tensIter.add(onesString[0]);
                  case 1:  tensIter.add(tensString[0]);
                  case 2:  tensIter.add(tensString[1]);
                  case 3:  tensIter.add(tensString[2]);
                  case 4:  tensIter.add(tensString[3]);
                  case 5:  tensIter.add(tensString[4]);
                  case 6:  tensIter.add(tensString[5]);
                  case 7:  tensIter.add(tensString[6]);
                  case 8:  tensIter.add(tensString[7]);
                  case 9:  tensIter.add(tensString[8]);

                  //c
                  switch (c) {
                     case 0: onesIter.add(onesString[0]);
                     break;
                     case 1: onesIter.add(onesString[1]);
                     break;
                     case 2: onesIter.add(onesString[2]);
                     break;
                     case 3: onesIter.add(onesString[3]);              
                     break;
                     case 4: onesIter.add(onesString[4]);             
                     break;
                     case 5: onesIter.add(onesString[5]);             
                     break;
                     case 6: onesIter.add(onesString[6]);              
                     break;
                     case 7: onesIter.add(onesString[7]);           
                     break;
                     case 8: onesIter.add(onesString[8]);             
                     break;
                     case 9: onesIter.add(onesString[9]);              
                     break;
                  }
                  break;
               }
               break;
            }

            if (digits.length == 3) {
               if (tensIter.get(0).equals("Десет") && c == 0) {
                  System.out.println(num + " --> " + hundredsIter.get(0) + " и " + tensIter.get(0));                 
               } else if (tensIter.get(0).equals("Десет") && c != 0) {
                  System.out.println(num + " --> " + hundredsIter.get(0) + " и " + elevenTwentyString[--c]);
               } else if (b == 0 && c == 0) {
                  System.out.println(num + " --> " + hundredsIter.get(0));
               } else if (b == 0) {
                  System.out.println(num + " --> " + hundredsIter.get(0) + " и " + onesIter.get(0));
               }  else if (c == 0) {
                  System.out.println(num + " --> " + hundredsIter.get(0) + " и " + tensIter.get(0));
               } else {
                  System.out.println(num + " --> " + hundredsIter.get(0) + " " + tensIter.get(0) + " и " + onesIter.get(0));
               }
            } else if (digits.length == 2) {
               if (b != 0 && c == 0) {
                  System.out.println(num + " --> " + elevenTwentyIter.get(0));
               } else if (elevenTwentyIter.size() == 0) {
                  System.out.println(num + " --> " + tensIter.get(0) + " и " + onesIter.get(0));
               } else if (b != 0 && c != 0) {
                  System.out.println(num + " --> " + elevenTwentyIter.get(0));
               }
            } else if (digits.length == 1) {
               System.out.println(num + " --> " + onesIter.get(0));
            }
         }
         catch (Exception e) {
            System.out.println("Invalid input!\nPlease, enter an integer from the range(0-999)");
            @SuppressWarnings("resource")
            Scanner in = new Scanner(System.in);
            if (in.hasNextInt()) {
               System.out.println("You got it! Now enter your number.");
            }
            num = in.nextInt();
         }
      } while (true);
   }
}