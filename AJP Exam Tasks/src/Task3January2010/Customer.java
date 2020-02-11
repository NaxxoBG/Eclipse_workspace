package Task3January2010;

/**Customer thread which takes a number and then is served
 * @author Naxxo
 */
public class Customer extends Thread
{
   TakeANumber monitor;
   int id;
   int clientNumber;

   public Customer(TakeANumber monitor, int id) {
      this.monitor = monitor;
      this.id = id;
   }
   
   public void setNum(int num){
      clientNumber = num;
   }

   public void run() {
      monitor.takeNextNumber(this);
      while (true){
         if (monitor.numberToBeServed == clientNumber){
            System.out.println("Customer " + id + " with number "+clientNumber +" has been served");
            break;
         }
      }
   }
}