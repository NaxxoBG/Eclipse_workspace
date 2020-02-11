public class Lion extends Mammal
{
   public Lion() {};

   public String toString() {
      return "Lion " + super.toString();
   }

   public String roar() {
      return "Roar";
   }
}