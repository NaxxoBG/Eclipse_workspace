public class ActionMovie extends Movie
{
   public ActionMovie(String title, double duration) {
      super(title, duration);
   }

   public String getGenre() {
      return "Action";
   }
}