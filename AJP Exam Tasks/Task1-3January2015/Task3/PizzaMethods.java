package Task3;

public class PizzaMethods implements IPizzaMethods
{
   private int sliceNum;
   private int pizzaSize;
   private boolean ordered = false;

   public PizzaMethods(int pizzaSize) {
      this.sliceNum = 0;
      this.pizzaSize = pizzaSize;
      this.ordered = false;
   }

   public synchronized void orderAPizza() {
      while (sliceNum > 0 || ordered) {
         try {
            wait();
         } catch (Exception e) {}
      }
      System.out.println("Number of slices: " + sliceNum);
      this.ordered = true;
      notifyAll();
   }

   public synchronized void getAPizzaSlice() {
      while (sliceNum == 0) {
         try {
            wait();
         } catch (InterruptedException e) {}
      }
      this.sliceNum--;
      System.out.println("Slices left: " + sliceNum);
      if (sliceNum == 0) {
         System.out.println("No slices left");
         notifyAll(); 
      }
   }

   public synchronized void receiveAPizzaOrder() {
      while (!ordered) {
         try {
            wait();
         } catch (InterruptedException e) {}
      }
   }

   public synchronized void deliverAPizza() {
      this.sliceNum += pizzaSize;
      this.ordered = false;
      notifyAll();
   }
}