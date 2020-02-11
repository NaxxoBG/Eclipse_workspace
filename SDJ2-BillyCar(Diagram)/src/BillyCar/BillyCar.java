package BillyCar;
public class BillyCar
{
   private int n;

   public void pressButton() {
      if (n < 8) {
         regime(n++);   //here is the incrementing operation
      } else {
         n = 1;
         regime(n);
      }
   }

   private void regime(int n) {
      n = this.n; //this.n is incremented by regime(n++) in mehtod pressButton(). N was 0, now is 1.
      switch (n) {
         case 1:
            System.out.println("power 1");
            power("on");
            forward();
            headlights("on");
            System.out.println();
            break;
         case 2:
            System.out.println("power 2");
            power("off");
            stop();
            headlights("off");
            System.out.println();
            break;
         case 3:
            System.out.println("power 3");
            power("on");
            headlights("on");
            System.out.println();
            break;
         case 4:
            System.out.println("power 4");
            power("off");
            headlights("off");
            System.out.println();
            break;
         case 5:
            System.out.println("power 5");
            power("on");
            backwards();
            headlights("on");
            System.out.println();
            break;
         case 6:
            System.out.println("power 6");
            power("off");
            stop();
            headlights("off");
            System.out.println();
            break;
         case 7:
            System.out.println("power 7");
            power("on");
            headlights("on");
            System.out.println();
            break;
         case 8:
            System.out.println("power 8");
            power("off");
            headlights("off");
            System.out.println();
            break;
         default:
            break;
      }
   }

   private void forward() {
      System.out.println("The car is going forward");
   }

   private void backwards() {
      System.out.println("The car is going backwards");
   }

   private void headlights(String string) {
      if (string.equals("on")) {
         System.out.println("headlights shine");
      } else {
         System.out.println("headlights are off");
      }
   }

   private void power(String string) {
      if (string.equals("on")) {
         System.out.println("Power is on");
      }
      else {
         System.out.println("Power is off");
      }
   }

   private void stop() {
      System.out.println("The car is stopping");
   }
}