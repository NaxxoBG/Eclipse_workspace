package Threads.Airport;

import Threads.CarLane.RandomGenerator;

public class PassportController extends Thread
{
   private PassengerQueue queue;
   @SuppressWarnings("unused")
   private String controllerName;
   private Passenger passenger;

   public PassportController(PassengerQueue queue, String controllerName) {
      this.queue = queue;
      this.controllerName = controllerName;
   }

   public void run() {
      while (true) {
         passenger = queue.getNextPassenger();
         this.control(passenger);
      }
   }

   private void control(Passenger passenger) {
      System.out.printf("%nPassenger from country %s with passport number %d has passed control%n", passenger.getNationality(), passenger.getPassportNumber());
      try {
         Thread.sleep(RandomGenerator.randomGenerator(5));
      } catch (InterruptedException e) {}
   }
}