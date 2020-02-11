import java.util.ArrayList;

public class PhoneBill
{
   private String phoneNo;
   private ArrayList<BillableItem> items;

   public PhoneBill(String phoneNo) {
      this.phoneNo = phoneNo;
      this.items = new ArrayList<BillableItem>();
   }

   public String getPhoneNo() {
      return phoneNo;
   }

   public void setPhoneNo(String phoneNo) {
      this.phoneNo = phoneNo;
   }

   public void addItem(BillableItem item) {
      items.add(item);
   }

   public int getNumberOfItems() {
      return items.size();
   }

   public BillableItem getItem(int index) {
      return items.get(index);
   }

   public double getAmountDue() {
      double total = 0;
      for (BillableItem item : items) {
         total += item.getPrice();
      }
      return total;
   }

   public double getPhoneCallMinutes() {
      double total = 0;
      for (BillableItem item : items) {
         if (item instanceof PhoneCall) {
            total += ((PhoneCall) item).getMinutes();
         }
      }
      return total;
   }

   public ArrayList<TextMessage> getTextMessages() {
      ArrayList<TextMessage> messages = new ArrayList<>();
      for (BillableItem item : items) {
         if(item instanceof TextMessage) {
            messages.add((TextMessage) item);
         }
      }
      return messages;
   }
}