public class HorrorMovie extends Movie
{
   private int ageRequiredToWatch;

   public HorrorMovie(String title, double duration, int ageRequiredToWatch) {
      super(title, duration);
      this.ageRequiredToWatch = ageRequiredToWatch;
   }

   public String getTitle() {
      return getTitle();
   }

   public int getAgeRequiredToWatch() {
      return ageRequiredToWatch;
   }

   public String getGenre() {
      return "Action";
   }
}