
public class Programme extends Education
{
   private String level;

   public Programme(String code, String title, String level) {
      super(code, title);
      this.level = level;
   }

   public String getLevel() {
      return level;
   }

   public boolean equals (Object o) {
      if (!(o instanceof Programme)) {
         return false;
      } else {
         Programme other = (Programme) o;
         return super.equals(other) && other.level.equals(level);
      }
   }

   public String toString() {
      return "Programme [level=" + level + "]";
   }
}