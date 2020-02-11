package Observer;

public class ObserverTest
{
   public static void main(String[] args) {
      FilmProducer producer = new FilmProducer();

      FilmObserver observer1 = new FilmObserver(producer);
      FilmObserver observer2 = new FilmObserver(producer);

      /*producer.unregister(observer1);*/

      producer.setRating(2);

      System.out.println();
      observer1.printRating();
      observer2.printRating();
   }
}