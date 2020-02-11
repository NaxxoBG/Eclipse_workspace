public class MonitorLizard extends Reptile
{
   public MonitorLizard() {}

   public String toString() {
      return ", roar()=" + roar() + ", getClass()=" + getClass() + ", hashCode() = " + hashCode() + "]";
   }

   public String roar() {
      return "Roar monitor lizard";
   }
}