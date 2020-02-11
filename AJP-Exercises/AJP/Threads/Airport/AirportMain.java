package Threads.Airport;

public class AirportMain
{
   public static void main(String[] args) {
      PassengerQueue usQueue = new PassengerQueue();
      PassengerQueue nonUsQueue = new PassengerQueue();

      Guide guide = new Guide(usQueue, nonUsQueue);
      PassportController controller = new PassportController(usQueue, "US Control");
      PassportController controller2 = new PassportController(nonUsQueue, "Non-US control");

      guide.start();
      try {
         Thread.sleep(5000);
      }
      catch (InterruptedException e) {}
      controller.start();
      controller2.start();
   }
}