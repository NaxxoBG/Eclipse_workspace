import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.MotorPort;

public class Move_Car_Test
{
   public static void main(String[] args) throws InterruptedException
   {
      int tacho = 0;
      System.out.println("Press button to start");
      Button.waitForAnyPress();

      for (int i = 0; i < 4;i++)
      {
         MotorPort.A.controlMotor(100,1);
         MotorPort.B.controlMotor(100,1);
         tacho = (int) MotorPort.A.getTachoCount();

         while (tacho <= 100) {
            MotorPort.A.resetTachoCount();
            MotorPort.B.controlMotor(80,2);
            LCD.drawInt(tacho, 3, 4);
            
         }
      }
   }
}