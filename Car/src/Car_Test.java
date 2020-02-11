public class Car_Test
{

   public static void main(String[] args)
   {
      Date date1 = new Date(7,4,1980);
      Date date2 = new Date(4,6,2014);
      
      Service service1 = new Service(2500, date1);
      Service service2 = new Service(6000, date2);
      
      Car car = new Car("AH4683", 13000);
      
      ServiceBook book1 = new ServiceBook();
      book1.addService(service1);
      book1.addService(service2);
      
      System.out.println(service2);
      
      System.out.println(book1);
      System.out.println(book1.getNumberOfServices());
      car.service(book1);
      System.out.println(car.getServiceBook());
      System.out.println(car.getServiceBook().getDateOfLastService());
      System.out.println(car.getServiceBook().getAllServiceMilages());
      System.out.println(car.getServiceBook().getService(1).getDate().numberOfDaysInMonth());
   }

}
