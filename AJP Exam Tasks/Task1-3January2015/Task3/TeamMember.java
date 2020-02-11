package Task3;

import java.util.concurrent.ThreadLocalRandom;

public class TeamMember implements Runnable
{
   private String name;
   private PizzaMethods pizza;

   public TeamMember(String name, PizzaMethods pizza) {
      this.name = name;
      this.pizza = pizza;
   }

   public void run() {
      while (true) {
         pizza.getAPizzaSlice();
         this.eatingSlice();
      }
   }

   private void eatingSlice() {
      System.out.println("Team member " + getName() + " has started eating a slice");
      try {
         Thread.sleep(ThreadLocalRandom.current().nextInt(3000, 6001));
      } catch (InterruptedException e) {}
      System.out.println("Team member " + getName() + " has finished eating a slice");
   }

   public String getName() {
      return name;
   }
}