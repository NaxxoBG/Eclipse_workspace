package BillyCarStatePattern;

public class Car implements CarConstants
{
   private CarState state = NOTSHININGANDFORWARD;

   public void press() {
      state.press(this);
   }

   public void setState(CarState state) {
      this.state = state;
   }

   public void complete() {
      state.complete(this);
   }

   public String status() {
      return state.status();
   }
}