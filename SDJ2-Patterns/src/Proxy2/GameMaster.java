package Proxy2;

public class GameMaster implements GameMasterInterface
{
   private Developer dev = new Developer();

   public void move(int x, int y) {
      dev.move(x, y);
   }

   public void levelUp(int i) {
      dev.levelUp(i);
   }

   public void getWeapon(int i) {
      dev.getWeapon(i);
   }
}