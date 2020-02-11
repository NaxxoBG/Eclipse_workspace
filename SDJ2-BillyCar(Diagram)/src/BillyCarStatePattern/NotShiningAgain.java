package BillyCarStatePattern;

public class NotShiningAgain extends CarState
{

   @Override
   public void press(Car car) {
      car.setState(NOTSHININGANDFORWARD);

   }

}
