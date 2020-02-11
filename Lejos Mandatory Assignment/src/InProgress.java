import java.util.ArrayList;
import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;
import lejos.nxt.Sound;

public class InProgress {

   private static ArrayList<Movements> list = new ArrayList<Movements>(); // contains all the movements
   static ArrayList<Double> black = new ArrayList<>(); // width values for sectors of the track where the sensor detects light above the given threshold
   static ArrayList<Double> white = new ArrayList<>(); // values for sectors of the track in which the sector detects light values below the set threshold
   private static double threshold = 45; // this value determines which values are considered black and which are white
   private static double distanceOF = 0; // 
   private static int pos; //pos holds the y-character coordinate to display the cursor at on the LCD display
   private static int value; // this integer holds the value for a movement(degrees or cm) depending on its type 
   static LightSensor light = new LightSensor(SensorPort.S4);

   public static void main(String[] args) throws InterruptedException {
      menu();

      LCD.clear();
      for (int i = 0; i < black.size(); i++) {
         LCD.drawString(black.get(i) + "", 1, i);
      }

      Thread.sleep(10000);
      // Sound.playTone(frequency, duration)
      for (int i = 0; i < black.size() - 1; i++) {
         Sound.playTone(blackCm(black.get(i)), whiteCm(white.get(i)));
         Thread.sleep(whiteCm(white.get(i)) + 100);
      }

      LCD.clear();
      int counter = 1;
      for(int i = 0; i < black.size(); i++){
         LCD.drawString("Tone " + counter++ + ". " + black.get(i) + " Length " + whiteCm(white.get(i)), 1, i);
      }
      Thread.sleep(10000);
   }
   // This method takes the values for the black lines and returns the corresponding frequency, depending on the result of the comparison
   public static int blackCm(double travel) {
      if (travel < 1.5) {
         return Sounds.getFl();
      }
      else if (travel < 3.5) {
         return Sounds.getAs();
      }
      else if (travel < 5.5) {
         return Sounds.getA();
      }
      else if (travel < 7.5) {
         return Sounds.getB();
      }
      else if (travel < 9.5) {
         return Sounds.getC();
      }
      else if (travel < 11.5) {
         return Sounds.getD();
      }
      else if (travel < 13.5) {
         return Sounds.getE();
      }
      else {
         return Sounds.getF();
      }
   }
   //This method returns the values for the white sectors which serve as durations for the tones to be played
   public static int whiteCm(double travel) {
      if (travel < 18.5) {
         return Sounds.getS();
      }
      else if (travel < 20.5) {
         return Sounds.getM();
      }
      else {
         return Sounds.getL();
      }
   }

   public static void menu() throws InterruptedException {
      pos = 1; 
      options(pos); 
      do {
         if (Button.RIGHT.isDown()) { // incrementing the y-coordinate position of the pointer(moving downwards)
            while (Button.RIGHT.isDown());
            if (pos != 4) 
               pos++;
            else 
               pos = 1;
            options(pos);
         }
         if (Button.LEFT.isDown()) { //decrementing the y-coordinate position of the pointer(moving upwards)
            while (Button.LEFT.isDown());
            if (pos != 1)
               pos--;
            else
               pos = 4;
            options(pos);
         }
         if (Button.ENTER.isDown()) { // selecting menu options depending on the pos variable
            while (Button.ENTER.isDown());
            if (pos < 4) 
               setValue();
            if (pos == 4)
               execute();
            options(pos);
         }
      } while (!Button.ESCAPE.isDown());
   }

   public static void options(int pos) {
      // the content on the display when the user chooses the movement to be added to the movements Array List
      LCD.clear();
      LCD.drawString("Add actions", 0, 0);
      LCD.drawString("forward", 1, 1);
      LCD.drawString("left", 1, 2);
      LCD.drawString("right", 1, 3);
      LCD.drawString("Execute", 1, 4);
      LCD.drawString(">", 0, pos); //pos is the y coordinate of where the cursor is to be displayed
   }

   public static void setValue() throws InterruptedException{
      LCD.clear();
      value = 0;

      LCD.drawInt(value, 9, 4);
      do {
         if (Button.RIGHT.isDown()) {
            Thread.sleep(300);
            value += 50;       // incrementing the value with 50 each time the right button is pressed
            LCD.drawInt(value, 9, 4);
         }
         if (Button.LEFT.isDown()) {
            Thread.sleep(300);
            if (value != 0)
               value -= 5;    // decrementing with 5 each time the left button is pressed
            LCD.clear(4);
            LCD.drawInt(value, 9, 4);
         }
         if (Button.ENTER.isDown()) {
            while (Button.ENTER.isDown());
            switch(pos){  // depending on the pointer y-coordinate, add newly created movement with its specified type(forward, left or right)
               case(1): {
                  LCD.drawString("Distance:", 0, 3);
                  list.add(new Movements("forward", value));
                  break;
               }
               case(2): {
                  LCD.drawString("Angle: ", 0, 3);
                  list.add(new Movements("left", value));
                  break;
               }
               case(3): {
                  LCD.drawString("Angle: ", 0, 3);
                  list.add(new Movements("right", value));
                  break;
               }
            }
            break;
         }
      } while (!Button.ESCAPE.isDown());
      while (Button.ESCAPE.isDown());
   }

   public static void forward(double distanceCM) throws InterruptedException {
      double travel = ((distanceCM / (5.6 * Math.PI)) * 360); // converting from centimeters to tachocount
      boolean blackLine;
      boolean whiteLine;
      MotorPort.A.resetTachoCount();
      MotorPort.B.resetTachoCount();

      if (light.getLightValue() < threshold) { // line is black
         blackLine = true;
         whiteLine = false;
      }
      else {      // line is white
         blackLine = false;
         whiteLine = true;
      }

      while (MotorPort.A.getTachoCount() < travel) {
         LCD.drawInt(light.getLightValue(), 0, 0);
         MotorPort.A.controlMotor(84, 1);
         MotorPort.B.controlMotor(80, 1);

         if (light.getLightValue() < threshold) { // if light is below threshold
            if (blackLine == false) { // previous line is white
               white.add(distanceOF); //adding the width of that line to the ArrayList white
               MotorPort.B.resetTachoCount(); // resetting tachocounter
               distanceOF = (double) ((double) Motor.B.getTachoCount() / 360) * 11; // width of line
               blackLine = true; //current line is black
               whiteLine = false;   //setting to false
            } else {
               distanceOF = (double) ((double) Motor.B.getTachoCount() / 360) * 11;
               // width of line. If the first if is not true then evaluationg the width of the line might be skipped
            }
         }

         if (light.getLightValue() > threshold) { // if light is above threshold 
            if (whiteLine == false) { // if previous line is black
               black.add(distanceOF); // addint the width of that line to the ArrayList black
               MotorPort.B.resetTachoCount(); // resetting tachocounter
               distanceOF = (double) ((double) Motor.B.getTachoCount() / 360) * 11; // width of line
               blackLine = false; 
               whiteLine = true;
            } else {
               distanceOF = (double) ((double) Motor.B.getTachoCount() / 360) * 11;
               // width of line. If the first if is not true, then measuring the width of the line might be skipped
            }
         }
      }
      MotorPort.A.controlMotor(100, 3); // stopping both motors when the given distance has been travelled
      MotorPort.B.controlMotor(100, 3);
      Thread.sleep(250);
   }

   public static void turnAngleLeft(int angle) throws InterruptedException {
      double circle = 2 * Math.PI * 2.8;
      double tachoAngle = ((2 * Math.PI * 11) / circle) * angle; // coverting from degrees to tachocount
      MotorPort.A.resetTachoCount();
      MotorPort.B.resetTachoCount();

      MotorPort.B.controlMotor(80, 1);
      while (MotorPort.B.getTachoCount() < tachoAngle); //avoids glitches, etc.
      MotorPort.B.controlMotor(0, 3);
      Thread.sleep(500);
   }

   public static void turnAngleRight(int angle) throws InterruptedException {
      double circle = 2 * Math.PI * 2.8;
      double tachoAngle = ((2 * Math.PI * 11) / circle) * angle; // converting from degrees to tachocount

      MotorPort.A.resetTachoCount();
      MotorPort.B.resetTachoCount();

      MotorPort.A.controlMotor(80, 1);
      while (MotorPort.A.getTachoCount() < tachoAngle);
      MotorPort.A.controlMotor(0, 3);
      Thread.sleep(250);
   }

   public static void execute() throws InterruptedException {
      LCD.clear();
      for (int i = 0; i < list.size(); i++) { // iterating over each movement in the Movements ArrayList 
         if (list.get(i).getType().equals("forward")) { // if the type of the movement is equal to the string "forward"
            forward(list.get(i).getValue()); // call the forward method and set the distance by getting the value of the movement
         }
         else if(list.get(i).getType().equals("left")) { // if the type of the movement is equal to the string "left"
            turnAngleLeft(list.get(i).getValue()); // call the turnAngleLeft and set the degrees by getting the value of the movement
         }
         else if (list.get(i).getType().equals("right")) {  // if the type of the movement is equal to the string "right"
            turnAngleRight(list.get(i).getValue()); // call the turnAngleRight and set the degrees by getting the value of the movement
         }
      }
   }
}