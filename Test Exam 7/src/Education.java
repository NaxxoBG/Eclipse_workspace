public abstract class Education
{
   private String code;
   private String title;

   public Education(String code, String title) {
      this.code = code;
      this.title = title;
   }

   public String getCode() {
      return code;
   }

   public String getTitle() {
      return title;
   }

   public boolean equals (Object o) {
      if (!(o instanceof Education)) {
         return false;
      } else {
         Education other = (Education) o;
         return other.code.equals(code) && other.title.equals(title);
      }  
   }

   public String toString() {
      return "Education [code=" + code + ", title=" + title + "]";
   }
}