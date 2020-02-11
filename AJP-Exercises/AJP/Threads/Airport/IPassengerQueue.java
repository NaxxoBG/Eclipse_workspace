package Threads.Airport;

public interface IPassengerQueue
{
   public void putPassengerInQueue(Passenger p);
   public Passenger getNextPassenger();
}