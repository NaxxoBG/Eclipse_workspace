public class TVSeries_Test
{
   public static void main(String[] args)
   {
      Actor actor1 = new Actor("Tim");
      Actor actor2 = new Actor("Morgan");
      Actor actor3 = new Actor("Jack");

      TVSeries series = new TVSeries("Follower");
      series.hireActor(actor1);
      actor1.awardEmmy();
      series.awardEmmy("Tim");
      System.out.println(series);
      series.makeNextEpisode();
      System.out.println(series);
      System.out.println(actor1.getNumberOfEmmys());
      actor1.participateInEpisode();
      actor1.participateInEpisode();
      actor1.participateInEpisode();
      System.out.println(actor1.getNumberOfEpisodes());
      series.makeNextEpisode();
      series.makeNextEpisode();
      series.makeNextEpisode();
      System.out.println(series);
      series.hireActor(actor2);
      series.awardEmmy("Morgan");
      System.out.println(series);
      series.hireActor(actor3);

      for (int i = 0; i < series.getEmmyWinners().size(); i++) {
         System.out.println(series.getEmmyWinners().get(i).toString());
      }




   }
}