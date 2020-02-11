import java.util.ArrayList;
import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.SensorPort;
import lejos.nxt.LightSensor;
import lejos.util.Stopwatch;

public class Blinker
{
   public static void main(String[] args)
   {
      ArrayList<Integer> listOfLights = new ArrayList<Integer>();
      ArrayList<Integer> durationOfLights = new ArrayList<Integer>();
      Stopwatch timer = new Stopwatch();
      LightSensor light = new LightSensor(SensorPort.S3);
      boolean lastWasDark = true;
      long lightDuration = 0;
      long startTime = 0;
      int lightValue;

      light.setFloodlight(false);
      LCD.drawString("Light sampling", 0, 0);
      LCD.drawString("Value  Time (ms)", 0, 1);
      timer.reset();
      do {
         lightValue = light.getLightValue();
         if(lightValue > 55) {
            if(lastWasDark) {
               lastWasDark = false;
               startTime = System.currentTimeMillis();
            }
         }
         else {
            if(!lastWasDark) {
               lastWasDark = true;
               lightDuration = System.currentTimeMillis()-startTime;
               durationOfLights.add((int) lightDuration);
               listOfLights.add(lightValue);
            }
         }

         if(timer.elapsed() > 1000) {
            timer.reset();
            LCD.clear(2);
            LCD.drawInt(lightValue, 0, 2);
            LCD.drawInt((int)lightDuration, 7, 2);
            LCD.drawInt((int)System.currentTimeMillis()/1000, 0, 4);
         }

         for (int i = 0; i < durationOfLights.size(); i++) {
            LCD.drawInt(durationOfLights.get(i), 0, 5+i);
            LCD.refresh();
         }
      } 

      while(!Button.LEFT.isDown());
      LCD.clearDisplay();
      LCD.refresh();
      System.out.println(durationOfLights);
      while(!Button.RIGHT.isDown());
   }
}