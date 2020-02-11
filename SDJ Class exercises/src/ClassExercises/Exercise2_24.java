package ClassExercises;

public class Exercise2_24
{

   public static void main(String[] args)
   {
     int x = 4759, amount = 0, y = 16, total = 540;
     
     System.out.println(x += 6);
     System.out.println(amount -= 4);
     System.out.println(y *= 4);
     System.out.println(total /= 27);
     System.out.println(x %= 7 / 7);
     
     int totalPay, basePay = 500, bonus = 1000;
     totalPay = basePay + bonus;
     System.out.println(totalPay);
     
     float a;
     double b = 4.0;
     a = (float)b;
     System.out.println(a);
   }

}
