import lejos.nxt.*;

public class Ready_LineFol {

   public static void main (String[] aArg)
         throws Exception
   {
      //Declarations
      TouchSensor touch = new TouchSensor(SensorPort.S1);
      UltrasonicSensor ultra = new UltrasonicSensor(SensorPort.S2);
      LightSensor light = new LightSensor(SensorPort.S3);
      int border = 45;
      int power = 100;

      light.setFloodlight(true);
      LCD.drawString("Light: ", 0, 0);
      LCD.drawString("Press [ENTER]", 0, 2);
      LCD.drawString("to start", 0, 3);

      while (!(Button.ENTER.isDown())){
         LCD.drawInt(light.readValue(), 7, 0);
      }

      LCD.drawString("Press [ESCAPE] to stop", 0, 2);
      LCD.drawString("to stop", 0, 3);

      while (!(Button.ESCAPE.isDown()) && touch.isPressed() == false) {
         while (touch.isPressed() == false && ultra.getDistance() < 20) {
            MotorPort.A.controlMotor(0,3);
            MotorPort.C.controlMotor(0,3);
         }
         if (light.readValue() > border){

            MotorPort.A.controlMotor(0,3);
            MotorPort.C.controlMotor(power, 1);
         }
         else {
            
            MotorPort.A.controlMotor(power, 1);
            MotorPort.C.controlMotor(0,3);
         }
         LCD.drawInt(light.readValue(), 3, 9, 0);
         Thread.sleep(10);
      }

      MotorPort.A.controlMotor(0,3);
      MotorPort.C.controlMotor(0,3);
      LCD.clear();
      LCD.drawString("Program stopped", 0, 0);
      Thread.sleep(1000);
   }
}