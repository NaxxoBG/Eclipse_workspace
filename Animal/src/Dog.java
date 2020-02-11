public class Dog extends Pet
{
   private String Breed;

   public String speak() {
      return "Vuf";
   }

   public boolean equals(Object o) {
      if (!(o instanceof Dog)) {
         return false;
      } else {
         Dog other = (Dog) o;
         return Breed.equals(other.Breed);
      }
   }

   public String getBreed() {
      return Breed;
   }

   public void setBreed(String breed) {
      Breed = breed;
   }
}