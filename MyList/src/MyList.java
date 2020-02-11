import java.util.ArrayList;

public class MyList
{
   private ArrayList<String> items;

   public MyList() {
      this.items = new ArrayList<String>();
   }

   public void addItem(String item) {
      items.add(item);
   }

   public String removeItem(String item) {
      items.remove(item);
      return item + " has been removed!";
   }

   public String removeItem(int index) {
      String removed = items.get(index);
      items.remove(index);
      return removed + " has been removed";
   }


   public int size() {
      return items.size();
   }

   public boolean isEmpty() {
      if (items.size() == 0) {
         return true;
      } else {
         return false;
      }
   }

   public boolean contains(String item) {
      for (int i = 0; i < items.size(); i++) {
         if (items.get(i).equals(item)) {
            return true;
         } 
      } return false;
   }

   public String toString() {
      if (isEmpty()) {
         return "The list is empty.";
      } else {
         return "MyList [items=" + items + "]";
      }
   }
}