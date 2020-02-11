public class Cat extends Pet
{
   private boolean isAHouseCat;

   public String speak() {
      return "Miau";
   }
   
   public boolean equals(Object o) {
      if (!(o instanceof Cat)) {
         return false;
      } else {
         Cat other = (Cat) o;
         return isAHouseCat == other.isAHouseCat;
      }
   }

   public boolean isAHouseCat() {
      return isAHouseCat;
   }

   public void setAHouseCat(boolean isAHouseCat) {
      this.isAHouseCat = isAHouseCat;
   }
}