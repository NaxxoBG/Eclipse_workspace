public abstract class BillableItem
{
   private String date;
   private String recipientNo;

   public BillableItem(String date, String recipientNo) {
      this.date = date;
      this.recipientNo = recipientNo;
   }

   public String getDate() {
      return date;
   }

   public String getRecipientNo() {
      return recipientNo;
   }

   public abstract double getPrice();
}