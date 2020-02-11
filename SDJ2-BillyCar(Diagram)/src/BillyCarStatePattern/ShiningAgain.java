package BillyCarStatePattern;

public class ShiningAgain extends CarState
{
   public void press(Car car) {
      car.setState(NOTSHININGAGAIN);
   }
}