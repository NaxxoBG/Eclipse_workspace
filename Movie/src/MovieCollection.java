import java.util.ArrayList;

public class MovieCollection
{
   private String name;
   private ArrayList<Movie> movies;

   public MovieCollection(String name) {
      this.name = name;
      this.movies = new ArrayList<Movie>();
   }

   public void addMovie(Movie movie) {
      movies.add(movie);
   }

   public Movie getMovie(int index) {
      return movies.get(index);
   }

   public int getNumberOfMovies() {
      return movies.size();
   }

   public ArrayList<ActionMovie> getAllActionMovies() {
      ArrayList<ActionMovie> actions = new ArrayList<>();
      for (Movie movie : movies) {
         if (movie instanceof ActionMovie) {
            actions.add((ActionMovie) movie);
         }
      }
      return actions;
   }

   public ArrayList<Movie> getMoviesWithDuration(int duration) {
      ArrayList<Movie> features = new ArrayList<Movie>();
      for (Movie movie : features) {
         if (movie.getDuration() == duration) {
            features.add(movie);
         }
      }
      return features;
   }

   public ArrayList<Person> getAllOwners() {
      ArrayList<Person> people = new ArrayList<>();
      for (Movie movie : movies) {
         people.add(movie.getOwner());
      }
      return people;
   }

   public ArrayList<Movie> getMoviesThatEveryoneCanWatch() {
      ArrayList<Movie> allmovies = new ArrayList<>();
      for (Movie movie : allmovies) {
         if (movie.getGenre().equals("Comedy")) {
            allmovies.add(movie);
         }
      }
      return allmovies;
   }
}