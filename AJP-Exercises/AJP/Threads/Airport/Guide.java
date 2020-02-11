package Threads.Airport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Guide extends Thread
{
   private PassengerQueue us, nonUs;
   private Passenger passenger;
   private static final String[] COUNTRY = {"DK", "US", "BG", "GB", "FI", "FR", "CA", "DE", "SE", "CH"};
   private static List<Integer> passportNumber = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

   public Guide(PassengerQueue us, PassengerQueue nonUs) {
      this.us = us;
      this.nonUs = nonUs;
   }

   public void run() {
      while (true) {
         passenger = appear();
         countryCheck(passenger);
      }
   }

   private Passenger appear() {
      try {
         Thread.sleep(ThreadLocalRandom.current().nextInt(2000, 3000));
      }
      catch (InterruptedException e) {}
      System.out.println("\nA new passenger has appeared!");
      return new Passenger(randomizeCountry(), GenPassportNumber());
   }

   private String randomizeCountry() {
      return COUNTRY[(int) (Math.random() * 10)];
   }

   private void countryCheck(Passenger passenger) {
      if (passenger.getNationality().equals("US")) {
         us.putPassengerInQueue(passenger);
         System.out.println("A passenger has been placed in the US queue.");
         System.out.println("US passengers count: " + us.queue.size() + "\n");
      } else {
         nonUs.putPassengerInQueue(passenger);
         System.out.println("A passenger has been placed in the Non-US queue.");
         System.out.println("Non-US passengers count: " + nonUs.queue.size() + "\n");
      }
   }

   private long GenPassportNumber() {
      Collections.shuffle(passportNumber);
      StringBuilder sb = new StringBuilder();
      for (Integer integer : passportNumber) {
         sb.append(integer);
      }
      long finalNum = Long.parseLong(sb.toString());
      return finalNum;
   }
}