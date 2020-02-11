package observerdp;

public class FeedImpl
{
   public static void main(String[] args) {
      Feed feed = new Feed();
      feed.registerObserver(new NYTimes());
      feed.registerObserver(new Guardian());
      feed.registerObserver(new LeMonde());
      feed.notifyObservers("The queen said her favourite book is Java 8 in action!");
   }
}
