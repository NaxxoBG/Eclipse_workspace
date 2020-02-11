import java.util.Scanner;

public class Main
{
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Please, enter starting capital");
      double capital = in.nextDouble();
      System.out.println("Please, enter days of loan");
      int numberOfDays = in.nextInt();
      System.out.println("Please, enter daily interest");
      double interestRate = in.nextDouble();
      while (interestRate < 0.005 || interestRate > 0.03) {
         System.out.println("Please, enter an interest in the range(0.005 - 0.03)");
         interestRate = in.nextDouble();
      }
      System.out.println("Please, enter minimal credit sum");
      double minCreditSum = in.nextDouble();

      LoanShark loanShark = new LoanShark(interestRate, capital, minCreditSum, numberOfDays);
      loanShark.profit();
      in.close();
   }
}