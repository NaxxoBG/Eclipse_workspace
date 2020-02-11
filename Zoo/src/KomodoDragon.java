public class KomodoDragon extends Reptile
{
   public KomodoDragon() {}

   public String toString() {
      return ", roar() = " + roar() + ", getClass() = " + getClass();
   }
   
   public String roar() {
      return "Roar Komodo";
   }
}