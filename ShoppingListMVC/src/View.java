public class View
{
   public void updateView(Item item) {
      System.out.println("Name " + item.name);
      System.out.println("Price " + item.price);
      System.out.println("ID " + item.id);
   }

   public void updateView(String item) {
      System.out.println(item);
   }

   public void added() {
      System.out.println("Item added");
   }

   public void removed() {
      System.out.println("Item removed");
   }

   public void addName() {
      System.out.println("Enter the name of the item");
   }

   public void addId() {
      System.out.println("Give your item an id");
   }

   public void addPrice() {
      System.out.println("Add a price to your item");
   }
}