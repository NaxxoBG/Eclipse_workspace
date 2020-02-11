import java.util.Scanner;
public class Elevator
{
   Scanner input = new Scanner(System.in);
   private int floor;
   private int capacity;
   private int maximumLoad;
   private int currentLoad;
   
   
   
   public Elevator(int floor, int capacity) {
      
      while (capacity > 10 || capacity <= 0) {
         System.out.println("Enter a valid capacity");
         capacity = input.nextInt();
      }
      while (floor <= 0 || floor > 15) {
         System.out.println("Enter a valid floor");
         floor = input.nextInt();
      }
      this.floor = floor;
      
      
      this.capacity = capacity;
      maximumLoad = 75 * capacity;
   }
   
   public int getFloor() {
      
    return floor;
   }
   
   public int getCapacity() {
      
      return capacity;
   }
   
   public int getMaximumLoad() {
      
      return maximumLoad;
   }
   
   public int getCurrentLoad() {
      return currentLoad;
      
   }
   
   public void personEnter() {
     
      currentLoad += 75;
      
   }
   
   public void personEnter(int weight) {
      this.currentLoad += weight;
      System.out.println("The weight is " + this.currentLoad + ".");
      
   }
   
   public void personExit() {
      
      this.currentLoad -= 75;
   }

   public void personExit(int weight) {
      
      this.currentLoad -= weight;
      if (this.currentLoad < 0) {
         this.currentLoad = 0;
      }
   }
   
   public boolean isAllowedToMove() {
      if (getCurrentLoad() > maximumLoad) 
      { 
         System.out.println("-------------------------");
         System.out.println("Too much weight, the elevator cannot move!");
         return false;
         
      } else {
         System.out.println("-------------------------");
         System.out.println("We are ready to move!");
         return true;
      }
      
   }
   
   public boolean moveToFloor(int floor) {
      if (isAllowedToMove() == true) {
         this.floor = floor;
         System.out.println("Moving to floor " + floor);
         return true;
      } else {
         return false;
      }
   }
}