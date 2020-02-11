package Integrate;

public class Test
{
   static Function F1 = x -> Math.pow(x, 3);
   static Function F2 = x -> Math.pow(x, 2) - 2;

   public static void main(String[] args) {
      System.out.println("--------------------------------------");
      System.out.printf("%.2f\n", Integrate.leftSum(new F1(), 0, 2, 100));
      System.out.printf("%.2f\n", Integrate.rightSum(new F2(), 0, 3, 100));
      System.out.println("--------------------------------------");
      System.out.printf("%.2f\n", Integrate.leftSum(F1, 0, 2, 100));
      System.out.printf("%.2f\n", Integrate.rightSum(F2, 0, 3, 100));
      System.out.println("--------------------------------------");
      System.out.printf("%.2f\n", Integrate.leftSum(x -> Math.pow(x, 3), 0, 2, 100));
      System.out.printf("%.2f\n", Integrate.rightSum(x -> Math.pow(x, 2) - 2, 0, 3, 100));
   }
}