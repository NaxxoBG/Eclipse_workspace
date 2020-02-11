package Task3January2010;

public interface InterfaceToTakeANumber
{
   /**Next customer number is taken, and then wait until it is the
    * customer's turn(with this number)
    */
   public void takeNextNumber(Customer customer);
   /**Returns the next number to be served
    * @return int
    */
   public int nextCustomer();
}