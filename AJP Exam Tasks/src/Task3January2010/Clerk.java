package Task3January2010;

/**Clerk thread that gets the next customer number and then serves
 * him/her
 * @author Naxxo
 */
public class Clerk extends Thread
{
   TakeANumber monitor;
   int id;

   public Clerk(TakeANumber monitor, int id) {
      this.monitor = monitor;
      this.id = id;
   }

   public void run() {
      while (true) {
         monitor.nextCustomer();
         System.out.println("Clerk " + id + " is serving a client with number " + monitor.numberToBeServed);
      }
   }
}