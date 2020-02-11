package Proxy2;

public class Developer implements GameMasterInterface, PlayerInterface
{
   public void move(int x, int y, int z) {
      System.out.println("moving x- " + x + "|y: " + y + "|z: " + z);
   }

   public void LevelTo(int i) {
      System.out.println("Leveling up to " + i);
   }

   public void getWeapon() {
      System.out.println("Getting weapon");
   }

   public void levelUp(int i) {
      getExp(i + 1);
   }

   public void getExp(int i) {
      if (i == 100) {
         levelUp(i+1);
      } else {
         System.out.println("Xp - " + i);
      }
   }

   public void getWeapon(int i) {
      switch (i) {
         case 1:
            System.out.println("Getting a sword ");
            break;
         case 2:
            System.out.println("Getting a Gsword");
            break;
         case 3:
            System.out.println("Getting a Dsword");
            break;
         default:
            break;
      }
   }

   public void move(int x, int y) {
      System.out.println("moving x- " + x + "|y: " + y);

   }
}