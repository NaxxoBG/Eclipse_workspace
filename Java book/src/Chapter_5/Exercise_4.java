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
            System.out.println("����");
            break;
         case 2:
            System.out.println("���");
            break;
         case 3:
            System.out.println("���");
            break;
         case 4:
            System.out.println("������");
            break;
         case 5:
            System.out.println("���");
            break;
         case 6:
            System.out.println("����");
            break;
         case 7:
            System.out.println("�����");
            break;
         case 8:
            System.out.println("����");
            break;
         case 9:
            System.out.println("�����");
            break;
         case 10:
            System.out.println("�����");
            break;
         default:
            System.out.println("Please choose a number between 0-9.");
            break;
      }
   }
}