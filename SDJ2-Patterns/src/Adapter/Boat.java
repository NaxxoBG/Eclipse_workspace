package Adapter;

public class Boat
{
   public void sailForward() {
      System.out.println("Sailing forward");
   }
   
   public void sailBackwards() {
      System.out.println("Sailing backwards");
   }
   
   public void turnBoat(int deg) {
      System.out.println("Boat turning " + deg);
   } 
}
