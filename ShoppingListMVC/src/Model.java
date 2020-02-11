import java.util.Scanner;

public class Model
{
   Scanner in;
   Item item = null;

   public Model() {
      in = new Scanner(System.in);
      item = new Item("", -1, -1);
   }

   public Item getItem() {
      return item;
   }

   public void addItem(String name, int price, int id) {
      item = new Item(name, price, id);
   }

   public String stringInput() {
      return in.nextLine();
   }

   public int intInput() {
      return in.nextInt();
   }
}