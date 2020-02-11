import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;

public class Square
{
   public static void main(String[] args) throws InterruptedException
   {
      LCD.drawString("Press to start",0,0);
      Button.waitForAnyPress();

      for (int i = 0; i < 4; i++) {
         Motor.A.setSpeed(720);
         Motor.B.setSpeed(720);
         Motor.A.forward();
         Motor.B.forward();
         Thread.sleep(3000);
         int speed = Motor.A.getSpeed();
         LCD.drawInt(speed,5,5);
         Motor.A.rotateTo(45);
         Motor.A.rotate(-45,true);

      }

      Motor.A.stop();
      Motor.B.stop();
      LCD.refresh();
      LCD.drawString("Square",0,0);
      LCD.clear();
      try {
         Thread.sleep(2000);
      } catch (InterruptedException e) {
      }
   }
}