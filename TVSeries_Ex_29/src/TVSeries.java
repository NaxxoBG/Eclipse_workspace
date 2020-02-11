import java.util.ArrayList;

public class TVSeries
{
   private String title;
   private int numberOfEpisodes;
   private ArrayList<Actor> actors;

   public TVSeries(String title) {
      this.title = title;
      actors = new ArrayList<Actor>();
   }

   public void hireActor(Actor actor) {
      actors.add(actor);
   }

   public String getTitle() {
      return title;
   }

   public int getNumberOfActors() {
      return actors.size();
   }

   public Actor getActor(int index) {
      return actors.get(index);
   }

   public void awardEmmy(String name) {
      for (Actor actor : actors) {
         if(actor.getName().equals(name)) {
            actor.awardEmmy();
         }
      }
   }

   public void makeNextEpisode() {
      numberOfEpisodes++;
   }

   public ArrayList<Actor> getEmmyWinners() {
      ArrayList<Actor> emmys = new ArrayList<>();
      for (Actor actor : actors) {
         if(actor.getNumberOfEmmys() >= 1) {
            emmys.add(actor);
         }
         return emmys;
      }
      return null;
   }

   public String toString() {
      ArrayList<String> names = new ArrayList<>();
      for (Actor actor : actors) {
         names.add(actor.getName());
      }
      return "TVSeries title: " + title + "\nNumber of episodes: "
      + numberOfEpisodes + "\n" + names;
   }
}