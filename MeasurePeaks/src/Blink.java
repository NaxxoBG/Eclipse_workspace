import java.util.ArrayList;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.util.Stopwatch;

public class Blink
{
   public static final int border = 35; 
   public static void main(String[] args) {

      ArrayList<Integer> list = new ArrayList<Integer>(); 

      LightSensor light = new LightSensor(SensorPort.S3); 
      Stopwatch watch = new Stopwatch(); 
      while (true)
      {
         while (light.getLightValue() >= border); 
         watch.reset(); 
         while (light.getLightValue() < border); 
         if (watch.elapsed() > 950) // check if it was off for 1 second if yes move on
         {
            break;
         }
      }

      watch.reset(); 

      while (true) //this while loop that measures the blinks
      {
         while(light.getLightValue() < border); //wait while light is off
         if (watch.elapsed() > 950) //check if light was off for 1 seconds if yes the sequence is over and we leave
         {
            break;
         }
         watch.reset(); 
         
         while (light.getLightValue() >= border); //wait while light is on
         list.add(watch.elapsed()); //add the length of the blink to the arrayList
         watch.reset(); 
      }

      for (int i = 0; i < list.size(); i++) 
      {
         LCD.clear();
         LCD.drawString("Blink number: " + (i + 1), 0, 0);
         LCD.drawString("was " + list.get(i), 0, 1);
         LCD.drawString("Milis long", 0, 2);
         int button = Button.waitForAnyPress();
         if (button == Button.ID_ESCAPE)
         {
            break;
         }
      }
   }
}