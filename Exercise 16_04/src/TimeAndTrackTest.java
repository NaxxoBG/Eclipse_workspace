import java.util.ArrayList;

public class TimeAndTrackTest
{
   public static void main(String[] args)
   {
      Time time1 = new Time(6334);
      System.out.println(time1);

      Time time2 = new Time(1, 35, 27);
      System.out.println(time2.getTimeInSeconds());

      CDTrack track1 = new CDTrack("The Dark Knight Theme","Hanz Zimmer & James", time1);
      System.out.println(track1);
      System.out.println(track1.getLength());

      CDTrack track2 = new CDTrack("Interstellar Theme","Hanz Zimmer", time2);
      System.out.println(track2);
      time2.setTime(3,5,34);
      track2.setArtist("John Williams");
      System.out.println(track2);
      
      ArrayList<CDTrack> album = new ArrayList<CDTrack>();
      album.add(track1);
      album.add(track2);

      System.out.println(album);

      System.out.println("-------------------------------");
      
      CD cd1 = new CD("Soundtracks");
      System.out.println("-------------------------------");
      System.out.println(album.size());
      System.out.println("-------------------------------");
      System.out.println(cd1.getDuration());
   }
}