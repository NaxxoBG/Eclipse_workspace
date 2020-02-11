package BillyCarStatePattern;

public abstract class CarState implements CarConstants {
   
   public abstract void press(Car car);

   public void complete(Car car) {
   }

   public String status() {
      String s = getClass().getName();
      return s.substring(s.lastIndexOf('.') + 1);
   }
}