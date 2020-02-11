public class School extends Education
{
   private String type;
   public static final String INFANT_SCHOOL = "Infant school";
   public static final String JUNIOR_SCHOOL = "Junior school";
   public static final String SECONDARY_SCHOOL = "Secondary school";
   public static final String HIGH_SCHOOL = "High school";

   public School(String code, String title, String type) {
      super(code, title);
      this.type = type;
   }

   public String getSchoolType() {
      if (type.equalsIgnoreCase(HIGH_SCHOOL)) {
         return HIGH_SCHOOL;
      } else if (type.equalsIgnoreCase(JUNIOR_SCHOOL)) {
         return JUNIOR_SCHOOL; 
      } else if (type.equalsIgnoreCase(SECONDARY_SCHOOL)) {
         return SECONDARY_SCHOOL;
      } else if (type.equalsIgnoreCase(HIGH_SCHOOL)) {
         return HIGH_SCHOOL;
      } else {
         return null;
      }
   }

   public boolean equals (Object o) {
      if (!(o instanceof School)) {
         return false;
      } else {
         School other = (School) o;
         return super.equals(other) && other.type.equals(type);
      }
   }

   public String toString() {
      return "School [type=" + type + "]";
   }
}