package BillyCarStatePattern;

public class TestCar
{
   public static void main(String[] args) {
      Car car = new Car();
      
      System.out.println("Initial state");
      System.out.println(car.status() + "\n");
      car.press();
      System.out.println("Pressing for the first time");
      System.out.println("1. " + car.status());
      car.press();
      System.out.println("2. " + car.status());
      car.press();
      System.out.println("3. " + car.status());
      car.press();
      System.out.println("4. " + car.status());
      car.press();
      System.out.println("5. " + car.status());
      car.press();
      System.out.println("6. " + car.status());
      car.press();
      System.out.println("7. " + car.status());
      car.press();
      System.out.println("8. " + car.status());
      car.press();
      System.out.println("9. " + car.status());
      car.press();
      System.out.println("10. " + car.status());
      car.press();
      System.out.println("11. " + car.status());
      car.press();
   }
}