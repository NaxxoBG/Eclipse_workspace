import java.util.ArrayList;
import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;

public class DataSampling
{
   public static void main(String[] args)
   {
      UltrasonicSensor ultra = new UltrasonicSensor(SensorPort.S2);
      LightSensor light = new LightSensor(SensorPort.S3);

      DataSet dset1 = new DataSet(40, 35);
      DataSet dset2 = new DataSet(50, 38);
      DataSet dset3 = new DataSet(60, 95);
      DataSet dset4 = new DataSet(70, 15);

      ArrayList<DataSet> set = new ArrayList<DataSet>();

      set.add(dset1);
      set.add(dset2);
      set.add(dset3);
      set.add(dset4);

      int lightval = 0;
      int distanceval = 0;

      for (int i = 0; i < set.size(); i++) {
         lightval = set.get(i).getLight();
         distanceval = set.get(i).getDistance();
         DataSet value = set.get(i);
         System.out.println(value);
         System.out.println(lightval + distanceval);
         
         LCD.clear();
         LCD.setAutoRefreshPeriod(10);
         LCD.drawInt(lightval,i,4);
         LCD.drawInt(distanceval,i + 1,4);
      }

      while (Button.ENTER.isDown()) {
         DataSet data = new DataSet(light.getLightValue(), ultra.getDistance());
         ArrayList<DataSet> setter = new ArrayList<DataSet>();
         setter.add(data);
         LCD.clear();
         LCD.drawInt(data.getLight(), 2,5);
         LCD.drawInt(data.getDistance(), 3,5);
         LCD.setAutoRefreshPeriod(50);
      }
   }
}