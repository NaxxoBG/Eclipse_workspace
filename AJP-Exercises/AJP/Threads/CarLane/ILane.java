package Threads.CarLane;

public interface ILane
{
   public void enterFromTheLeft();
   public void exitToTheRight();
   public void enterFromTheRight();
   public void exitToTheLeft();
}