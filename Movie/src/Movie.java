public abstract class Movie
{
   private String title;
   private double duration;
   private Person owner;

   public Movie(String title, double duration) {
      this.title = title;
      this.duration = duration;
      this.owner = null;
   }

   public String getTitle() {
      return title;
   }

   public double getDuration() {
      return duration;
   }

   public Person getOwner() {
      return owner;
   }

   public abstract String getGenre();
}