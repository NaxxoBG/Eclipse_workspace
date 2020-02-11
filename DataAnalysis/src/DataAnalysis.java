import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;

public class DataAnalysis
{
   public static void main(String[] args) throws InterruptedException
   {
      {
         LightSensor light = new LightSensor(SensorPort.S1);

         int turnValue = 15;

         int currentPos = 0, 
               currentLight = 0,
               brightestLight = 0,
               position = 0;

         MotorPort.A.controlMotor(75,1);
         MotorPort.B.controlMotor(0,2);
         while ( currentPos <= turnValue) 
         {  

            currentPos = MotorPort.A.getTachoCount();
            currentLight = light.getLightValue();

            if (currentLight > brightestLight) 
            {      
               brightestLight = currentLight; 
               position = currentPos;
               LCD.clear();
               LCD.refresh();
               LCD.drawInt(brightestLight, 0, 1);
               LCD.drawInt(position, 0, 2);
            }
         }

         MotorPort.A.resetTachoCount();
         currentPos = 0;
         while (currentPos >= position) 
         {
            currentPos = MotorPort.A.getTachoCount();
            LCD.clear();
            LCD.drawInt(position, 1, 1);
            LCD.drawInt(currentPos, 1, 2);
         }
         MotorPort.A.controlMotor(0,1);
         MotorPort.B.controlMotor(0,1);
         Thread.sleep(1000);

         MotorPort.A.controlMotor(75,1);
         MotorPort.B.controlMotor(75,1);
         Thread.sleep(1000);

         MotorPort.A.controlMotor(0,1);
         MotorPort.B.controlMotor(0,1);
      }
   }
}

/*
      ArrayList<Integer> lightList = new ArrayList<>();

      public static void main(String[] args)
      {


      }

      public static void getLight(ArrayList<Integer> lightList) {
         int key = Button.waitForAnyPress();
         LCD.drawString("Light:", 2,3);

         LightSensor light = new LightSensor(SensorPort.S1);
         int lightval = light.getLightValue();

         if (key == Button.ID_ENTER) {
            int tacho = MotorPort.A.getTachoCount();

            for (int i = 0; i < 10; i++)
            {
               while (tacho <= 36) {
                  MotorPort.A.controlMotor(75,2);
                  lightList.add(lightval);
                  LCD.clear();
                  LCD.drawInt(lightval, 2, 3);
                  MotorPort.A.resetTachoCount();
               }
            }

   }
   }
 */