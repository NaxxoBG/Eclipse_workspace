public class Guest
{
   // Room ----> Guest (Association)

   private String name;

   public Guest (String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public boolean equals(Object obj) {
      if (!(obj instanceof Guest)) {
         return false;
      } else {
         Guest other = (Guest) obj;
         return name.equals(other.name);
      }
   }
}