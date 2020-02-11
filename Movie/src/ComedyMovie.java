public class ComedyMovie extends Movie
{
   public ComedyMovie(String title, double duration) {
      super(title, duration);
   }

   public String getGenre() {
      return "Comedy";
   }
}