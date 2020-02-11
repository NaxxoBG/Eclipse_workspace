public class Person
{
   private String name;
   private long money;
   private double weight;

   public Person(String name, long money, double weight) {
      this.name = name;
      this.money = money;
      this.weight = weight;
   }

   public String getName() {
      return name;
   }

   public long getMoney() {
      return money;
   }

   public double getWeight() {
      return weight;
   }
}