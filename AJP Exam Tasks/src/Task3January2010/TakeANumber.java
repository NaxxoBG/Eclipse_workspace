package Task3January2010;

import java.util.concurrent.ThreadLocalRandom;

public class TakeANumber implements InterfaceToTakeANumber
{
   int customerNumber;
   int numberToBeServed;

   public synchronized void takeNextNumber(Customer customer) {
     customer.setNum(++customerNumber);
     try {
      wait();
   }
   catch (InterruptedException e) {
      e.printStackTrace();
   }
      
   }

   public synchronized int nextCustomer() {
      numberToBeServed++;
      notifyAll();
      try {
         Thread.sleep(ThreadLocalRandom.current().nextInt(3000, 5001));
      } catch (InterruptedException e) {}    
      return numberToBeServed;
   }
}