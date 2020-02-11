package Task3January2016;

public class SuperMarket implements ISuperMarket
{
   String name;
   private int id = 1;
   CircularArray queue;
   Customer beingServed;

   public SuperMarket(String name) {
      this.name = name;
      queue = new CircularArray(100);
   }

   public synchronized void enterWaitingLine() {
      while (queue.isFull()) {
         try {
            System.out.println("The queue is full");
            wait();
         } catch (InterruptedException e) {}
      }
      Customer customer = new Customer(id, this);
      queue.put(customer);
      id++;
      System.out.println("Customer " + customer.getID() + " has entered the waiting line");
      notifyAll();
   }

   public synchronized void startNextServing() {
      while (queue.isEmpty()) {
         try {
            System.out.println("There is nobody to be served");
            wait();
         } catch (InterruptedException e) {}
      }
      Customer customer = queue.take();
      beingServed = customer;
      System.out.println("Customer with id " + customer.getID() + " is being served");
      this.sleep();
      notifyAll();
   }

   public synchronized void serviceFinished() {
      System.out.println("Customer " + beingServed.getID() + " was served");
   }
   
   public int getID() {
      return this.id;
   }
   
   private void sleep() {
      try {
         Thread.sleep(5000);
      } catch (InterruptedException e) {
      }
   }
}