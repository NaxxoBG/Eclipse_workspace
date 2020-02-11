import java.util.ArrayList;
import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;
import lejos.nxt.Sound;

public class Light {
   static ArrayList<Integer> list = new ArrayList<Integer>();
   private static LightSensor light = new LightSensor(SensorPort.S1);

   public static void main(String[] args) {
      Button.waitForAnyPress();
      for (int i = 0; i < 72; i++) {
         list.add(light.getLightValue());
         Sound.setVolume((light.getLightValue() % 10) * 5);
         Sound.beep();
         turnAngle(5);
      }
      resultMode();
   }

   public static void turnAngle(int angle) {
      double circumference = 2 * Math.PI * 2.6;
      double tachocountAngle = ((2 * Math.PI * 15) / 360 * angle) / circumference * 360;
      MotorPort.A.resetTachoCount();
      while(-(MotorPort.A.getTachoCount()) < tachocountAngle) {
         MotorPort.A.controlMotor(80, 2);
      }
      MotorPort.A.controlMotor(0, 3);
   }

   public static void resultMode() {
      ArrayList<Integer> counts = new ArrayList<Integer>();
      int count = 0;
      int sum = 0;
      int largest = list.get(0);
      int lowest = list.get(0);
      int most = 0;
      int helper = 0;

      for (int i = 0; i < list.size(); i++) {
         for (int j = 0; j < list.size(); j++) {
            if (list.get(j) == list.get(i)) {
               helper++; 
            }
         }
         counts.add(helper);
         helper = 0;

      }

      for (int i = 0; i < list.size(); i++) {
         count++;
         sum += list.get(i);
         if (most < counts.get(i)) 
            most = list.get(i);
         
         if (largest < list.get(i)) 
            largest = list.get(i);
         
         if (lowest > list.get(i)) 
            lowest = list.get(i);

      }
      double avg = (double) sum / count;

      LCD.clear();
      LCD.drawString("Result mode", 0, 0);
      LCD.drawString("AVG: " + avg, 0, 1);
      LCD.drawString("Largest: " + largest, 0, 2);
      LCD.drawString("Smallest: " + lowest, 0, 3);
      LCD.drawString("Most: " + most, 0, 4);
      Button.waitForAnyPress();
   }
}