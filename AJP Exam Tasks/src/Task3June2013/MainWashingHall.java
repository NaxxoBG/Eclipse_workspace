package Task3June2013;

public class MainWashingHall
{

   public static void main(String[] args) throws InterruptedException {
      WashingHall hall = new WashingHall();
      Thread display = new Thread(new DisplayThread(hall));

      display.start();

      for (int i = 1; i < 100; i++) {
         Thread car = new Thread(new CustomerCarThread(i, hall));
         Thread.sleep(2000);
         car.start();
      }
   }

}
