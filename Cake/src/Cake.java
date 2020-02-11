public class Cake
{
   private String name;
   private double weight;
   private double amountLeft;

   public Cake(String name, double weight) {
      this.name = name;
      this.weight = weight;
      amountLeft = 100;
   }

   public String getName() {
      return name;
   }

   public double getWeight() {
      return weight;
   }

   public double getAmountLeft() {
      return amountLeft;
   }

   public void eatPercentageAmount(double percentage) {
      if (percentage >= amountLeft) {
         weight = 0;
         amountLeft = 0;
      } else {
         double originalWeight = weight * 100 / amountLeft;
         amountLeft -= percentage;
         weight = originalWeight * (amountLeft / 100);
      }
   }

   public void eatAmount(double weight) { 
      if (weight > this.weight) {
         amountLeft = 0;
         this.weight = 0;
      } else {
         double percentage = ((this.weight - weight) / this.weight) * 100;
         amountLeft -= percentage;
         this.weight = this.weight * (amountLeft / 100);    
      }
   }

   public boolean isCakeGone() {
      return amountLeft <= 0;
   }

   public boolean equals(Object obj) {
      if (!(obj instanceof Cake)) {
         return false;
      } else {
         Cake other = (Cake) obj;
         return amountLeft == other.getAmountLeft() && weight == other.getWeight() && name.equals(other.getName());
      }
   }

   public void eat(double amount, char unit) {
      if (unit == '0') {
         eatAmount(amount);
      } else if (unit == '%') {
         eatPercentageAmount(amount);
      } else if(unit =='G') {
         eatAmount(amount);
      }
   }

   public static Cake makeRumBall(Cake cake1, Cake cake2) {
      double newWeight = cake1.getWeight() + cake2.getWeight();
      cake1.eatPercentageAmount(100);
      cake2.eatPercentageAmount(100);
      Cake rum = new Cake("Rum Ball", newWeight);
      return rum;
   }
}