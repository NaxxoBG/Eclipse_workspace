package BusinessDelegatePattern;

public class ServiceMessage1 implements BusinessService
{
   public void doProcessing() {
      System.out.println("Printing message 1");
   }
}