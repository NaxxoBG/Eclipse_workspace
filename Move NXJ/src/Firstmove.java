import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.MotorPort;

public class Firstmove
{
   public static void main(String[] args) throws InterruptedException
   {
      System.out.println("Press button to start");
      Button.waitForAnyPress();

      int c = MotorPort.A.getTachoCount();
      int d = MotorPort.B.getTachoCount();

      MotorPort.A.controlMotor(65, 1);
      MotorPort.B.controlMotor(65, 1);

      System.out.println("Great!");
      
      LCD.clear();
      LCD.drawInt(c, 3, 3);
      LCD.drawInt(d, 5, 5);
      LCD.refresh();

      Thread.sleep(2000);
   }
}