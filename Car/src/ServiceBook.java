import java.util.ArrayList;

public class ServiceBook
{
   private ArrayList<Service> services;

   public ServiceBook() {
      services = new ArrayList<Service>();
   }

   public void addService(Service service) {
      services.add(service);
   }

   public int getNumberOfServices() {
      return services.size();
   }

   public Service getService(int index) {
      return services.get(index);
   }

   public ArrayList<Service> getAllServices() {
      return services;
   }

   public ArrayList<Integer> getAllServiceMilages() {
      ArrayList<Integer> list = new ArrayList<>(services.size());
      for (int i = 0; i < services.size(); i++) {
         list.add(services.get(i).getMileage());
      }
      return list;
   }

   public boolean hasServiceOnDate(Date date) {
      for (int i = 0; i < services.size(); i++) {
         if (services.get(i).getDate().equals(date)) {
            return true;
         }
      } 
      return false;
   }

   public Date getDateOfLastService() {
      Date last = services.get(0).getDate();
      for (Service service : services) {
         if (last.isBefore(service.getDate())) {
            last = service.getDate();
         }
      }
      return last;
   }
   
   public String toString() {
      return String.format("\nThe services are: %s", services);
   }

   public boolean equals(Object obj) {
      if (!(obj instanceof ServiceBook)) {
         return false;
      } else {
         ServiceBook other = (ServiceBook) obj;
         return services.equals(other.services);
      }
   }
}