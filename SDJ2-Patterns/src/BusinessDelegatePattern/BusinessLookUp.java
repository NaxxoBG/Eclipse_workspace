package BusinessDelegatePattern;

public class BusinessLookUp
{
   public BusinessService getBusinessService(String serviceType) {
      if (serviceType.equalsIgnoreCase("message1")) {
         return new ServiceMessage1();
      }
      else {
         return new ServiceMessage2();
      }
   }
}
