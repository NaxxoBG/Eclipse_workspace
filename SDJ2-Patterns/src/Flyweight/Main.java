package Flyweight;

public class Main
{
   public static void main(String[] args) {

      for (int i = 0; i < 10000; i++) {
         Soldier soldier = (Soldier) SoldierFactory.getSoldier(NameGenerator.randomIdentifier());
         soldier.setPos(getRandomPos());
         System.out.println(soldier.toString());
      }
   }

   public static int getRandomPos() {
      return (int) (Math.random() * 100);
   }

}