import lejos.nxt.LCD;


public class Hello_World
{

  public static void main(String[] args)
         
            throws Exception {
               LCD.drawString("Hello World!", 2, 2);
               LCD.refresh();
               
               try {
                  Thread.sleep(5000);
                  
                  
               } catch (InterruptedException e) {
                  
                  
               }
            }
}