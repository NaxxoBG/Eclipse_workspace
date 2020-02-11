import lejos.nxt.Button;
import lejos.nxt.Motor;

public class Square2
{
   public static void main(String[] args) throws InterruptedException
   {
      Button.waitForAnyPress();
      //Line 1
      Motor.A.setSpeed(720);// 2 RPS
      Motor.C.setSpeed(720);
      Motor.A.forward();
      Motor.C.forward();
      Thread.sleep (3000);

      //Turn 1
      Motor.A.rotateTo(180);
      Motor.A.rotate(-90,true);


      //Line 2
      Motor.A.setSpeed(720);// 2 RPS
      Motor.C.setSpeed(720);
      Motor.A.forward();
      Motor.C.forward();
      Thread.sleep (3000); 

      //Turn 2
      Motor.A.rotateTo(180);
      Motor.A.rotate(-90,true);

      //Line 3
      Motor.A.setSpeed(720);// 2 RPS
      Motor.C.setSpeed(720);
      Motor.A.forward();
      Motor.C.forward();
      Thread.sleep (3000);

      //Turn 3
      Motor.A.rotateTo(180);
      Motor.A.rotate(-90,true);

      //Line 4
      Motor.A.setSpeed(720);// 2 RPS
      Motor.C.setSpeed(720);
      Motor.A.forward();
      Motor.C.forward();
      Thread.sleep (3000);
   }
}