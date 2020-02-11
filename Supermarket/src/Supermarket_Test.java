import java.util.Arrays;

public class Supermarket_Test
{
   public static void main(String[] args)
   {
      Cashier cash1 = new Cashier("John", 3000);
      Cashier cash2 = new Cashier("Mike", 3000);
      Cashier cash3 = new Cashier("Bill", 3000);
      Cashier cash4 = new Cashier("Louis", 3000);

      Cashier[] cash = {cash1, cash2, cash3, cash4};

      Manager manager1 = new Manager("Nick", 7000);

      Supermarket market1 = new Supermarket("Kaufland", "Street1", manager1, cash);

      System.out.println(market1);

      System.out.println(Arrays.toString(market1.getCashiers()));
      System.out.println(market1.getTotalSalary());
      System.out.println(market1.getManager());
   }
}