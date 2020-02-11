import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.SensorPort;
import lejos.nxt.LightSensor;
import lejos.util.Stopwatch;

public class MeasureTime
{
   public static void main(String[] args)
   {
      Stopwatch timer = new Stopwatch();
      LightSensor ls = new LightSensor(SensorPort.S3);
      boolean lastWasDark = true;
      long lightDuration = 0;
      long startTime = 0;
      int lightValue;

      ls.setFloodlight(false);
      LCD.drawString("Light sampling", 0, 0);
      LCD.drawString("Value  Time (ms)", 0, 1);
      timer.reset();
      do
      {
         lightValue = ls.getLightValue();
         if(lightValue > 55)
         {
            if(lastWasDark)
            {
               lastWasDark = false;
               startTime = System.currentTimeMillis();
            }
         }
         else
         {
            if(!lastWasDark)
            {
               lastWasDark = true;
               lightDuration = System.currentTimeMillis()-startTime;
            }
         }

         // Update LCD display every 1s
         if(timer.elapsed() > 1000)
         {
            timer.reset();
            LCD.clear(2);
            LCD.drawInt(lightValue, 0, 2);
            LCD.drawInt((int)lightDuration, 7, 2);

            // Display System Time in Seconds
            LCD.drawInt((int)System.currentTimeMillis()/1000, 0, 4);
         }

      }while(!Button.ESCAPE.isDown());
   }
}