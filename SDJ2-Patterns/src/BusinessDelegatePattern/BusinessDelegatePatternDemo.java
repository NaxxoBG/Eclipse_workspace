package BusinessDelegatePattern;

public class BusinessDelegatePatternDemo
{
   public static void main(String[] args) {
      BusinessDelegate businessDelegate = new BusinessDelegate();
      businessDelegate.setServiceType("message1");
      
      Client client = new Client(businessDelegate);
      client.doTask();
      
      businessDelegate.setServiceType("message2");
      client.doTask();
   }
}