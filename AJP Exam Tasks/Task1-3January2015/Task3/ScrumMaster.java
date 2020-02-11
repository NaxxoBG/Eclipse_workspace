package Task3;

public class ScrumMaster implements Runnable
{
   private String name;
   PizzaMethods pizza;

   public ScrumMaster(String name, PizzaMethods pizza) {
      this.name = name;
      this.pizza = pizza;
   }

   public void run() {
      while (true) {
         pizza.orderAPizza();
         this.orderedPizza();
      }
   }

   private void orderedPizza() {
      System.out.println("Scrum master " + getName() + " has ordered a pizza");
   }

   public String getName() {
      return name;
   }
}