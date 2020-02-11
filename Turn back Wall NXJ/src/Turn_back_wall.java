import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

public class Turn_back_wall
{
   public static void main(String[] args) throws InterruptedException {
      boolean press = false;
      int tachos = 0;
      TouchSensor touch = new TouchSensor(SensorPort.S1);

      MotorPort.B.controlMotor(80, 1);
      MotorPort.C.controlMotor(80, 1);
      while (!press) {
         tachos = MotorPort.B.getTachoCount();
         if (touch.isPressed()) {
            press = true;
         }
      }
      MotorPort.B.controlMotor(85, 2);
      MotorPort.C.controlMotor(85, 2);
      Thread.sleep(1000);

      MotorPort.B.controlMotor(0, 2);
      MotorPort.C.controlMotor(85, 1);
      int turnvalue = (int) (((2 * Math.PI * 2) / 360) * 90 * (180 / 3));
      MotorPort.B.resetTachoCount();
      while (MotorPort.B.getTachoCount() >= -(turnvalue));

      MotorPort.B.resetTachoCount();
      MotorPort.C.controlMotor(85, 1);

      while (MotorPort.B.getTachoCount() >= tachos);

      MotorPort.C.controlMotor(0, 1);
      MotorPort.B.controlMotor(0, 1);
   }
}