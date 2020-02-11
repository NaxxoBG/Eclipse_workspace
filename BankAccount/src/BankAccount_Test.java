import java.util.Scanner;
public class BankAccount_Test
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double balance, interestRate;

      System.out.println("What is your starting balance?");
      balance = input.nextDouble();

      System.out.println("What is your monthly interest rate?");
      interestRate = input.nextDouble();

      BankAccount account = new BankAccount(balance, interestRate);
      BankAccount account2 = new BankAccount();

      System.out.println("Will you deposit your salary?");
      account.deposit(input.nextDouble());

      System.out.println("Your current balance is " + account.getBalance());
      account.withdraw(300);
      account.addInterest();

      System.out.println("If we add the interest it becomes " + account.getBalance());
      System.out.println(account2.getBalance());
      input.close();
   }
}