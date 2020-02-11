public class Frog extends Animal
{
   private String colour;
   
   public String speak() {
      return "Rip-it";
   }
   
   public boolean equals(Object o) {
      if (!(o instanceof Frog)) {
         return false;
      } else {
         Frog other = (Frog) o;
         return colour.equals(other.colour);
      }
   }

   public String getColour() {
      return colour;
   }

   public void setColour(String colour) {
      this.colour = colour;
   }
   
   
}
