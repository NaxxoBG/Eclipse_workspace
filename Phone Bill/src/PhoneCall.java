public class PhoneCall extends BillableItem
{
   public int minutes;
   public double pricePerMinute;

   public PhoneCall(String date, String recipientNo, int minutes, double pricePerMinute) {
      super(date, recipientNo);
      this.minutes = minutes;
      this.pricePerMinute = pricePerMinute;
   }

   public int getMinutes() {
      return minutes;
   }

   public double getPricePerMinute() {
      return pricePerMinute;
   }

   public double getPrice() {
      return pricePerMinute * minutes;
   }
}