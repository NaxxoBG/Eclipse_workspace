package Threads.Airport;

import java.util.ArrayDeque;
import java.util.Deque;

public class PassengerQueue implements IPassengerQueue
{
   Deque<Passenger> queue;

   public PassengerQueue() {
      this.queue = new ArrayDeque<Passenger>();
   }

   public synchronized void putPassengerInQueue(Passenger passenger) {
      queue.push(passenger);
      if (queue.size() == 1) {
         notifyAll();
      }
   }

   public synchronized Passenger getNextPassenger() {
      while (queue.size() == 0) {
         try {
            wait();
         } catch (InterruptedException e) {}
      }
      return (Passenger) queue.remove();
   }
}