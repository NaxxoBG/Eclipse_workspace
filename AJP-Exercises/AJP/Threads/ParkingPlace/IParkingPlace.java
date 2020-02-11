// *****************************************************************************
// File name  : IParkingPlace.java
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

public interface IParkingPlace
{
   public void arrive();
   public void leave();
   public int freePlaces();
}