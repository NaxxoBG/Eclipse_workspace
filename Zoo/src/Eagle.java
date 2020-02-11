public class Eagle extends Bird
{
   public Eagle() {}

   public String toString() {
      return  "Roar = " + roar() + ", getClass()=" + getClass();     
   }
   
   public String roar() {
      return "Roar eagle!";
   }
}