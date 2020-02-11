import java.util.ArrayDeque;
import java.util.Queue;

public class LoanShark
{
   private double interestRate;
   private double capital;
   private double minCreditSum;
   private ArrayDeque<Credit> queueOfCredits;
   private int numberOfDays;
   private static final int END_OF_YEAR = 365;

   public LoanShark(double interestRate, double capital, double minCreditSum, int numberOfDays) {
      this.interestRate = interestRate;
      this.capital = capital;
      this.minCreditSum = minCreditSum;
      this.numberOfDays = numberOfDays;
      this.queueOfCredits = new ArrayDeque<Credit>();
   }

   public void addCredit(Credit credit) {
      this.queueOfCredits.addLast(credit);
   }

   public int getNumberOfDays() {
      return this.numberOfDays;
   }

   public void setNumberOfDays(int days) {
      this.numberOfDays = days;
   }

   public double getInterestRate() {
      return interestRate;
   }

   public double getCapital() {
      return capital;
   }

   public double getMinCreditSum() {
      return minCreditSum;
   }

   public void setInterestRate(double interestRate) {
      this.interestRate = interestRate;
   }

   public void setCapital(double capital) {
      this.capital = capital;
   }

   public void setMinCreditSum(double minCreditSum) {
      this.minCreditSum = minCreditSum;
   }

   public int getNumberOfCredits() {
      return queueOfCredits.size();
   }

   public Queue<Credit> getAllCredits() {
      return this.queueOfCredits;
   }

   public double profit() {
      double interestToReceive = 0;
      int days = 0;
      Credit credit;

      if (this.minCreditSum > this.capital) {
         System.out.println("You do not have enough money to give your first credit");
         return 0.0;
      } else {
         while (capital - minCreditSum >= 0 && days < END_OF_YEAR - numberOfDays) {
            if (days >= this.getNumberOfDays()) {
               credit = this.queueOfCredits.poll();
               this.setCapital(capital + credit.getAmount() + this.profitFromReturnedCredit(credit));
            }

            capital -= minCreditSum;

            //??????????????????
            if (days <= getNumberOfCredits()) {
               interestToReceive += getNumberOfCredits() * minCreditSum * interestRate;
            }
            //??????????????????

            this.addCredit(new Credit(minCreditSum));
            days++;
            this.printInfoToConsole(interestToReceive, days);

            //??????????????????
            /*if (this.getNumberOfCredits() == this.numberOfDays) {
               double tempMinCreditSum = minCreditSum;
               minCreditSum = capital;
               interestToReceive = minCreditSum * interestRate + tempMinCreditSum * interestRate * getNumberOfCredits();
               System.out.println("Reassigning minCreditSum on day: " + days);
            }*/
            //??????????????????
         }
         days++;
      }
      this.getProfitFromLeftCredits(interestToReceive, days);
      return interestToReceive;
   }

   private double profitFromReturnedCredit(Credit credit) {
      return credit.getAmount() * interestRate * numberOfDays;
   }

   private void getProfitFromLeftCredits(double interestToReceive, int days) {
      for (Credit credit : this.getAllCredits()) {
         this.getAllCredits().poll();
         this.setCapital(capital + this.profitFromReturnedCredit(credit));
         this.printInfoToConsole(interestToReceive, days);
         days++;
      }
   }

   private void printInfoToConsole(double interestToReceive, int days) {
      System.out.println();
      System.out.println("Profit: " + interestToReceive);
      System.out.println("Number of credits " + this.getNumberOfCredits());
      System.out.println("Capital: " + this.getCapital());
      System.out.println("Day number: " + days);
      System.out.println();
   }
}