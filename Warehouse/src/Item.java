public abstract class Item
{
   private String name;
   private int amount;
   private int id;

   public Item(String name, int amount, int id) {
      this.name = name;
      this.amount = amount;
      this.id = id;
   }
   
   public String getName() {
      return name;
   }
   
   public int getAmount() {
      return amount;
   }
   
   public int getID() {
      return id;
   }

   public void incAmount(int amount) {
      this.amount -= amount;
   }

   public void decAmount(int amount) {
      this.amount += amount;
   }

   public abstract boolean equals(Object o);
}