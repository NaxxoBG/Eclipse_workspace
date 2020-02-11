public class Turtle extends Reptile
{
   public Turtle() {}

   public String toString() {
      return "Roar() =" + roar()
            + ", getClass()=" + getClass();
   }

   public String roar() {
      return "Roar turtle!";
   }
}