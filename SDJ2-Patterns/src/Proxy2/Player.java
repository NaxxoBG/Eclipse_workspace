package Proxy2;

public class Player implements PlayerInterface
{
   Developer dev = new Developer();

   public void move(int x, int y) {
      dev.move(x, y);
   }

   public void getWeapon(int i) {
      dev.getWeapon(i);
   }

   public void getExp(int i) {
      dev.getExp(i);
   }
}