package BillyCarStatePattern;

public class StopShiningAndBackwards extends CarState
{
   public void press(Car car) {
      car.setState(SHININGAGAIN);
   }
}