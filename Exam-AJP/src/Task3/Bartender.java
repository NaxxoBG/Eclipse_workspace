package Task3;

public class Bartender implements Runnable
{
   private String name;
   private BarDesk desk;

   public Bartender(String name, BarDesk desk) {
      this.name = name;
      this.desk = desk;
   }

   public void run() {
      while (true) {
         desk.takeEmptyGlass();
         this.cleanGlass();
         desk.placeFullGlass();
         this.placeGlass();
      }
   }

   private void cleanGlass() {
      System.out.println("Bartender " + name + " name is cleaning a glass");
      try {
         Thread.sleep(1500);
      } catch (InterruptedException e) {}
   }

   private void placeGlass() {
      System.out.println("Bartender " + name + " has placed a full glass on the bardesk");
   }
}