import java.util.ArrayList;

public class ItemList
{
   private ArrayList<Item> items;
   private int maxNumberOfItems;
   private int numberOfItems;

   public ItemList(int maxNumberOfItems) {
      items = new ArrayList<>(maxNumberOfItems);
      this.maxNumberOfItems = maxNumberOfItems;
   }

   public void addItem(Item item) {
      items.add(item);
   }

   public Book[] getAllBooks() {
      ArrayList<Book> books = new ArrayList<>();
      for (Book book : books) {
         if (book instanceof Book) {
            books.add(book);
         }
      }
      return (Book[]) books.toArray();
   }

   public DVD[] getAllDVDs() {
      ArrayList<DVD> dvds = new ArrayList<>();
      for (DVD dvd : dvds) {
         if (dvd instanceof DVD) {
            dvds.add(dvd);
         }
      }
      return (DVD[]) dvds.toArray();
   }

   public boolean equals(Object o) {
      if (!(o instanceof ItemList)) {
         return false;
      } else {
         ItemList other = (ItemList) o;
         return items.equals(other.items) && maxNumberOfItems == other.maxNumberOfItems && numberOfItems == other.numberOfItems;
      }
   }

   public String toString() {
      return "ItemList [items=" + items + ", maxNumberOfItems="
            + maxNumberOfItems + ", numberOfItems=" + numberOfItems + "]";
   }
}