package Task3;

import java.util.concurrent.ThreadLocalRandom;

public class PizzaGuy implements Runnable
{
   String name;
   PizzaMethods pizza;

   public PizzaGuy(String name, PizzaMethods pizza) {
      this.name = name;
      this.pizza = pizza;
   }

   public void run() {
      while (true) {
         pizza.receiveAPizzaOrder();
         this.orderReceived();
         pizza.deliverAPizza();
         this.pizzaDelivered();
      }
   }

   private void orderReceived() {
      try {
         System.out.println("Pizza guy " + name + " has received a pizza order");
         System.out.println("The pizza is being made");
         Thread.sleep(ThreadLocalRandom.current().nextInt(3000, 6000));
      } catch (InterruptedException e) {}
   }

   private void pizzaDelivered() {
      System.out.println("Pizza guy " + name + " has delivered a pizza");
   }
}