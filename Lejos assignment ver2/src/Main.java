import java.util.ArrayList;
import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;
import lejos.nxt.Sound;
import lejos.robotics.navigation.Move;

public abstract class Main
{
   private static LightSensor light = new LightSensor(SensorPort.S3);
   private static ArrayList<Move> movement = new ArrayList<Move>();
   private static ArrayList<Integer> blackDistance = new ArrayList<>();
   private static ArrayList<Integer> whiteDistance = new ArrayList<>();
   private static double circumferenceOfWheel = 5.6*Math.PI;
   private static double circumferenceOfCar = 10.8*Math.PI*2;
   private static double tachos;
   private static int tachoCountHelper;
   private static boolean end = false;

   private static int value;
   private static int buttonValue;
   private static String text;

   public static void main(String[] args) {

      while(!end){
         LCD.clear();
         LCD.drawString("Left: turn", 0, 0);
         LCD.drawString("Enter/Escape continue", 0, 1);
         LCD.drawString("Right: forward", 0, 2);

         Button.waitForAnyPress();
         buttonValue=Button.readButtons();  
         switch (buttonValue){
            case 1: { end=true; break;}
            case 2: { selectAngle(); break;}
            case 4: { selectDistance(); break;}
            case 8: { end=true; break;}
         } 
      }
      end=false;

      for (int i = 0; i < movement.size(); i++) {
         if (movement.get(i).getType().equals("forward")) goForward(movement.get(i).getValue());
         if (end==true) break;
         else if (movement.get(i).getType().equals("left")) goLeft(movement.get(i).getValue());
         else if (movement.get(i).getType().equals("right")) goRight(movement.get(i).getValue());

      }
      while(light.getLightValue()>45);
      MotorPort.B.controlMotor(100, 3);
      MotorPort.C.controlMotor(100, 3);

      playTones();
   }

   private static void goForward(int distance){
      MotorPort.B.resetTachoCount();
      MotorPort.C.resetTachoCount();
      MotorPort.B.controlMotor(75, 1);
      MotorPort.C.controlMotor(75, 1);

      tachos=(distance/circumferenceOfWheel)*360;

      while(MotorPort.B.getTachoCount()<=tachos){
         tachoCountHelper = Motor.B.getTachoCount();
         if (light.getLightValue()<45){
            while(light.getLightValue()<45 && MotorPort.B.getTachoCount()<=tachos); 
         }
         if (value!=0)whiteDistance.add(value);
         if(light.getLightValue()>45) {
            while(light.getLightValue()>=45 && MotorPort.B.getTachoCount()<=tachos);
         }
         if (value==3) {
            end=true; 
            return;
         }
      }
      value=0;
      MotorPort.B.controlMotor(100, 3);
      MotorPort.C.controlMotor(100, 3);
   }

   private static void goLeft(int angle){
      MotorPort.B.resetTachoCount();
      MotorPort.C.resetTachoCount();
      tachos = (circumferenceOfCar/circumferenceOfWheel)*angle;
      MotorPort.B.controlMotor(100, 3);
      MotorPort.C.controlMotor(100, 1);
      while(MotorPort.C.getTachoCount()<=tachos);
      MotorPort.B.controlMotor(100, 3);
      MotorPort.C.controlMotor(100, 3);
   }

   private static void goRight(int angle){
      MotorPort.B.resetTachoCount();
      MotorPort.C.resetTachoCount();

      tachos = (circumferenceOfCar/circumferenceOfWheel)*angle;
      MotorPort.C.controlMotor(100, 3);
      MotorPort.B.controlMotor(100, 1);
      while(MotorPort.B.getTachoCount()<=tachos) Sound.playTone(200, 200, 100);
      MotorPort.B.controlMotor(100, 3);
      MotorPort.C.controlMotor(100, 3);
   }

   private static void selectDistance(){
      int distance=0;
      LCD.clear();
      LCD.drawString("Select Distance!", 0, 0);
      LCD.drawString("Left: -1", 0, 1);
      LCD.drawString("Enter: Enter ", 0, 2);
      LCD.drawString("Right: +1", 0, 3);
      LCD.drawString("escape: x10", 0, 4);
      while(!end){
         LCD.drawInt(distance, 6, 6);
         Button.waitForAnyPress();
         buttonValue=Button.readButtons();
         switch (buttonValue){
            case 1: {if(distance>=0) movement.add(new Move("forward",distance)); else movement.add(new Move("backward",-distance)); end=true; break;}
            case 2: { distance--; break;}
            case 4: { distance++; break;}
            case 8: { distance=distance*10; break;}
         } 
      }
      end=false;
   }

   private static void selectAngle(){
      int angle=0;
      LCD.clear();
      LCD.drawString("Select Angle!", 0, 0);
      LCD.drawString("Left: -1", 0, 1);
      LCD.drawString("Enter: Enter ", 0, 2);
      LCD.drawString("Right: +1", 0, 3);
      LCD.drawString("escape: x10", 0, 4);
      while(!end){
         LCD.drawInt(angle, 6, 6);
         Button.waitForAnyPress();
         buttonValue=Button.readButtons();
         switch (buttonValue){
            case 1: { 
               if(angle>=0) movement.add(new Move("right", angle)); 
               else 
                  movement.add(new Move("left", -angle)); 
               end=true; 
               break;
            }
         }
         case 2: { 
            angle--; 
            break;}
         case 4: { 
            angle++; 
            break;}
         case 8: { 
            angle=angle*10; 
            break;
         }
      } 
      end=false;
   }


   private static void playTones(){
      for (int i = 0; i < whiteDistance.size(); i++) {
         LCD.drawInt(blackDistance.get(i), 0, i);
      }

      for (int i = 0; i < blackDistance.size(); i++) {
         LCD.drawInt(whiteDistance.get(i), 10, i);
      }
   }
}