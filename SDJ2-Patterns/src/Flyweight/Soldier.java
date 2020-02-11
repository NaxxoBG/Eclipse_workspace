package Flyweight;

public class Soldier
{
   private String name;
   private int pos;

   public Soldier(String name) {
      this.name = name;
   }

   public int getPos() {
      return pos;
   }

   public void setPos(int pos) {
      this.pos = pos;
   }

   public String getName() {
      return name;
   }

   public String toString() {
      return "Soldier [Name: " + name + ", Position: " + pos + "]";
   }
}