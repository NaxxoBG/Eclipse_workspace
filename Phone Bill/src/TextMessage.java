public class TextMessage extends BillableItem
{
   private double smsPrice;
   private double extraCharges;

   public TextMessage(String date, String recipientNo, double smsPrice, double extraCharges) {
      super(date, recipientNo);
      this.smsPrice = smsPrice;
      this.extraCharges = extraCharges;
   }

   public double getSmsPrice() {
      return smsPrice;
   }

   public double getExtraCharges() {
      return extraCharges;
   }

   public double getPrice() {
      return smsPrice + extraCharges;
   }
}