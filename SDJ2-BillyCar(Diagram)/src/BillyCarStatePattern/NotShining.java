package BillyCarStatePattern;

public class NotShining extends CarState
{
   public void press(Car car) {
      car.setState(BACKWARDSANDSHINING);
   }
}