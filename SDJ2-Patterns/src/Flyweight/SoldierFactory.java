package Flyweight;

import java.util.HashMap;

public class SoldierFactory
{
   private static final HashMap<String, Soldier> soldierMap = new HashMap<String, Soldier>();

   public static Soldier getSoldier(String name) {
      Soldier soldier = (Soldier) soldierMap.get(name);

      if (soldier == null) {
         soldier = new Soldier(name);
         soldierMap.put(name, soldier);
         System.out.println("Recruiting a soldier - " + name);
      }
      return soldier;
   }
}