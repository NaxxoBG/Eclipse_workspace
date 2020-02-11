package Observer;

public class FilmObserver implements Observer
{
   private double rating;
   private static int observerIDTracker = 0;
   private int observerID;

   FilmObserver(Subject filmProducer) {
      this.observerID = ++observerIDTracker;
      System.out.println("New observer " + this.observerID);
      filmProducer.register(this);
   }

   public void update(double rating) {
      this.rating = rating;
   }

   public void printRating() {
      if (rating == 0.0) {
        //do nothing
         System.out.println("Observer has been removed");
      } else {
         System.out.println("The rating is " + rating + " -> ObserverID: " + observerID);
      }
   }
}