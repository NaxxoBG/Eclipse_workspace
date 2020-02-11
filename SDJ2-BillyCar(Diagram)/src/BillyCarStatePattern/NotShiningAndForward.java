package BillyCarStatePattern;

public class NotShiningAndForward extends CarState
{
   public void press(Car car) {
      car.setState(SHININGANDFORWARD);
   }
}