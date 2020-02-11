
public class Guest
{
   private String name;

   public Guest(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public boolean equals(Object obj) {

      if (!(obj instanceof Guest)) {
         return false;
      } else {
         Guest other = (Guest) obj;
         return name.equals(other.name);
      }
   }
   
   public String toString() {
      return String.format("The guest is %s.", name);
   }
}