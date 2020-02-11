// *****************************************************************************
// File name  : ParkingPlaceImpl.java
// Start date : Apr 3, 2014
// Programmer : Hans So.
// Java       : Java 1.6.0 
// Description: 
//
// Revision history:
//   date     init  comment
//
// *****************************************************************************

package Threads.ParkingPlace;

public class ParkingPlaceImpl implements IParkingPlace
{
   private final int MAX;
   private int noOfCars;  // number of cars on the parking place
   private boolean changed;

   public ParkingPlaceImpl (int max) {
      this.MAX = max;
      this.noOfCars = 0;
      this.changed = true;
   }

   public synchronized void arrive () {
      while (isFull()) {      
         try { 
            wait();
         }
         catch (InterruptedException e) {};
      }
      noOfCars++;
      changed = true;
      notifyAll();
   }

   public synchronized void leave() {
      noOfCars--;
      changed = true;
      notifyAll();
   }

   public synchronized int freePlaces() {
      while (!changed) {      
         try { 
            wait();
         }
         catch (InterruptedException e) {};
      }
      changed = false;
      return MAX - noOfCars;
   }

   private boolean isFull() {
      return noOfCars >= MAX;
   }
}