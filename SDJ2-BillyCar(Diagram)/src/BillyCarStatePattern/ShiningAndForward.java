package BillyCarStatePattern;

public class ShiningAndForward extends CarState
{

   @Override
   public void press(Car car) {
      car.setState(NOTMOVINGANDSHINING);

   }

   

}
