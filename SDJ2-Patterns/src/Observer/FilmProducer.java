package Observer;

import java.util.ArrayList;

public class FilmProducer implements Subject
{
   private ArrayList<Observer> observers;
   private double rating;
   
   public FilmProducer() {
      observers = new ArrayList<Observer>();
   }
   
   public void register(Observer o) {
      observers.add(o);
   }

   public void unregister(Observer o) {
      int observerIndex = observers.indexOf(o);
      observers.remove(observerIndex);
   }

   public void notifyAllObservers() {
      for (Observer observer : observers) {
         observer.update(rating);
      }
   }
   
   public void setRating(double newRating) {
      this.rating = newRating;
      notifyAllObservers();
   }
}