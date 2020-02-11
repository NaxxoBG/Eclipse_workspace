public class Credit
{
   private double amount;

   public Credit(double amount) {
      this.amount = amount;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }

   public double getAmount() {
      return amount;
   }

   public String toString() {
      return "Credit [ amount = " + amount + " ]";
   }  
}