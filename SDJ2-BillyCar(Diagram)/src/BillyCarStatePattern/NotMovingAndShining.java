package BillyCarStatePattern;

public class NotMovingAndShining extends CarState
{
   public void press(Car car) {
      car.setState(SHINING);
   }
}