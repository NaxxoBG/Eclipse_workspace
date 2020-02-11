package BillyCarStatePattern;

public class BackwardsAndShining extends CarState
{
   public void press(Car car) {
      car.setState(STOPANDNOSHINING);
   }
}