import java.util.ArrayList;
import lejos.nxt.LCD;
import lejos.nxt.Button;
import lejos.nxt.SensorPort;
import lejos.nxt.LightSensor;
import lejos.nxt.UltrasonicSensor;

public class DataSampling_teacher
{

   public static void main(String[] args)
   {
      ArrayList<DataSet> samples = new ArrayList<DataSet>();

      LCD.drawString("Sampling mode", 0, 0);
      sampleData(samples);

      LCD.drawString("  Edit mode  ", 0, 0);
      editData(samples);
   }

   public static void displayValues(int light, int distance, int count)
   {
      LCD.drawInt(count, 8, 2);
      LCD.drawString("          ", 6, 4);
      LCD.drawInt(distance, 6, 4);
      LCD.drawInt(light, 12, 4);
   }

   public static void clearValues()
   {
      LCD.drawString("          ", 6, 4);
   }

   public static void sampleData(ArrayList<DataSet> data)
   {
      int light;
      int distance;
      int key;
      int count;

      LightSensor ls = new LightSensor(SensorPort.S3);
      UltrasonicSensor ds = new UltrasonicSensor(SensorPort.S2);

      LCD.drawString("Distance Light", 2, 3);
      LCD.drawString("Sample:", 0, 2);

      do
      {
         key = Button.waitForAnyPress(100);
         light = ls.getLightValue();
         distance = ds.getDistance();
         if(key == Button.ID_ENTER)
         {
            data.add(new DataSet(light, distance));
            count = data.size();
            displayValues(light, distance, count);
         }
      }while(key != Button.ID_ESCAPE);
   }

   public static void editData(ArrayList<DataSet> data)
   {
      int index = 0;
      int key;

      do {
         if(data.size() > 0) {
            displayValues(data.get(index).getLight(), data.get(index).getDistance(),index+1);
         }
         else {
            clearValues();
         }
         key = Button.waitForAnyPress(100);
         switch(key) {
            case Button.ID_ENTER:
               if(data.size() > 0) {
                  data.remove(index);
                  if (index == data.size()) {
                     index--;
                  }
               }
               break;
            case Button.ID_RIGHT:
               if(index<data.size()-1)
                  index++;
               break;
            case Button.ID_LEFT:
               if(index>0)
                  index--;
               break;
         }
      } while(key != Button.ID_ESCAPE);
   }
}