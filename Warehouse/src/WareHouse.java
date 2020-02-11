import java.util.ArrayList;

public class WareHouse
{
   private String address;
   private int telephoneNo;
   private ArrayList<Item> items;

   public WareHouse(String address, int telephoneNo, ArrayList<Item> items) {
      this.address = address;
      this.telephoneNo = telephoneNo;
      this.items = items;
   }

   public void addItem(Item item) {
      items.add(item);
   }

   public Item getItemByName(String name) {
      for (Item item : items) {
         if (item.getName().equals(name)) {
            return item;
         }
      }
      return null;
   }

   public Item getItemByID(int id) {
      for (Item item : items) {
         if (item.getID() == id) {
            return item;
         }
      }
      return null;
   }

   public Food[] getAllFoods() {
      ArrayList<Food> foods = new ArrayList<>();
      for (Item item : items) {
         if (item instanceof Food) {
            foods.add((Food) item);
         }
      }
      return (Food[]) foods.toArray();
   }

   public Electronic[] getAllElectronics() {
      ArrayList<Electronic> electronics = new ArrayList<>();
      for (Item item : items) {
         if (item instanceof Electronic) {
            electronics.add((Electronic) item);
         }
      }
      return (Electronic[]) electronics.toArray();
   }

   public int getTotalAmount() {
      int total = 0;
      for (Item item : items) {
         total += item.getAmount();
      }
      return total;
   }

   public Item getItemWithHighestAmount() {
      int highest = items.get(0).getAmount();
      for (int i = 0; i < items.size(); i++) {
         if (items.get(i).getAmount() > highest) {
            highest = items.get(i).getAmount();
         }
      }

      for (Item item : items) {
         if (item.getAmount() == highest) {
            return item;
         }
      }
      return null;
   }

   public String getAddress() {
      return address;
   }

   public int getTelephoneNo() {
      return telephoneNo;
   }

   public ArrayList<Item> getItems() {
      return items;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public void setTelephoneNo(int telephoneNo) {
      this.telephoneNo = telephoneNo;
   }

   public void setItems(ArrayList<Item> items) {
      this.items = items;
   }
}