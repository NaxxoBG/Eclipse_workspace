public class Parrot extends Bird
{
   public Parrot() {}

   public String toString() {
      return  "Roar = " + roar() + ", getClass()=" + getClass();
   }

   public String roar() {
      return "Roar";
   }
}