import lejos.nxt.Button;
import lejos.nxt.LightSensor;
import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;


public class LineFollower
{

   public static void main(String[] args)
   {
     /* int threshold;
      boolean initTrue;
      int sweep; */
      
      //TOUCH SENSOR
      TouchSensor touch = new TouchSensor(SensorPort.S1);
      //boolean touch
      if(touch.isPressed()) {
            //do nothing
      } else {
         
      }
      //end boolean touch
      
      //LIGHT SENSOR
      LightSensor light = new LightSensor(SensorPort.S2);
      if (light.getLightValue() > 65 ) {
         
         //do something
      } else {
         //do some other thing
      }
      
      MotorPort.A.controlMotor(100,1);
      MotorPort.B.controlMotor(100,1);
      
      //ULTRASONIC SENSOR
      
      UltrasonicSensor ultra = new UltrasonicSensor(SensorPort.S3);
      
      if (ultra.getDistance() < 50) {
         
         //Do something
      } else {
         
         //Do some other thing
      }
      
      
       
         while (!(Button.ESCAPE.isDown())) {
            if (ultra.getDistance() > 100) {
               
               MotorPort.A.controlMotor(0,3);
               MotorPort.B.controlMotor(0,3);
            } else {}
         
       //  FORWARD STATE
         }
         
       /*  while (MotorPort.A.isMoving() && MotorPort.B.isMoving()  ) {
         
            if (light.readValue() <= threshold) 
               sweep = -Math.abs(sweep); 
               initTrue = true;
               
         */
         }
      
      
      
      
   }


