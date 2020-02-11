import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;

public class Light_Sensor2
{
   public static void main(String[] args) throws InterruptedException {
      LightSensor light = new LightSensor(SensorPort.S1);
      int turnvalue = (int) (((2 * Math.PI * 10) / 360) * 90 * (360 / 3));
      int current = 0, clight = 0, bestlight = 0, position = 0;
      MotorPort.A.controlMotor(75, 2);

      while (current >= -(turnvalue)) {
         current = MotorPort.A.getTachoCount();
         clight = light.getLightValue();
         if (clight > bestlight) {
            bestlight = clight;
            position = current;
            LCD.clear();
            LCD.drawInt(bestlight, 0, 1);
            LCD.drawInt(position, 0, 2);
         }
      }
      MotorPort.A.resetTachoCount();
      current = 0;
      while (current >= position) {
         current = MotorPort.A.getTachoCount();
         LCD.clear();
         LCD.drawInt(position, 0, 1);
         LCD.drawInt(current, 0, 2);
      }
      MotorPort.A.controlMotor(0, 2);
      Thread.sleep(1000);
      MotorPort.A.controlMotor(75, 2);
      MotorPort.B.controlMotor(75, 2);
      Thread.sleep(1000);
      MotorPort.A.controlMotor(0, 2);
      MotorPort.B.controlMotor(0, 2);
   }
}
