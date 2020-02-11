package BillyCarStatePattern;

public class Shining extends CarState
{
   public void press(Car car) {
      car.setState(NOTSHINING);
   }
}
