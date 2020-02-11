
public class ElevatorTest
{

   public static void main(String[] args)
   {
      Elevator elevator = new Elevator(0, 0);
      System.out.println("The maximum capacity is " + elevator.getCapacity() + " and the current floor is " + elevator.getFloor() + ".");
   
      System.out.println("The max load is " + elevator.getMaximumLoad());
      
      elevator.personEnter();  //+75kg
      elevator.personEnter(100); //+100kg
      elevator.personEnter();  //+75kg
      elevator.personEnter(100); //+100kg
      elevator.personEnter();  //+75kg
      elevator.personEnter(550); //+550kg
      
      System.out.println("The current load is: " + elevator.getCurrentLoad());
   
      elevator.moveToFloor(14);
      System.out.println("We are on floor: "+ elevator.getFloor());
      
      elevator.personExit(120);
      System.out.println("The current load is: " + elevator.getCurrentLoad());
   }

}
